with Ada.Strings.Unbounded; use Ada.Strings.Unbounded;
with Dico_Referencement;

generic
	with package Mon_Dico_Referencement is new Dico_Referencement(<>);
	use Mon_Dico_Referencement;
-- remplissage du dictionnaire de référencement des pages à partir du fichier graphe fournit
procedure Lire_Fichier_Graphe(Fichier_Graphe : in Unbounded_String; 
Dico_Ref : out T_Dico_Referencement);
