with Mat_Vec;
with Ada.Strings.Unbounded; use Ada.Strings.Unbounded;

generic

	with package Nouveau_Mat_Vec is new Mat_Vec(<>);
	use Nouveau_Mat_Vec;

package Ecriture_Fichiers_Resultats is

	-- ecrire le fichier résultat contenant la valeur de alpha, de k et les poids triés 
	procedure Ecrire_Fichier_Poids(Vecteur_Poids : in T_Vecteur_Reel; Prefixe : in Unbounded_String;
	Nb_Pages : in Integer; Alpha : in Long_Float; K : in Integer);

	-- ecrire le fichier résultat contenant les pages triés selon leur rang 
	procedure Ecrire_Fichier_Rang(Vecteur_Rang : in T_Vecteur_Entier; 
	Prefixe : in Unbounded_String; Nb_Pages : in Integer);

end Ecriture_Fichiers_Resultats;
