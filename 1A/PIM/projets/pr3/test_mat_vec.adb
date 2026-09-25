with Mat_Vec;
with Ada.Text_IO;		use Ada.Text_IO;

procedure Test_Mat_Vec is

	package Nouveau_Mat_Vec is
		new Mat_Vec(Taille => 3);
	use Nouveau_Mat_Vec;
		
	procedure Test_Initialiser_Valeur(Vec1 : in out T_Vecteur_Reel; Vec3 : in out T_Vecteur_Entier;
		Mat1 : in out T_Matrice; Mat2 : out T_Matrice) is
	begin
		Put("Test de Initialiser et de Valeur : ");
		Initialiser(Vec1, 1.0);
		Initialiser(Vec3, 1);
		Initialiser(Mat1, 1.0);
		Initialiser(Mat2, 2.0);
		pragma Assert(Valeur(Vec1, 0) = 1.0);
		pragma Assert(Valeur(Vec1, 1) = 1.0);
		pragma Assert(Valeur(Vec1, 2) = 1.0);
		pragma Assert(Valeur(Vec3, 0) = 1);
		pragma Assert(Valeur(Vec3, 1) = 1);
		pragma Assert(Valeur(Vec3, 2) = 1);
		pragma Assert(Valeur(Mat1, 0, 0) = 1.0);
		pragma Assert(Valeur(Mat1, 1, 0) = 1.0);
		pragma Assert(Valeur(Mat1, 2, 0) = 1.0);
		pragma Assert(Valeur(Mat1, 0, 1) = 1.0);
		pragma Assert(Valeur(Mat1, 1, 1) = 1.0);
		pragma Assert(Valeur(Mat1, 2, 1) = 1.0);
		pragma Assert(Valeur(Mat1, 0, 2) = 1.0);
		pragma Assert(Valeur(Mat1, 1, 2) = 1.0);
		pragma Assert(Valeur(Mat1, 2, 2) = 1.0);
		Put_Line("Test OK");
	end Test_Initialiser_Valeur;

	procedure Test_Enregistrer(Vec1 : in out T_Vecteur_Reel; Vec3 : in out T_Vecteur_Entier; Mat1 : in out T_Matrice) is
	begin
		Put("Test de Enregistrer : ");
		Enregistrer(Mat1, 2.0, 0, 0);
		Enregistrer(Mat1, 3.0, 2, 2);
		Enregistrer(Vec1, 2.0, 0);
		Enregistrer(Vec1, 3.0, 2);
		Enregistrer(Vec3, 2, 0);
		Enregistrer(Vec3, 3, 2);
		pragma Assert(Valeur(Vec1, 0) = 2.0);
		pragma Assert(Valeur(Vec1, 1) = 1.0);
		pragma Assert(Valeur(Vec1, 2) = 3.0);
		pragma Assert(Valeur(Vec3, 0) = 2);
		pragma Assert(Valeur(Vec3, 1) = 1);
		pragma Assert(Valeur(Vec3, 2) = 3);
		pragma Assert(Valeur(Mat1, 0, 0) = 2.0);
		pragma Assert(Valeur(Mat1, 1, 0) = 1.0);
		pragma Assert(Valeur(Mat1, 2, 0) = 1.0);
		pragma Assert(Valeur(Mat1, 0, 1) = 1.0);
		pragma Assert(Valeur(Mat1, 1, 1) = 1.0);
		pragma Assert(Valeur(Mat1, 2, 1) = 1.0);
		pragma Assert(Valeur(Mat1, 0, 2) = 1.0);
		pragma Assert(Valeur(Mat1, 1, 2) = 1.0);
		pragma Assert(Valeur(Mat1, 2, 2) = 3.0);
		Put_Line("Test OK");
	end Test_Enregistrer;

	procedure Test_Multiplier_Scalaire(Mat1 : in out T_Matrice) is
	begin
		Put("Test de Multiplier_Scalaire : ");
		Multiplier_Scalaire(Mat1, 2.0);
		pragma Assert(Valeur(Mat1, 0, 0) = 4.0);
		pragma Assert(Valeur(Mat1, 1, 0) = 2.0);
		pragma Assert(Valeur(Mat1, 2, 0) = 2.0);
		pragma Assert(Valeur(Mat1, 0, 1) = 2.0);
		pragma Assert(Valeur(Mat1, 1, 1) = 2.0);
		pragma Assert(Valeur(Mat1, 2, 1) = 2.0);
		pragma Assert(Valeur(Mat1, 0, 2) = 2.0);
		pragma Assert(Valeur(Mat1, 1, 2) = 2.0);
		pragma Assert(Valeur(Mat1, 2, 2) = 6.0);
		Put_Line("Test OK");
	end Test_Multiplier_Scalaire;

	procedure Test_Sommer(Mat1 : in out T_Matrice; Mat2 : in T_Matrice) is
	begin
		Put("Test de Sommer : ");
		Sommer(Mat1, Mat2);
		pragma Assert(Valeur(Mat1, 0, 0) = 6.0);
		pragma Assert(Valeur(Mat1, 1, 0) = 4.0);
		pragma Assert(Valeur(Mat1, 2, 0) = 4.0);
		pragma Assert(Valeur(Mat1, 0, 1) = 4.0);
		pragma Assert(Valeur(Mat1, 1, 1) = 4.0);
		pragma Assert(Valeur(Mat1, 2, 1) = 4.0);
		pragma Assert(Valeur(Mat1, 0, 2) = 4.0);
		pragma Assert(Valeur(Mat1, 1, 2) = 4.0);
		pragma Assert(Valeur(Mat1, 2, 2) = 8.0);
		Put_Line("Test OK");
	end Test_Sommer;

	procedure Test_Produit(Vec1 : in out T_Vecteur_Reel; Mat1 : in T_Matrice) is
	begin
		Put("Test de Produit : ");
		Produit(Vec1, Mat1,0.85);
		pragma Assert(Valeur(Vec1, 0) = 28.0);
		pragma Assert(Valeur(Vec1, 1) = 24.0);
		pragma Assert(Valeur(Vec1, 2) = 36.0);
		Put_Line("Test OK");
	end Test_Produit;

	procedure Test_Copier(Vec1 : in T_Vecteur_Reel; Vec2 : in out T_Vecteur_Reel) is
	begin
		Put("Test de Copier : ");
		Copier(Vec1, Vec2);
		pragma Assert(Valeur(Vec2, 0) = 28.0);
		pragma Assert(Valeur(Vec2, 1) = 24.0);
		pragma Assert(Valeur(Vec2, 2) = 36.0);
		Put_Line("Test OK");
	end Test_Copier;

	procedure Test_Echanger(Vec1 : in out T_Vecteur_Reel; Vec3 : in out T_Vecteur_Entier) is
	begin
		Put("Test de Echanger : ");
		Echanger(Vec1, 0, 2);
		Echanger(Vec3, 0, 2);
		pragma Assert(Valeur(Vec1, 0) = 36.0);
		pragma Assert(Valeur(Vec1, 1) = 24.0);
		pragma Assert(Valeur(Vec1, 2) = 28.0);
		pragma Assert(Valeur(Vec3, 0) = 3);
		pragma Assert(Valeur(Vec3, 1) = 1);
		pragma Assert(Valeur(Vec3, 2) = 2);
		Put_Line("Test OK");
	end Test_Echanger;

	procedure Test_Distance(Vec1 : in out T_Vecteur_Reel; Vec2 : in out T_Vecteur_Reel) is
	begin
		Put("Test de Distance : ");
		Enregistrer(Vec1, 10.0, 0);
		Enregistrer(Vec1, 20.0, 1);
		Enregistrer(Vec1, 30.0, 2);
		Enregistrer(Vec2, 10.0, 0);
		Enregistrer(Vec2, 20.0, 1);
		Enregistrer(Vec2, 30.0, 2);
		pragma Assert(Distance(Vec1, Vec2) = 0.0);
		Enregistrer(Vec1, 20.0, 2);
		pragma Assert(Distance(Vec1, Vec2) = 10.0);
		Enregistrer(Vec1, 30.0, 2);
		Enregistrer(Vec2, 20.0, 2);
		pragma Assert(Distance(Vec1, Vec2) = 10.0);
		Enregistrer(Vec1, -5.0, 0);
		Enregistrer(Vec1, -50.0, 1);
		Enregistrer(Vec1, 30.0, 2);
		Enregistrer(Vec2, 5.0, 0);
		Enregistrer(Vec2, 30.0, 1);
		Enregistrer(Vec2, -20.0, 2);
		pragma Assert(Distance(Vec1, Vec2) = 80.0);
		Put_Line("Test OK");
	end Test_Distance;

	procedure Test_Initialiser_Valeur_Creux(Vec : in out T_Vecteur_Reel; Mat : in out T_Matrice) is 
	begin
		Put("Test de Initialiser : ");
		Initialiser(Vec, 2.0);
		Initialiser(Mat, 0.0);
		pragma Assert(Valeur(Vec, 0) = 2.0);
		pragma Assert(Valeur(Vec, 1) = 2.0);
		pragma Assert(Valeur(Vec, 2) = 2.0);
		pragma Assert(Valeur(Mat, 0, 0) = 0.0);
		pragma Assert(Valeur(Mat, 1, 0) = 0.0);
		pragma Assert(Valeur(Mat, 2, 0) = 0.0);
		pragma Assert(Valeur(Mat, 0, 1) = 0.0);
		pragma Assert(Valeur(Mat, 1, 1) = 0.0);
		pragma Assert(Valeur(Mat, 2, 1) = 0.0);
		pragma Assert(Valeur(Mat, 0, 2) = 0.0);
		pragma Assert(Valeur(Mat, 1, 2) = 0.0);
		pragma Assert(Valeur(Mat, 2, 2) = 0.0);
		Put_Line("Test OK");
	end Test_Initialiser_Valeur_Creux;

	procedure Test_Enregistrer_Creux(Mat : in out T_Matrice) is 
	begin
		Put("Test de Enregistrer : ");				
		Enregistrer(Mat, 2.0, 0, 0);
		Enregistrer(Mat, 1.0, 0, 2);
		Enregistrer(Mat, 3.0, 2, 2);
		Enregistrer(Mat, 4.0, 2, 1);
		pragma Assert(Valeur(Mat, 0, 0) = 2.0);
		pragma Assert(Valeur(Mat, 1, 0) = 0.0);
		pragma Assert(Valeur(Mat, 2, 0) = 0.0);
		pragma Assert(Valeur(Mat, 0, 1) = 0.0);
		pragma Assert(Valeur(Mat, 1, 1) = 0.0);
		pragma Assert(Valeur(Mat, 2, 1) = 4.0);
		pragma Assert(Valeur(Mat, 0, 2) = 1.0);
		pragma Assert(Valeur(Mat, 1, 2) = 0.0);
		pragma Assert(Valeur(Mat, 2, 2) = 3.0);
		Put_Line("Test OK");
	end Test_Enregistrer_Creux;

	procedure Test_Multiplier_Scalaire_Creux(Mat : in out T_Matrice) is 
	begin
		Put("Test de Multiplier_Scalaire : ");
		Multiplier_Scalaire(Mat, 2.0);
		pragma Assert(Valeur(Mat, 0, 0) = 4.0);
		pragma Assert(Valeur(Mat, 1, 0) = 0.0);
		pragma Assert(Valeur(Mat, 2, 0) = 0.0);
		pragma Assert(Valeur(Mat, 0, 1) = 0.0);
		pragma Assert(Valeur(Mat, 1, 1) = 0.0);
		pragma Assert(Valeur(Mat, 2, 1) = 8.0);
		pragma Assert(Valeur(Mat, 0, 2) = 2.0);
		pragma Assert(Valeur(Mat, 1, 2) = 0.0);
		pragma Assert(Valeur(Mat, 2, 2) = 6.0);
		Put_Line("Test OK");
	end Test_Multiplier_Scalaire_Creux;

	procedure Test_Produit_Creux(Vec : in out T_Vecteur_Reel; Mat : in T_Matrice) is 
	begin
		Put("Test de Produit : ");
		Produit(Vec, Mat, 0.85);
		pragma Assert(Float(Valeur(Vec, 0)) = Float(8.76666666666667E+00));
		pragma Assert(Float(Valeur(Vec, 1)) = Float(1.67666666666667E+01));
		pragma Assert(Float(Valeur(Vec, 2)) = Float(1.66666666666667E+01));
		Put_Line("Test OK");
	end Test_Produit_Creux;

	Vecteur_Reel_1 : T_Vecteur_Reel;
	Vecteur_Reel_2 : T_Vecteur_Reel;
	Vecteur_Entier : T_Vecteur_Entier;
	Matrice_Pleine_1 : T_Matrice(True);
	Matrice_Pleine_2 : T_Matrice(True);
	Matrice_Creuse_1 : T_Matrice(False);
