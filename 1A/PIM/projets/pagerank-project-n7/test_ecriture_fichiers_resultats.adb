with Mat_Vec;
with ecriture_fichiers_resultats;
with Ada.Text_IO;		use Ada.Text_IO;
with Ada.Strings.Unbounded; use Ada.Strings.Unbounded;

procedure Test_Ecriture_Fichiers_Resultats is

	package Mat_Vec_Reel is
		new Mat_Vec(Taille => 5);
	use Mat_Vec_Reel;

	package Nouveau_Ecriture_Fichiers_Resultats is new Ecriture_Fichiers_Resultats(Mat_Vec_Reel);
	use Nouveau_Ecriture_Fichiers_Resultats;

	Vec_Entier : T_Vecteur_Entier;
	Vec_Reel : T_Vecteur_Reel;
	Prefixe : constant Unbounded_String := To_Unbounded_String("output_test_ecriture");
begin

	New_Line;

	Put("Test de Ecriture_Fichiers_Resultats : ");
	-- remplir les vecteurs
	Enregistrer(Vec_Entier, 2, 0);
	Enregistrer(Vec_Entier, 54, 1);
	Enregistrer(Vec_Entier, 8, 2);
	Enregistrer(Vec_Entier, 785, 3);
	Enregistrer(Vec_Entier, 12, 4);
	Enregistrer(Vec_Reel, 3.4854, 0);
	Enregistrer(Vec_Reel, 546.67, 1);
	Enregistrer(Vec_Reel, 0.981, 2);
	Enregistrer(Vec_Reel, 45.3567, 3);
	Enregistrer(Vec_Reel, 1.677777, 4);
	-- ecrire les fichiers résultats
	Ecrire_Fichier_Poids(Vec_Reel, Prefixe, 5, 0.85, 150);
	Ecrire_Fichier_Rang(Vec_Entier, Prefixe, 5);
	Put_Line("Test FIN");

end Test_Ecriture_Fichiers_Resultats;
