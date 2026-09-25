with Mat_Vec;
with Tri_Pages_Poids; 
with Ada.Text_IO;		use Ada.Text_IO;

procedure Test_Tri_Pages_Poids is

	package Mat_Vec_Reel is
		new Mat_Vec(Taille => 6);
	use Mat_Vec_Reel;

	procedure Nouveau_Tri_Pages_Poids is new Tri_Pages_Poids(Mat_Vec_Reel);

	procedure Remplir_Vecteurs_Test(Pages : out T_Vecteur_Entier; Poids : out T_Vecteur_Reel) is
	begin
		for i in 0..5 loop
			Enregistrer(Pages, i, i);
		end loop;
		Enregistrer(Poids, 0.051, 0);
		Enregistrer(Poids, 0.073, 1);
		Enregistrer(Poids, 0.057, 2);
		Enregistrer(Poids, 0.348, 3);
		Enregistrer(Poids, 0.199, 4);
		Enregistrer(Poids, 0.268, 5);
	end Remplir_Vecteurs_Test;

	procedure Test_Tri(Pages : out T_Vecteur_Entier; Poids : out T_Vecteur_Reel) is
	begin
		Put("Test Tri : ");
		Nouveau_Tri_Pages_Poids(Pages, Poids, 6);
		-- test vecteur pages trié
		pragma Assert(Valeur(Pages, 0) = 3);
		pragma Assert(Valeur(Pages, 1) = 5);
		pragma Assert(Valeur(Pages, 2) = 4);
		pragma Assert(Valeur(Pages, 3) = 1);
		pragma Assert(Valeur(Pages, 4) = 2);
		pragma Assert(Valeur(Pages, 5) = 0);
		-- test vecteurs poids trié
		pragma Assert(Valeur(Poids, 0) = 0.348);
		pragma Assert(Valeur(Poids, 1) = 0.268);
		pragma Assert(Valeur(Poids, 2) = 0.199);
		pragma Assert(Valeur(Poids, 3) = 0.073);
		pragma Assert(Valeur(Poids, 4) = 0.057);
		pragma Assert(Valeur(Poids, 5) = 0.051);
		Put_Line("Test OK");
	end Test_Tri;

	Pages : T_Vecteur_Entier;
	Poids : T_Vecteur_Reel;
begin
	
	New_Line;
	Remplir_Vecteurs_Test(Pages, Poids);
	Test_Tri(Pages, Poids);

end Test_Tri_Pages_Poids;