begin

	New_Line;
	Put_Line("Début des tests de matrice pleine et vecteurs");
	Test_Initialiser_Valeur(Vecteur_Reel_1, Vecteur_Entier, Matrice_Pleine_1, Matrice_Pleine_2);
	Test_Enregistrer(Vecteur_Reel_1, Vecteur_Entier, Matrice_Pleine_1);
	Test_Multiplier_Scalaire(Matrice_Pleine_1);
	Test_Sommer(Matrice_Pleine_1, Matrice_Pleine_2);
	Test_Produit(Vecteur_Reel_1, Matrice_Pleine_1);
	Test_Copier(Vecteur_Reel_1, Vecteur_Reel_2);
	Test_Echanger(Vecteur_Reel_1, Vecteur_Entier);
	Test_Distance(Vecteur_Reel_1, Vecteur_Reel_2);
	
	New_Line;
	Put_Line("Début des tests de matrice creuse");
	Test_Initialiser_Valeur_Creux(Vecteur_Reel_1, Matrice_Creuse_1);
	Test_Enregistrer_Creux(Matrice_Creuse_1);
	Test_Multiplier_Scalaire_Creux(Matrice_Creuse_1);
	Test_Produit_Creux(Vecteur_Reel_1, Matrice_Creuse_1);

end Test_Mat_Vec;
