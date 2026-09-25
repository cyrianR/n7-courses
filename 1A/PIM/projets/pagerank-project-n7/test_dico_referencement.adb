with Dico_Referencement;
with Mat_Vec;
with Ada.Text_IO;		use Ada.Text_IO;

procedure Test_Dico_Referencement is

	package Nouveau_Mat_Vec is 
		new Mat_Vec(7);
	use Nouveau_Mat_Vec;

	package Nouveau_Dico_Referencement is
		new Dico_Referencement(7, Nouveau_Mat_Vec);
	use Nouveau_Dico_Referencement;

	procedure Test_Dictionnaire_Vide(Dico : in out T_Dico_Referencement) is
	begin
		Put("Test de dictionnaire vide : ");
		Initialiser(Dico);
		for i in 0..6 loop
			-- test nombre de liens égal à 0 pour toute clé
			pragma Assert(Liens(Dico, i) = 0);
			for j in 0..6 loop
				-- test aucune clé ne référence une page
				pragma Assert(not Reference(Dico, i, j));
			end loop;
		end loop;
		Put_Line("Test OK");
	end Test_Dictionnaire_Vide;

	procedure Test_Remplissage_Sans_Doublons(Dico : in out T_Dico_Referencement) is
	begin
		Put("Test de remplissage du dictionnaire sans doublons : ");
		-- remplissage du dictionnaire
		Ajouter_Lien(Dico, 0, 1);
		Ajouter_Lien(Dico, 0, 2);
		Ajouter_Lien(Dico, 2, 0);
		Ajouter_Lien(Dico, 2, 1);
		Ajouter_Lien(Dico, 2, 4);
		Ajouter_Lien(Dico, 3, 4);
		Ajouter_Lien(Dico, 3, 5);
		Ajouter_Lien(Dico, 4, 3);
		Ajouter_Lien(Dico, 4, 5);
		Ajouter_Lien(Dico, 5, 3);
		-- test nombre de liens pour chaque clé
		pragma Assert(Liens(Dico, 0) = 2);
		pragma Assert(Liens(Dico, 1) = 0);
		pragma Assert(Liens(Dico, 2) = 3);
		pragma Assert(Liens(Dico, 3) = 2);
		pragma Assert(Liens(Dico, 4) = 2);
		pragma Assert(Liens(Dico, 5) = 1);
		pragma Assert(Liens(Dico, 6) = 0);
		-- 0 référence 1 et 2
		pragma Assert(Reference(Dico, 0, 1));
		pragma Assert(Reference(Dico, 0, 2));
		-- 0 ne référence pas 0, 3, 4, 5 et 6
		pragma Assert(not Reference(Dico, 0, 0));
		pragma Assert(not Reference(Dico, 0, 3));
		pragma Assert(not Reference(Dico, 0, 4));
		pragma Assert(not Reference(Dico, 0, 5));
		pragma Assert(not Reference(Dico, 0, 6));
		-- test 1 ne référence pas d'autres pages
		pragma Assert(not Reference(Dico, 1, 0));
		pragma Assert(not Reference(Dico, 1, 1));
		pragma Assert(not Reference(Dico, 1, 2));
		pragma Assert(not Reference(Dico, 1, 3));
		pragma Assert(not Reference(Dico, 1, 4));
		pragma Assert(not Reference(Dico, 1, 5));
		pragma Assert(not Reference(Dico, 1, 6));
		-- 2 référence 0, 1 et 4
		pragma Assert(Reference(Dico, 2, 0));
		pragma Assert(Reference(Dico, 2, 1));
		pragma Assert(Reference(Dico, 2, 4));
		-- 2 ne référence pas 2, 3, 5 et 6
		pragma Assert(not Reference(Dico, 2, 2));
		pragma Assert(not Reference(Dico, 2, 3));
		pragma Assert(not Reference(Dico, 2, 5));
		pragma Assert(not Reference(Dico, 2, 6));
		-- 3 référence 4 et 5
		pragma Assert(Reference(Dico, 3, 4));
		pragma Assert(Reference(Dico, 3, 5));
		-- test 3 ne référence pas 0, 1, 2, 3 et 6
		pragma Assert(not Reference(Dico, 3, 0));
		pragma Assert(not Reference(Dico, 3, 1));
		pragma Assert(not Reference(Dico, 3, 2));
		pragma Assert(not Reference(Dico, 3, 3));
		pragma Assert(not Reference(Dico, 3, 6));
		-- test 4 référence 3 et 5
		pragma Assert(Reference(Dico, 4, 3));
		pragma Assert(Reference(Dico, 4, 5));
		-- test 4 ne référence pas 0, 1, 2, 4 et 6
		pragma Assert(not Reference(Dico, 4, 0));
		pragma Assert(not Reference(Dico, 4, 1));
		pragma Assert(not Reference(Dico, 4, 2));
		pragma Assert(not Reference(Dico, 4, 4));
		pragma Assert(not Reference(Dico, 4, 6));
		-- test 5 référence 3
		pragma Assert(Reference(Dico, 5, 3));
		-- test 5 ne référence pas 0, 1, 2, 4, 5 et 6
		pragma Assert(not Reference(Dico, 5, 0));
		pragma Assert(not Reference(Dico, 5, 1));
		pragma Assert(not Reference(Dico, 5, 2));
		pragma Assert(not Reference(Dico, 5, 4));
		pragma Assert(not Reference(Dico, 5, 5));
		pragma Assert(not Reference(Dico, 5, 6));
		-- test 6 ne référence pas d'autres pages
		pragma Assert(not Reference(Dico, 6, 0));
		pragma Assert(not Reference(Dico, 6, 1));
		pragma Assert(not Reference(Dico, 6, 2));
		pragma Assert(not Reference(Dico, 6, 3));
		pragma Assert(not Reference(Dico, 6, 4));
		pragma Assert(not Reference(Dico, 6, 5));
		pragma Assert(not Reference(Dico, 6, 6));
		Put_Line("Test OK");
	end Test_Remplissage_Sans_Doublons;

	procedure Test_Remplissage_Avec_Doublons(Dico : in out T_Dico_Referencement) is
	begin
		Put("Test de remplissage du dictionnaire avec doublons : ");
		-- ajout des doublons
		Ajouter_Lien(Dico, 0, 2);
		Ajouter_Lien(Dico, 3, 5);
		-- test nombre de liens pour chaque clé
		pragma Assert(Liens(Dico, 0) = 2);
		pragma Assert(Liens(Dico, 1) = 0);
		pragma Assert(Liens(Dico, 2) = 3);
		pragma Assert(Liens(Dico, 3) = 2);
		pragma Assert(Liens(Dico, 4) = 2);
		pragma Assert(Liens(Dico, 5) = 1);
		pragma Assert(Liens(Dico, 6) = 0);
		-- 0 référence 1 et 2
		pragma Assert(Reference(Dico, 0, 1));
		pragma Assert(Reference(Dico, 0, 2));
		-- 0 ne référence pas 0, 3, 4, 5 et 6
		pragma Assert(not Reference(Dico, 0, 0));
		pragma Assert(not Reference(Dico, 0, 3));
		pragma Assert(not Reference(Dico, 0, 4));
		pragma Assert(not Reference(Dico, 0, 5));
		pragma Assert(not Reference(Dico, 0, 6));
		-- test 1 ne référence pas d'autres pages
		pragma Assert(not Reference(Dico, 1, 0));
		pragma Assert(not Reference(Dico, 1, 1));
		pragma Assert(not Reference(Dico, 1, 2));
		pragma Assert(not Reference(Dico, 1, 3));
		pragma Assert(not Reference(Dico, 1, 4));
		pragma Assert(not Reference(Dico, 1, 5));
		pragma Assert(not Reference(Dico, 1, 6));
		-- 2 référence 0, 1 et 4
		pragma Assert(Reference(Dico, 2, 0));
		pragma Assert(Reference(Dico, 2, 1));
		pragma Assert(Reference(Dico, 2, 4));
		-- 2 ne référence pas 2, 3, 5 et 6
		pragma Assert(not Reference(Dico, 2, 2));
		pragma Assert(not Reference(Dico, 2, 3));
		pragma Assert(not Reference(Dico, 2, 5));
		pragma Assert(not Reference(Dico, 2, 6));
		-- 3 référence 4 et 5
		pragma Assert(Reference(Dico, 3, 4));
		pragma Assert(Reference(Dico, 3, 5));
		-- test 3 ne référence pas 0, 1, 2, 3 et 6
		pragma Assert(not Reference(Dico, 3, 0));
		pragma Assert(not Reference(Dico, 3, 1));
		pragma Assert(not Reference(Dico, 3, 2));
		pragma Assert(not Reference(Dico, 3, 3));
		pragma Assert(not Reference(Dico, 3, 6));
		-- test 4 référence 3 et 5
		pragma Assert(Reference(Dico, 4, 3));
		pragma Assert(Reference(Dico, 4, 5));
		-- test 4 ne référence pas 0, 1, 2, 4 et 6
		pragma Assert(not Reference(Dico, 4, 0));
		pragma Assert(not Reference(Dico, 4, 1));
		pragma Assert(not Reference(Dico, 4, 2));
		pragma Assert(not Reference(Dico, 4, 4));
		pragma Assert(not Reference(Dico, 4, 6));
		-- test 5 référence 3
		pragma Assert(Reference(Dico, 5, 3));
		-- test 5 ne référence pas 0, 1, 2, 4, 5 et 6
		pragma Assert(not Reference(Dico, 5, 0));
		pragma Assert(not Reference(Dico, 5, 1));
		pragma Assert(not Reference(Dico, 5, 2));
		pragma Assert(not Reference(Dico, 5, 4));
		pragma Assert(not Reference(Dico, 5, 5));
		pragma Assert(not Reference(Dico, 5, 6));
		-- test 6 ne référence pas d'autres pages
		pragma Assert(not Reference(Dico, 6, 0));
		pragma Assert(not Reference(Dico, 6, 1));
		pragma Assert(not Reference(Dico, 6, 2));
		pragma Assert(not Reference(Dico, 6, 3));
		pragma Assert(not Reference(Dico, 6, 4));
		pragma Assert(not Reference(Dico, 6, 5));
		pragma Assert(not Reference(Dico, 6, 6));
		Put_Line("Test OK");
	end Test_Remplissage_Avec_Doublons;

	procedure Test_Vider_Dictionnaire(Dico : in out T_Dico_Referencement) is
	begin
		Put("Test de Vider : ");
		Vider(Dico);
		for i in 0..6 loop
			pragma Assert(Liens(Dico, i) = 0);
			for j in 0..6 loop
				pragma Assert(not Reference(Dico, i, j));
			end loop;
		end loop;
		Put_Line("Test OK");
	end Test_Vider_Dictionnaire;


	Dico : T_Dico_Referencement;
begin

	New_Line;
	Test_Dictionnaire_Vide(Dico);
	Test_Remplissage_Sans_Doublons(Dico);
	Test_Remplissage_Avec_Doublons(Dico);
	Test_Vider_Dictionnaire(Dico);

end Test_Dico_Referencement;
