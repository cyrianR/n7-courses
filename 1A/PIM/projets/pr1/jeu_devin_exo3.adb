with Text_Io;              use Text_Io;
with Ada.Integer_Text_Io;  use Ada.Integer_Text_Io;
with Jeu_Devin_Exo1;
with Jeu_Devin_Exo2;

-- Auteur : RAGOT Cyrian 
--
-- Jouer au jeu du devin
procedure Jeu_Devin_Exo3 is

        Jeu_Quitte: Boolean; -- vrai lorsque le joueur pressera "O" dans le menu
        Choix_Jeu: Integer; -- choix du jeu fourni par l'utilisateur dans le menu

begin

        Jeu_Quitte := False;
        loop 
                -- Afficher le menu
                New_Line;
                Put_Line ("1- L'ordinateur choisit un nombre et vous le devinez");
                Put_Line ("2- Vous choisissez un nombre et l'ordinateur le devine");
                Put_Line ("0- Quitter le programme");
                Put ("Votre choix : ");
                
                Get (Choix_Jeu);
                Skip_Line;
                -- Traiter le choix de jeu fourni par l'utilisateur
                if Choix_Jeu = 1 then
                        Jeu_Devin_Exo1;
                elsif Choix_Jeu = 2 then
                        Jeu_Devin_Exo2;
                elsif Choix_Jeu = 0 then
                        Jeu_Quitte := true;
                else
                        Put_Line ("Choix incorrect.");
                end if;

                exit when Jeu_Quitte;
        end loop;
	
end Jeu_Devin_Exo3;
