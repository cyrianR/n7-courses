with Ada.Integer_Text_IO;				use Ada.Integer_Text_IO;
with Ada.Text_IO;								use Ada.Text_IO;
with Ada.Long_Float_Text_IO;		use Ada.Long_Float_Text_IO;

package body Ecriture_Fichiers_Resultats is

	procedure Ecrire_Fichier_Poids(Vecteur_Poids : in T_Vecteur_Reel; Prefixe : in Unbounded_String;
	Nb_Pages : in Integer; Alpha : in Long_Float; K : in Integer) is
		Nom_Fichier : Unbounded_String := Prefixe;
		Fichier : Ada.Text_IO.File_Type; 
	begin
		-- créer le fichier de poids
		Append(Nom_Fichier, ".prw");
		Create(Fichier, Out_File, To_String(Nom_Fichier));
		-- écrire dans le fichier poids
		Put(Fichier, Nb_Pages, 1);
		Put(Fichier, " ");
		Put(Fichier, Alpha, 1);
		Put(Fichier, " ");
		Put(Fichier, K, 1);
		New_Line(Fichier);
		for i in 0..Nb_Pages-1 loop
			Put (Fichier, Valeur(Vecteur_Poids, i), 1);
			New_Line(Fichier);
		end loop;
		Close(Fichier);
	end Ecrire_Fichier_Poids;


	procedure Ecrire_Fichier_Rang(Vecteur_Rang : in T_Vecteur_Entier;
	Prefixe : in Unbounded_String; Nb_Pages : in Integer) is
		Nom_Fichier : Unbounded_String := Prefixe;
		Fichier : Ada.Text_IO.File_Type; 
	begin
		-- créer le fichier de PageRank
		Append(Nom_Fichier, ".pr");
		Create(Fichier, Out_File, To_String(Nom_Fichier));
		-- écrire dans le fichier les pages triées
		for i in 0..Nb_Pages-1 loop
			Put (Fichier, Valeur(Vecteur_Rang, i), 1);
			New_Line(Fichier);
		end loop;
		Close(Fichier);
	end Ecrire_Fichier_Rang;

end Ecriture_Fichiers_Resultats;
