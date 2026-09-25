# PageRank-project-n7



## Robustesse au niveau du fichier graphe

# Cas 1 :
Si une page référencie elle même, pas grave de traiter ce cas car les doublons sont enlevés donc une page ne peut que se référencer une seule fois. Ce n'est pas trop un problème, et le fait de tester chaque page ajouterait du temps de calcul. On n'en tient donc pas compte dans le code.

# Cas 2 :
Si le graphe ne contient pas de pages : seulement un 0 dans le fichier graphe. Ce cas fonctionne correctement avec notre algorithme, aucun poids ou aucune page n'est écrit dans les fichiers résultats.

# Cas 3 : test_01
Si il y a une ligne vide dans le graphe.

# Cas 4 : test_02, test_03 et test_04
Si il y a un autre type qu'un entier dans le fichier graphe ou si c'est un nombre négatif. Dans ce cas on appelle afficher_fichier_valide.





