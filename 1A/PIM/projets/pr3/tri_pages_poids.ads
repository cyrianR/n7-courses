with Mat_Vec;

generic

	with package Nouveau_Mat_Vec is new Mat_Vec(<>);
	use Nouveau_Mat_Vec;

-- tri (quick sort) décroissant des vecteurs pages et poids selon les valeurs des poids 
procedure Tri_Pages_Poids(Pages : out T_Vecteur_Entier; Poids : in out T_Vecteur_Reel;
	Nb_Pages : in Integer);
