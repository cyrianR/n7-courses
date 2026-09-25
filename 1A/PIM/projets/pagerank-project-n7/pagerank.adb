with Ada.Strings.Unbounded;					use Ada.Strings.Unbounded;
with Ada.Integer_Text_IO;						use Ada.Integer_Text_IO;
with Ada.Text_IO;										use Ada.Text_IO;
with Pagerank_Exceptions;						use Pagerank_Exceptions;
with Ada.IO_Exceptions;							
with Afficher_Usage;
with Afficher_Fichier_Valide;
with Traiter_Ligne_Commande;
with Mat_Vec;
with Dico_Referencement;
with Lire_Fichier_Graphe;
with Ecriture_Fichiers_Resultats;
with Tri_Pages_Poids;

procedure PageRank is

	Alpha : Long_Float;									-- option qui pondère les calculs, 
																			-- plus elle est proche de 1 plus le calcul du pagerank est lent
	K : Integer;												-- nombre d'itérations du calcul du vecteur poids
	Epsilon : Long_Float;								-- précision du calcul du vecteur poids
	Algo_Mat_Pleine : Boolean;					-- vrai lorsqu'on utilise une matrice pleine pour les calculs
	Prefixe : Unbounded_String;					-- prefixe utilisé pour les fichiers résultats
	Fichier_Graphe : Unbounded_String;	-- chemin d'accès du fichier graphe
	Nb_Pages : Integer;									-- nombre de noeuds ou pages présentes dans le graphe
	Fichier : Ada.Text_IO.File_Type;		-- type fichier utilisé pour récupérer le nombre de pages dans le fichier graphe
	Compteur : Integer;									-- compteur des itérations du calcul des poids
	Dist_Poids : Long_Float;						-- distance entre les deux derniers poids calculés

begin

	-- initialiser les paramètres fournis par l'utilisateur
	Traiter_Ligne_Commande(Alpha, K, Epsilon, Algo_Mat_Pleine, Prefixe, Fichier_Graphe);
	
	-- récupération du nombre de pages dans le graphe
	Open(Fichier, In_File, To_String(Fichier_Graphe));
	Get(Fichier, Nb_Pages);
	if Nb_Pages < 0 then
		raise Fichier_Graphe_Exception;
	else
		Null;
	end if;
	Close(Fichier);

	-- déclaration des modules et procédures Mat_Vec, Dico_Referencement, Lire_Fichier_Graphe
	-- et Ecriture_Fichiers_Resultats avec la bonne taille
	declare
		package Nouveau_Mat_Vec is new Mat_Vec(Nb_Pages);
		use Nouveau_Mat_Vec;

		package Nouveau_Dico_Referencement is new Dico_Referencement(Nb_Pages, Nouveau_Mat_Vec);
		use Nouveau_Dico_Referencement;

		procedure Lire_Graphe is new Lire_Fichier_Graphe(Nouveau_Dico_Referencement);

		package Nouveau_Ecriture_Fichiers is new Ecriture_Fichiers_Resultats(Nouveau_Mat_Vec);
		use Nouveau_Ecriture_Fichiers;

		procedure Tri is new Tri_Pages_Poids(Nouveau_Mat_Vec);

		G : T_Matrice(Algo_Mat_Pleine);		-- matrice de google
		Dico_Ref : T_Dico_Referencement;	-- dictionnaire de référencement des liens entre noeuds
		Poids : T_Vecteur_Reel;						-- vecteur poids
		Poids_Precedent : T_Vecteur_Reel;	-- vecteur poids mémoire
		Pages : T_Vecteur_Entier;					-- vecteur des pages 
	begin
		-- lecture du fichier graphe et remplissage du dictionnaire de référencement
		Lire_Graphe(Fichier_Graphe, Dico_Ref);

		-- calcul de la matrice S dans G (dans le cas matrice creuse rien ne change)
		Initialiser(G, 0.0);
		Remplir_Matrice(Dico_Ref, G);

		-- calcul de la matrice Google dans G (dans le cas matrice creuse 
		-- rien ne change sauf les cases non vides)
		Multiplier_Scalaire(G, Alpha);
		Sommer_Scalaire(G, (1.0-Alpha)/Long_Float(Nb_Pages));

		-- calcul du vecteur poids
		Initialiser(Poids_Precedent, 1.0/Long_Float(Nb_Pages));
		Compteur := 0;
		loop
			Copier(Poids_Precedent, Poids);
			Produit(Poids, G, Alpha); -- le produit est adapté aux opérations du pagerank pour 
																-- la matrice creuse et ne correspond pas à un réel 
																-- produit vecteur matrice
			Compteur := Compteur + 1;
			Dist_Poids := Distance(Poids, Poids_Precedent);
			Copier(Poids, Poids_Precedent);
			exit when Dist_Poids < Epsilon or Compteur = K;
		end loop;

		-- création d'un vecteur avec les numéros de pages dans l'ordre croissant
		for i in 0..(Nb_Pages - 1) loop
			Enregistrer(Pages, i, i);
		end loop;

		-- tri des page et des poids selon les poids
		Tri(Pages, Poids, Nb_Pages);

		-- ecrire les fichiers résultats
		Ecrire_Fichier_Poids(Poids, Prefixe, Nb_Pages, Alpha, K);
		Ecrire_Fichier_Rang(Pages, Prefixe, Nb_Pages);

		-- detruire le dictionnaire de référencement
		Vider(Dico_Ref);

		-- detruire la matrice G, si c'est une matrice pleine rien ne se passe
		Vider(G);
		
	end;

exception 
	when Argument_Exception =>
		New_Line;
		Put_Line("Erreur de saisie d'arguments, voir l'usage du programme pagerank.");
		New_Line;
		Afficher_Usage;
	when Ada.Text_IO.Name_Error =>
		New_Line;
		Put_Line("Le fichier graphe fournit est introuvable.");
		New_Line;
		Afficher_Usage;
	when Fichier_Graphe_Exception =>
		New_Line;
		Put_Line("Le fichier graphe fournit est invalide, voir la forme d'un fichier graphe valide.");
		Afficher_Fichier_Valide;
	when Ada.IO_Exceptions.Data_Error => -- levée lorsque le nombre de pages dans le fichier graphe
																			-- n'est pas un entier
		New_Line;
		Put_Line("Le fichier graphe fournit est invalide, voir la forme d'un fichier graphe valide.");
		Afficher_Fichier_Valide;

	when Index_Exception =>
		New_Line;
		Put_Line("Le nombre de noeuds présents dans le fichier graphe ne correspond pas au nombre ");
		Put_Line("de pages uniques indiqué en début de fichier, voir la forme d'un fichier graphe valide.");
		Afficher_Fichier_Valide;

end PageRank;
