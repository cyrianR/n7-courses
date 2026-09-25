#include <bits/types/sigset_t.h>
#include <stdio.h>
#include <stdlib.h>
#include "readcmd.h"
#include <stdbool.h>
#include <string.h>
#include <time.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <signal.h>
#include <fcntl.h>

/* Pid du processus en avant plan.
 * Vaut -1 lorsqu'il n'y a pas de processus en avant plan. */
int pid_avant_plan = -1;

/* Traitement du signal SIGCHLD. */
void traitement_SIGCHLD(int sig) {
    int status;
    pid_t pid_fils;

    if (sig != SIGCHLD) {
        perror("Signal différent de SIGCHILD");
        exit(EXIT_FAILURE);
    }

    while ((pid_fils = waitpid(-1, &status,  WNOHANG|WUNTRACED|WCONTINUED)) > 0) {
        if (WIFEXITED(status)) {
            printf("Le processus %d s'est terminé.\n", pid_fils);
            if (pid_fils == pid_avant_plan) {pid_avant_plan = -1;}
        } else if (WIFSIGNALED(status)) {
            printf("Le processus %d a été terminé par un signal.\n", pid_fils);
            if (pid_fils == pid_avant_plan) {pid_avant_plan = -1;}
        } else if (WIFSTOPPED(status)) {
            printf("Le processus %d a été stoppé par un signal.\n", pid_fils);
            if (pid_fils == pid_avant_plan) {pid_avant_plan = -1;}
        } else if (WIFCONTINUED(status)) {
            printf("Le processus %d a été repris par un signal.\n", pid_fils);
        }
    }
}

/* Traitement signal SIGONT. */
void traitement_SIGINT() {
    //printf("Processus fils terminé.\n");
}

/* Traitement signal SIGTSTP. */
void traitement_SIGTSTP() {
    //printf("Processu fils suspendu.\n");
}

/* Activer les handlers des signaux. */
sigset_t handlers_signaux() {
    struct sigaction new_action;
    new_action.sa_handler = traitement_SIGCHLD;
    sigemptyset (&new_action.sa_mask);
    new_action.sa_flags = SA_RESTART;
    sigaction(SIGCHLD, &new_action, NULL);

    // ignorer les signaux

    // SOLUTION 1
    /*
    struct sigaction action_ctrlC;
    action_ctrlC.sa_handler = traitement_SIGINT;
    sigemptyset(&action_ctrlC.sa_mask);
    action_ctrlC.sa_flags = SA_RESTART;
    sigaction(SIGINT, &action_ctrlC, NULL);

    struct sigaction action_ctrlZ;
    action_ctrlZ.sa_handler = traitement_SIGTSTP;
    sigemptyset(&action_ctrlZ.sa_mask);
    action_ctrlZ.sa_flags = SA_RESTART;
    sigaction(SIGTSTP, &action_ctrlZ, NULL);
    
    signal(SIGINT, SIG_IGN);
    signal(SIGTSTP, SIG_IGN); */
    
    // SOLUTION 2
    /*
    signal(SIGINT, traitement_SIGINT);
    signal(SIGTSTP, traitement_SIGTSTP); */
    
    // SOLUTION 3
    sigset_t sigset;
    sigaddset(&sigset, SIGINT);
    sigaddset(&sigset, SIGTSTP);
    sigprocmask(SIG_BLOCK, &sigset, NULL);
    return sigset;
}

