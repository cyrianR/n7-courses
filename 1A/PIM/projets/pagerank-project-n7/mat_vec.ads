generic
	Taille : Integer;
package Mat_Vec is

	type T_Matrice(Pleine : Boolean) is limited private;
	type T_Vecteur_Reel is limited private;
	type T_Vecteur_Entier is limited private;

	-- vide une matrice creuse, ne fais rien pour une matrice pleine
	procedure Vider(Mat : in out T_Matrice);

	-- initialise une matrice contenant exclusivement le nombre Scalaire
	procedure Initialiser(Mat : out T_Matrice; Scalaire : in Long_Float);

	-- initialise un vecteur reel contenant exclusivement le nombre Scalaire
	procedure Initialiser(Vec : out T_Vecteur_Reel; Scalaire : in Long_Float);

	-- initialise un vecteur entier contenant exclusivement le nombre Scalaire
	procedure Initialiser(Vec : out T_Vecteur_Entier; Scalaire : in Integer);

	-- enregistre la valeur Scalaire à l'indice (I,J) de la matrice Mat
	procedure Enregistrer(Mat : in out T_Matrice; Scalaire : in Long_Float; I : in Integer; J : in Integer) with
		Post => Valeur(Mat,I,J) = Scalaire;  

	-- enregistre la valeur Scalaire à l'indice I d'un vecteur reel
	procedure Enregistrer(Vec : in out T_Vecteur_Reel; Scalaire : in Long_Float; I : in Integer) with
		Post => Valeur(Vec,I) = Scalaire;

	-- enregistre la valeur Scalaire à l'indice I d'un vecteur entier
	procedure Enregistrer(Vec : in out T_Vecteur_Entier; Scalaire : in Integer; I : in Integer) with
		Post => Valeur(Vec,I) = Scalaire;

	-- fournit la valeur de (I,J) de la matrice Mat 
	function Valeur(Mat : in T_Matrice; I : in Integer; J : in Integer) return Long_Float;

	-- fournit la valeur de I du vecteur reel Vec
	function Valeur(Vec : in T_Vecteur_Reel; I : in Integer) return Long_Float;

	-- fournit la valeur de I du vecteur entier Vec
	function Valeur(Vec : in T_Vecteur_Entier; I : in Integer) return Integer;

	-- multiplie la matrice Mat par le nombre Scalaire
	procedure Multiplier_Scalaire(Mat : in out T_Matrice; Scalaire : in Long_Float);

	-- somme les matrices Mat1 et Mat2 dans Mat1
	procedure Sommer(Mat1 : in out T_Matrice; Mat2 : in T_Matrice);

	-- somme chaque composante de la matrice avec un scalaire
	-- si la matrice est creuse, on n'ajoute le scalaire que aux cases non nulles de la matrice
	procedure Sommer_Scalaire(Mat : in out T_Matrice; Scalaire : in Long_Float);

	-- effectue le produit matriciel entre le Vecteur reel Vec et la matrice Mat,
	-- pour le cas d'une matrice creuse on considère que les lignes vides sont égales à 1/Nb_Pages
	-- et pour les autres cases nulles on considère qu'elles sont égales à (1-Alpha)/Nb_Pages
	procedure Produit(Vec : in out T_Vecteur_Reel; Mat : in T_Matrice; Alpha : in Long_Float);

	-- copie le vecteur reel Vecteur_Source dans le vecteur reel Vecteur_Copie
	procedure Copier(Vecteur_Source : in T_Vecteur_Reel; Vecteur_Copie : out T_Vecteur_Reel);

	-- échanger les valeurs I et J du vecteur reel Vec
	procedure Echanger(Vec : in out T_Vecteur_Reel; I : in Integer; J : in Integer);

	-- échanger les valeurs I et J du vecteur entier Vec
	procedure Echanger(Vec : in out T_Vecteur_Entier; I : in Integer; J : in Integer);

	-- calcule la distance entre deux vecteurs reels définie comme le maximum des différences
	-- des composantes des deux vecteurs en valeur absolue
	function Distance(Vec1 : in T_Vecteur_Reel; Vec2 : in T_Vecteur_Reel) return Long_Float with
		Post => Distance'Result >= 0.0;

private

	-- vecteur de reels
	type T_Vecteur_Reel is array (0..(Taille - 1)) of Long_Float;

	-- vecteur d'entiers
	type T_Vecteur_Entier is array (0..(Taille - 1)) of Integer;

	-- matrice pleine
	type T_Matrice_Pleine is array (0..(Taille - 1), 0..(Taille - 1)) of Long_Float;

	-- cellule des vecteurs creux
	type T_Cellule;

	-- vecteur creux
	type T_Vecteur_Creux is access T_Cellule;

	type T_Cellule is
		record
			Indice : Integer;
			Valeur : Long_Float;
			Suivant : T_Vecteur_Creux;
	end record;

	-- matrice creuse
	type T_Matrice_Creuse is array (0..(Taille-1)) of T_Vecteur_Creux;
	
	-- matrice de reels
	type T_Matrice(Pleine: Boolean) is 
		record 
			case Pleine is
				when True => Matrice_Pleine : T_Matrice_Pleine;
				when False => Matrice_Creuse : T_Matrice_Creuse;
			end case;
		end record;

end Mat_Vec;
