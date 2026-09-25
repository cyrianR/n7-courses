with Mat_Vec;

generic

	Nombre_Pages : Integer;

	with package Nouveau_Mat_Vec is new Mat_Vec(<>);
	use Nouveau_Mat_Vec;

package Dico_Referencement is

	type T_Dico_Referencement is limited private;

	-- initialise un dictionnaire dont aucune page n'en reference une autre
	procedure Initialiser(Dico : out T_Dico_Referencement);

	-- modifie le dictionnaire pour correspondre au fait que Page_Cle reference Page_Referencee
	procedure Ajouter_Lien(Dico : in out T_Dico_Referencement; Page_Cle : in Integer; 
		Page_Referencee : in Integer);

	-- indique le nombre de Pages distinctes vers laquelle pointe Page_Cle
	function Liens(Dico : in T_Dico_Referencement; Page_Cle : in Integer) return Integer;

	-- indique si la page Page_Cle reference Page_Referencee
	function Reference(Dico : in  T_Dico_Referencement; Page_Cle : in Integer; 
		Page_Referencee : in Integer) return Boolean;

	-- vide un dictionnaire en supprimant toutes les Sda qu'il contient et en supprimant les clés
	procedure Vider(Dico : in out T_Dico_Referencement);

	-- remplir la matrice utile au pagerank à partir du dictionnaire de référencement
	procedure Remplir_Matrice(Dico : in T_Dico_Referencement; Mat : in out T_Matrice);

private

	type T_Cellule;

	type T_LCA is access T_Cellule;

	type T_Cellule is
		record
			Page : Integer;
			Suivant : T_LCA;
		end record;

	type T_Valeur is
		record
			Nb_Liens : Integer;      -- nombre de liens vers des pages distinctes
			Pages_Ref : T_LCA;       -- sda d'entiers uniques qui sont les pages referencees
		end record;

	-- le dictionnaire de référencement admet comme clés les pages du graphe et admet comme valeurs 
	-- une sda des pages référencées et le nombre de pages référencées par la page clé
	type T_Dico_Referencement is array (0..Nombre_Pages-1) of T_Valeur;

end Dico_Referencement;
