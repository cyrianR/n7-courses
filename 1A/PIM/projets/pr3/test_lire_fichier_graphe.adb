with Ada.Text_IO;		use Ada.Text_IO;
with Ada.Strings.Unbounded; use Ada.Strings.Unbounded;
with Mat_Vec;
with Dico_Referencement;
with Lire_Fichier_Graphe;

procedure Test_Lire_Fichier_Graphe is

	package Nouveau_Mat_Vec is 
		new Mat_Vec(6);

	package Nouveau_Dico_Referencement is new Dico_Referencement(6, Nouveau_Mat_Vec);
	use Nouveau_Dico_Referencement;

	procedure Lire_Graphe_Sujet is new Lire_Fichier_Graphe(Nouveau_Dico_Referencement);

	Dico : T_Dico_Referencement;
	Fichier_Graphe : constant Unbounded_String := To_Unbounded_String("exemples/sujet/sujet.net");
begin
	
	New_Line;
	Put("Test de Lire_Fichier_Graphe : ");

	-- lire le fichier graphe
	Lire_Graphe_Sujet(Fichier_Graphe, Dico);

	-- test nombre de liens pour chaque clé
	pragma Assert(Liens(Dico, 0) = 2);
	pragma Assert(Liens(Dico, 1) = 0);
	pragma Assert(Liens(Dico, 2) = 3);
	pragma Assert(Liens(Dico, 3) = 2);
	pragma Assert(Liens(Dico, 4) = 2);
	pragma Assert(Liens(Dico, 5) = 1);
	-- 0 référence 1 et 2
	pragma Assert(Reference(Dico, 0, 1));
	pragma Assert(Reference(Dico, 0, 2));
	-- 0 ne référence pas 0, 3, 4, 5 et 6
	pragma Assert(not Reference(Dico, 0, 0));
	pragma Assert(not Reference(Dico, 0, 3));
	pragma Assert(not Reference(Dico, 0, 4));
	pragma Assert(not Reference(Dico, 0, 5));
	-- test 1 ne référence pas d'autres pages
	pragma Assert(not Reference(Dico, 1, 0));
	pragma Assert(not Reference(Dico, 1, 1));
	pragma Assert(not Reference(Dico, 1, 2));
	pragma Assert(not Reference(Dico, 1, 3));
	pragma Assert(not Reference(Dico, 1, 4));
	pragma Assert(not Reference(Dico, 1, 5));
	-- 2 référence 0, 1 et 4
	pragma Assert(Reference(Dico, 2, 0));
	pragma Assert(Reference(Dico, 2, 1));
	pragma Assert(Reference(Dico, 2, 4));
	-- 2 ne référence pas 2, 3, 5 et 6
	pragma Assert(not Reference(Dico, 2, 2));
	pragma Assert(not Reference(Dico, 2, 3));
	pragma Assert(not Reference(Dico, 2, 5));
	-- 3 référence 4 et 5
	pragma Assert(Reference(Dico, 3, 4));
	pragma Assert(Reference(Dico, 3, 5));
	-- test 3 ne référence pas 0, 1, 2, 3 et 6
	pragma Assert(not Reference(Dico, 3, 0));
	pragma Assert(not Reference(Dico, 3, 1));
	pragma Assert(not Reference(Dico, 3, 2));
	pragma Assert(not Reference(Dico, 3, 3));
	-- test 4 référence 3 et 5
	pragma Assert(Reference(Dico, 4, 3));
	pragma Assert(Reference(Dico, 4, 5));
	-- test 4 ne référence pas 0, 1, 2, 4 et 6
	pragma Assert(not Reference(Dico, 4, 0));
	pragma Assert(not Reference(Dico, 4, 1));
	pragma Assert(not Reference(Dico, 4, 2));
	pragma Assert(not Reference(Dico, 4, 4));
	-- test 5 référence 3
	pragma Assert(Reference(Dico, 5, 3));
	-- test 5 ne référence pas 0, 1, 2, 4, 5 et 6
	pragma Assert(not Reference(Dico, 5, 0));
	pragma Assert(not Reference(Dico, 5, 1));
	pragma Assert(not Reference(Dico, 5, 2));
	pragma Assert(not Reference(Dico, 5, 4));
	pragma Assert(not Reference(Dico, 5, 5));

	Put_Line("Test OK");

end Test_Lire_Fichier_Graphe;
