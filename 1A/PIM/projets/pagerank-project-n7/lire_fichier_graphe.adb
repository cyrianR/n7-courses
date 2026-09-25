with Ada.Text_IO;						use Ada.Text_IO;
with Ada.Integer_Text_IO;		use Ada.Integer_Text_IO;
with Ada.IO_Exceptions;	
with PageRank_Exceptions;		use PageRank_Exceptions;

procedure Lire_Fichier_Graphe(Fichier_Graphe : in Unbounded_String;
Dico_Ref : out T_Dico_Referencement) is
	
	Fichier : Ada.Text_IO.File_Type;
	Page_Source : Integer;
	Page_Liee : Integer;
	Nb_Pages : Integer;
begin
	
	-- ouvrir le fichier en mode lecture
	Open(Fichier, In_File, To_String(Fichier_Graphe));
	
	-- passer la première ligne du fichier contenant le nombre de pages
	Get (Fichier, Nb_Pages);

	-- initiliaser le dictionnaire de référencement
	Initialiser(Dico_Ref);
		
	-- enregistrer les pages et leurs liens dans le dictionnaire de référencement
	while not End_Of_File(Fichier) loop
		Get (Fichier, Page_Source);
		Get (Fichier, Page_Liee);
		Ajouter_Lien(Dico_Ref, Page_Source, Page_Liee);
	end loop;
		
	-- fermer le fichier
	Close (Fichier);

exception 
	when Ada.Text_IO.End_Error =>
		null;
	when Ada.IO_Exceptions.Data_Error => raise Fichier_Graphe_Exception;

end Lire_Fichier_Graphe;


