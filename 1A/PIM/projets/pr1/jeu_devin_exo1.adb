with Text_Io;              use Text_Io;
with Ada.Integer_Text_Io;  use Ada.Integer_Text_Io;
with Alea;

-- Auteur : Ragot Cyrian
--
-- Jouer au jeu du devin avec l'ordinateur lorsque l'utilisateur 
-- devine un nombre entre 1 et 999
procedure Jeu_Devin_Exo1 is

	package Mon_Alea is
		new Alea (1, 999);  -- générateur de nombre dans l'intervalle [1, 999]
	use Mon_Alea;

	Essais: Integer; -- compte les essais de l'utilisateur
	Nombre_Est_Bon: Boolean; -- vrai quand l'utilisateur a trouvé le bon nombre
        Proposition: Integer; -- proposition de réponse de l'utilisateur
	Choix_Ordinateur: Integer; -- le nombre aléatoire choisit par l'ordinateur

begin
	-- Choisir un nombre aléatoire
	Get_Random_Number (Choix_Ordinateur);
        New_Line;
	Put_Line ("J'ai choisi un nombre entre 1 et 999.");
	
        -- Initialiser le jeu
	Essais := 0;
	Nombre_Est_Bon := False;
	
        loop
		Essais := Essais + 1;
		
                -- Demander une proposition
		Put ("Proposition ");
		Put (Essais,1);
		Put (" : ");
		Get (Proposition);
		pragma assert (1 <= Proposition and Proposition <= 999);
		
                -- Répondre au résultat de la proposition
		if Choix_Ordinateur = Proposition then
			Put_Line ("Trouvé.");
			Nombre_Est_Bon := True;
		elsif Choix_Ordinateur < Proposition then
			Put_Line ("Trop grand.");
		else
			Put_Line ("Trop petit.");
		end if;

	        exit when Nombre_Est_Bon;
	end loop;
	
        -- Afficher le message de victoire
	Put ("Bravo. Vous avez trouvé ");
	Put (Choix_Ordinateur,1);
	Put (" en ");
	Put (Essais,1);
	Put_Line (" essais.");
        New_Line;

end Jeu_Devin_Exo1;
