
procedure Tri_Pages_Poids(Pages : out T_Vecteur_Entier; Poids : in out T_Vecteur_Reel;
Nb_Pages : in Integer) is

	function Partition(Pages : out T_Vecteur_Entier; Poids : in out T_Vecteur_Reel; 
	Bas : in Integer; Haut : in Integer) return Integer is
		Pivot : constant Long_Float := Valeur(Poids, Haut);	
		I : Integer := Bas - 1;
	begin
		for J in Bas..(Haut - 1) loop
			if Valeur(Poids, J) >= Pivot then
				I := I + 1;
				Echanger(Pages, I, J);
				Echanger(Poids, I, J);
			else
				Null;
			end if;
		end loop;
		Echanger(Pages, I+1, Haut);
		Echanger(Poids, I+1, Haut);
		return I + 1;
	end Partition;
	
	procedure Tri_Interne(Pages : out T_Vecteur_Entier; Poids : in out T_Vecteur_Reel; 
	Nb_Pages : in Integer; Bas : in Integer; Haut : in Integer) is
		Index_Pivot : Integer;
	begin
		if Bas < Haut then
			Index_Pivot := Partition(Pages, Poids, Bas, Haut);
			Tri_Interne(Pages, Poids, Nb_Pages, Bas, Index_Pivot - 1);
			Tri_Interne(Pages, Poids, Nb_Pages, Index_Pivot + 1, Haut);
		end if;
	end Tri_Interne;

begin
	
	Tri_Interne(Pages, Poids, Nb_Pages, 0, Nb_Pages - 1);

end Tri_Pages_Poids;
