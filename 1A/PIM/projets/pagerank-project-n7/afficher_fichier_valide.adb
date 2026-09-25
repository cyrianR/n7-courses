with Ada.Text_IO;						use Ada.Text_IO;

procedure Afficher_Fichier_Valide is
begin

	New_Line;
	Put_Line("Forme d'un fichier graphe valide : ");
	New_Line;
	Put_Line("[Nombre de pages du graphe]");
	Put_Line("[Page qui référence] [Page Référencée]");
	Put_Line("[Page qui référence] [Page Référencée]");
	Put_Line("[Page qui référence] [Page Référencée]");
	Put_Line(". . .");
	New_Line;
	Put_Line("Exemple de fichier graphe : ");
	New_Line;
	Put_Line("6");
	Put_Line("0 1");
	Put_Line("0 2");
	Put_Line("2 0");
	Put_Line("2 1");
	Put_Line("2 4");
	Put_Line("3 4");
	Put_Line("3 5");
	Put_Line("4 3");
	Put_Line("4 5");
	Put_Line("5 3");
	New_Line;

end Afficher_Fichier_Valide;
