with PageRank_Exceptions;    use PageRank_Exceptions;
with Ada.Unchecked_Deallocation;

package body Mat_Vec is

	procedure Free is 
		new Ada.Unchecked_Deallocation(T_Cellule, T_Vecteur_Creux);

	-- initilialiser un vecteur creux vide
	procedure Initialiser(V : out T_Vecteur_Creux) is
	begin
		V := Null;
	end Initialiser;

	-- detruire un vecteur creux
	procedure Detruire(V: in out T_Vecteur_Creux) is
	begin
		if V /= Null then
			Detruire(V.all.Suivant);
			Free(V);
		else
			Null;
		end if;
	end Detruire;

	-- modifier la valeur du vecteur creux à un certain indice par le scalaire  
	procedure Modifier(V : in out T_Vecteur_Creux; Indice : in Integer; 
		Scalaire : in Long_Float) is
		A_Detruire : T_Vecteur_Creux;
	begin
		if V = Null or else V.all.Indice > Indice then
			if Scalaire /= 0.0 then
				V := new T_Cellule'(Indice, Scalaire, V);
			end if;
		elsif V.all.Indice = Indice then
			if Scalaire = 0.0 then
				A_Detruire := V;
				V := V.all.Suivant;
				Free(A_Detruire);
			else
				V.All.Valeur := Scalaire;
			end if;
		else
			Modifier(V.all.Suivant, Indice, Scalaire);
		end if;
	end Modifier;

	-- récupérer la valeur à un indice du vecteur creux
	function Valeur(V : in T_Vecteur_Creux; Indice : in Integer) return Long_Float is 
	begin
		if V = Null or else V.all.Indice > Indice then
			return 0.0;
		elsif V.all.Indice = Indice then
			return V.all.Valeur;
		else
			return Valeur(V.all.Suivant, Indice);
		end if;
	end Valeur;
	
	-- multiplier le vecteur creux par un scalaire
	procedure Multiplier_Scalaire(V : in T_Vecteur_Creux; Scalaire : in Long_Float) is 
	begin
		if V /= Null then
			V.all.Valeur := V.all.Valeur * Scalaire;
			Multiplier_Scalaire(V.all.Suivant, Scalaire);
		else
			Null;
		end if;
	end Multiplier_Scalaire;

	-- sommer chaque composante non nulle du vecteur creux par un scalaire
	procedure Sommer_Scalaire(V : in T_Vecteur_Creux; Scalaire : in Long_Float) is 
	begin
		if V /= Null then
			V.all.Valeur := V.all.Valeur + Scalaire;
			Sommer_Scalaire(V.all.Suivant, Scalaire);
		else
			Null;
		end if;
	end Sommer_Scalaire;

	-- sommer deux vecteurs creux
	procedure Sommer(V1 : in out T_Vecteur_Creux; V2 : in T_Vecteur_Creux) is
		A_Detruire : T_Vecteur_Creux;
	begin
		if V2 = null then
			Null;
		elsif V1 = Null or else V1.all.Indice > V2.all.Indice then
			V1 := new T_Cellule'(V2.all.Indice, V2.all.Valeur, V1);
			Sommer(V1.all.Suivant, V2.all.Suivant);
		elsif V1.all.Indice = V2.all.Indice then
			V1.all.Valeur := V1.all.Valeur + V2.all.Valeur;
			if V1.all.Valeur = 0.0 then
				A_Detruire := V1;
				V1 := V1.Suivant;
				Free(A_Detruire);
				Sommer(V1, V2.all.Suivant);
			else
				Sommer(V1.all.Suivant, V2.all.Suivant);
			end if;
		else
			Sommer(V1.all.Suivant, V2);
		end if;
	end Sommer;

	procedure Vider(Mat : in out T_Matrice) is 
	begin
		if Mat.Pleine then
			Null;
		else
			for i in 0..Taille-1 loop
				Detruire(Mat.Matrice_Creuse(i));
			end loop;
		end if;
	end Vider;

	procedure Initialiser(Mat : out T_Matrice; Scalaire : in Long_Float) is
	begin
		if Mat.Pleine then
			for i in 0..Taille-1 loop
				for j in 0..Taille-1 loop
					Mat.Matrice_Pleine(i,j) := Scalaire;
				end loop;
			end loop;
		else 
			if Scalaire = 0.0 then
				for i in 0..Taille-1 loop
					Initialiser(Mat.Matrice_Creuse(i));
				end loop;
			else 
				for i in 0..Taille-1 loop
					for j in 0..Taille-1 loop
						Modifier(Mat.Matrice_Creuse(i), j, Scalaire);
					end loop;
				end loop;
			end if;
		end if;
	end Initialiser;

	procedure Initialiser(Vec: out T_Vecteur_Reel; Scalaire : in Long_Float) is
	begin
		for i in 0..Taille-1 loop
			Vec(i) := Scalaire;
		end loop;
	end Initialiser;

	procedure Initialiser(Vec: out T_Vecteur_Entier; Scalaire : in Integer) is
	begin
		for i in 0..Taille-1 loop
			Vec(i) := Scalaire;
		end loop;
	end Initialiser;

	procedure Enregistrer(Mat: in out T_Matrice; Scalaire : in Long_Float; I : in Integer; J : in Integer) is
	begin
		if (I > Taille-1) or (J > Taille-1) or (I < 0) or (J < 0) then
			raise Index_Exception;
		else
			if Mat.Pleine then
				Mat.Matrice_Pleine(I,J) := Scalaire;
			else 
				Modifier(Mat.Matrice_Creuse(I), J, Scalaire);
			end if;
		end if;
	end Enregistrer;

	procedure Enregistrer(Vec : in out T_Vecteur_Reel; Scalaire : in Long_Float; I : in Integer) is
	begin
		if (I > Taille-1) or (I < 0) then
			raise Index_Exception;
		else 
			Vec(I) := Scalaire;
		end if;
	end Enregistrer;

	procedure Enregistrer(Vec : in out T_Vecteur_Entier; Scalaire : in Integer; I : in Integer) is
	begin
		if (I > Taille-1) or (I < 0) then
			raise Index_Exception;
		else 
			Vec(I) := Scalaire;
		end if;
	end Enregistrer;

	function Valeur(Mat : in T_Matrice; I : in Integer; J : in Integer) return Long_Float is
	begin
		if (I > Taille-1) or (J > Taille-1) or (I < 0) or (J < 0) then
			raise Index_Exception;
		else 
			if Mat.Pleine then
				return Mat.Matrice_Pleine(I,J);
			else 
				return Valeur(Mat.Matrice_Creuse(I), J);
			end if;
		end if;
	end Valeur;

	function Valeur(Vec : in T_Vecteur_Reel; I : in Integer) return Long_Float is
	begin
		if (I > Taille-1) or (I < 0) then
			raise Index_Exception;
		else 
			return Vec(I);
		end if;
	end Valeur;

	function Valeur(Vec : in T_Vecteur_Entier; I : in Integer) return Integer is
	begin
		if (I > Taille-1) or (I < 0) then
			raise Index_Exception;
		else 
			return Vec(I);
		end if;
	end Valeur;

	procedure Multiplier_Scalaire(Mat : in out T_Matrice; Scalaire : in Long_Float) is 
	begin
		if Mat.Pleine then
			for i in 0..Taille-1 loop
				for j in 0..Taille-1 loop
					Mat.Matrice_Pleine(i,j) := Mat.Matrice_Pleine(i,j) * Scalaire;
				end loop;
			end loop;
		else
			for i in 0..Taille-1 loop
				Multiplier_Scalaire(Mat.Matrice_Creuse(i), Scalaire);
			end loop;
		end if;
	end Multiplier_Scalaire;

	procedure Sommer(Mat1: in out T_Matrice; Mat2: in T_Matrice) is
	begin
		if Mat1.Pleine then
			for i in 0..Taille-1 loop
				for j in 0..Taille-1 loop
					Mat1.Matrice_Pleine(i,j) := Mat1.Matrice_Pleine(i,j) + Mat2.Matrice_Pleine(i,j);
				end loop;
			end loop;
		else
			for i in 0..Taille-1 loop
				Sommer(Mat1.Matrice_Creuse(i), Mat2.Matrice_Creuse(i));
			end loop;
		end if;
	end Sommer;

	procedure Sommer_Scalaire(Mat : in out T_Matrice; Scalaire : Long_Float) is 
	begin
		if Mat.Pleine then
			for i in 0..Taille-1 loop
				for j in 0..Taille-1 loop
					Mat.Matrice_Pleine(i,j) := Mat.Matrice_Pleine(i,j) + Scalaire;
				end loop;
			end loop;
		else
			for i in 0..Taille-1 loop
				Sommer_Scalaire(Mat.Matrice_Creuse(i), Scalaire);
			end loop;
		end if;
	end Sommer_Scalaire;

	procedure Produit(Vec : in out T_Vecteur_Reel; Mat : in T_Matrice; Alpha : in Long_Float) is
		
		procedure Parcour_Ligne(V_Creux : in T_Vecteur_Creux; Composante_I : in Long_Float; 
			V_Resultat : in out T_Vecteur_Reel; Indice_Courant : in Integer) is 
		begin
			if V_Creux /= Null then
				if Indice_Courant = V_Creux.all.Indice then 
					V_Resultat(V_Creux.all.Indice) := V_Resultat(V_Creux.all.Indice) 
						+ Composante_I*V_Creux.all.Valeur;
					Parcour_Ligne(V_Creux.all.Suivant, Composante_I, V_Resultat, Indice_Courant + 1);
				else 
					V_Resultat(Indice_Courant) := V_Resultat(Indice_Courant) 
						+ Composante_I*(1.0-Alpha)/Long_Float(Taille);
					Parcour_Ligne(V_Creux, Composante_I, V_Resultat, Indice_Courant + 1);
				end if;
			else
				for k in Indice_Courant..Taille-1 loop
					V_Resultat(Indice_Courant) := V_Resultat(Indice_Courant) 
						+ Composante_I*(1.0-Alpha)/Long_Float(Taille);
				end loop;
			end if;
		end Parcour_Ligne;

		Vec_Resultat : T_Vecteur_Reel;
		Somme : Long_Float;
		A_Ajouter : Long_Float;
	begin
		if Mat.Pleine then
			for i in 0..Taille-1 loop
				Somme := Mat.Matrice_Pleine(0,i) * Vec(0);
				for j in 1..Taille-1 loop
					Somme := Somme + Mat.Matrice_Pleine(j,i) * Vec(j);
				end loop;
				Enregistrer(Vec_Resultat, Somme, i);
			end loop;
		else
			for i in 0..Taille-1 loop
				Vec_Resultat(i) := 0.0;
			end loop;
			for i in 0..Taille-1 loop
				if Mat.Matrice_Creuse(i) /= Null then -- la ligne i de la matrice creuse 
																							-- n'est pas entierement vide
					Parcour_Ligne(Mat.Matrice_Creuse(i), Vec(i), Vec_Resultat, 0);
				else 
					-- ajouter à chaque composante du vecteur résultat la composante i eme de Vec 
					-- multipliée à 1/Nb_Pages
					A_Ajouter := Vec(i) * 1.0/Long_Float(Taille); 
					for j in 0..Taille-1 loop
						Vec_Resultat(j) := Vec_Resultat(j) + A_Ajouter;
					end loop;
				end if;
			end loop;
		end if;
		Vec := Vec_Resultat;
	end Produit;

	procedure Copier(Vecteur_Source : in T_Vecteur_Reel; Vecteur_Copie : out T_Vecteur_Reel) is
	begin
		Vecteur_Copie := Vecteur_Source;
	end Copier;

	procedure Echanger(Vec : in out T_Vecteur_Reel; I : in Integer; J : in Integer) is 
		Memoire : Long_Float;
	begin
		if (I > Taille-1) or (I < 0) or (J > Taille-1) or (J < 0) then
			raise Index_Exception;
		else 
			Memoire := Vec(I);
			Vec(I) := Vec(J);
			Vec(J) := Memoire;
		end if;
	end Echanger;

	procedure Echanger(Vec : in out T_Vecteur_Entier; I : in Integer; J : in Integer) is 
		Memoire : Integer;
	begin 
		if (I > Taille-1) or (I < 0) or (J > Taille-1) or (J < 0) then
			raise Index_Exception;
		else 
			Memoire := Vec(I);
			Vec(I) := Vec(J);
			Vec(J) := Memoire;
		end if;
	end Echanger;

	function Distance(Vec1 : in T_Vecteur_Reel; Vec2 : in T_Vecteur_Reel) return Long_Float is
		Max_Distance : Long_Float := 0.0;
		Difference : Long_Float;
	begin
		for i in 0..Taille-1 loop
			Difference := Vec1(i) - Vec2(i);
			if Difference < 0.0 then
				Difference := - Difference;
			else
				Null;
			end if;
			if Difference > Max_Distance then
				Max_Distance := Difference;
			else
				Null;
			end if;
		end loop;
		return Max_Distance;
	end Distance;

end Mat_Vec;