/* Code du fils. */
void traitement_fils(struct cmdline *commande, char** cmd, sigset_t sigset, int p[2], int p0, bool debut, bool fin) {
    // gestion pipe
    if(debut && !fin) {
        dup2(p[1], STDOUT_FILENO);
        close(p[0]);
    } else if (fin && !debut) {
        dup2(p0, STDIN_FILENO);
        close(p[0]);
        close(p[1]);
    } else if (!debut && !fin) {
        dup2(p0, STDIN_FILENO);
        dup2(p[1], STDOUT_FILENO);
        close(p[0]);
    }
    // debloquer signal pour fils
    sigprocmask(SIG_UNBLOCK, &sigset, NULL);
    // fils en arriere plan dans un autre groupe
    if (commande->backgrounded != NULL) {
        setpgrp();
    }
    // redirection sortie standard
	if (commande->out != NULL) {
        int dest = open(commande->out, O_WRONLY | O_CREAT | O_TRUNC, 0644);
        if (dest == -1) {
            perror("Erreur pour l'ouverture du fichier de sortie");
            exit(EXIT_FAILURE);
        }
        if (dup2(dest, STDOUT_FILENO) == -1) {
            perror("Erreur de redirection de la sortie standard");
            exit(EXIT_FAILURE);
        }
        close(dest);
    }
    // redirection entrée standard
    if (commande->in != NULL) {
        int src = open(commande->in, O_RDONLY);
        if (src == -1) {
            perror("Erreur pour l'ouverture du fichier d'entrée");
            exit(EXIT_FAILURE);
        }
        if (dup2(src, STDIN_FILENO) == -1) {
            perror("Erreur de redirection de l'entrée standard");
            exit(EXIT_FAILURE);
        }
        close(src);
    }
    // executer commande
    if (execvp(cmd[0], cmd) == -1) {
		perror("Erreur lors de l'execution de la commande.");
		exit(EXIT_FAILURE);
	}
	exit(0);
}

/* Code du père. */
void traitement_pere(int p[2], bool debut, bool fin) {
    // gestion pipe
    if (debut && !fin) {
        close(p[1]);
    } else if (fin && !debut) {
        close(p[0]);
        close(p[1]);
    } else if (!fin && !debut) {
        close(p[1]);
    }
}

/* Traiter la ligne de commande entrée. */
void traitement_commande(struct cmdline *commande, bool* fini, sigset_t sigset) {
    int indexseq= 0;
    char **cmd; // commande actuelle
    int p0; // descripteur de sortie du dernier tube, liaison entre les commandes
    int p[2]; // tube actuel
    while ((cmd= commande->seq[indexseq])) {
        // vrai lorsque la commande est la première de la chaine de pipe
        bool debut = indexseq == 0;
        // vrai lorsque la command est la dernière de la chaine de pipe
        bool fin = (commande->seq[indexseq + 1]) == NULL;

        if (cmd[0]) {
            if (strcmp(cmd[0], "exit") == 0) {
                *fini= true;
                printf("Au revoir ...\n");
            } else {
                // creation du tube si la commande est intermédiaire dans la chaine de pipe
                p0 = p[0];
                if (!debut || !fin) {
                    if(pipe(p) == -1) {
                        perror("Erreur lors de la création du pipe");
                        exit(EXIT_FAILURE);
                    }
                }

                // création processus fils
                pid_t pid_fils;
				pid_fils = fork();
				switch(pid_fils) {
					case -1:
    					perror("Erreur lors de la création du processus fils.");
	    				exit(EXIT_FAILURE);
						break;
					case 0:
						// code fils
                        traitement_fils(commande, cmd, sigset, p, p0, debut, fin);
                        break;
                    default:
                        // code pere
                        traitement_pere(p, debut, fin);        
                        break;
				}

                // attendre la commande en avant plan
				if (commande->backgrounded == NULL) {
                    pid_avant_plan = pid_fils;
                    while (pid_avant_plan > 0) {
                        pause();
                    }
                }
                printf("\n");							
            }
            indexseq++;
        }
    }
}

int main(void) {
    setpgrp(); // changer le minishell de groupe pour les signaux
    sigset_t sigset = handlers_signaux();
    bool fini= false;

    while (!fini) {
        printf("> ");
        struct cmdline *commande= readcmd();

        if (commande == NULL) {
            // commande == NULL -> erreur readcmd()
            perror("erreur lecture commande \n");
            exit(EXIT_FAILURE);
        } else {
            if (commande->err) {
                // commande->err != NULL -> commande->seq == NULL
                printf("erreur saisie de la commande : %s\n", commande->err);
            } else {
                traitement_commande(commande, &fini, sigset);
            }
        }
    }
    return EXIT_SUCCESS;
}

