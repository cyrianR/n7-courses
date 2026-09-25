with Ada.Unchecked_Deallocation;
with PageRank_Exceptions;						use PageRank_Exceptions;


package body Dico_Referencement is

	procedure Free is
		new Ada.Unchecked_Deallocation (Object => T_Cellule, Name => T_LCA);


	procedure Initialiser(Dico : out T_Dico_Referencement) is
	begin
		for i in 0..(Nombre_Pages - 1) loop
			Dico(i).Nb_Liens := 0;
			Dico(i).Pages_Ref := Null;
		end loop;
	end Initialiser;


	procedure Ajouter_Lien(Dico : in out T_Dico_Referencement; Page_Cle : in Integer;
		Page_Referencee : in Integer) is

		procedure Enregistrer(Sda : in out T_LCA; Page: in Integer; Modif : out Boolean) is
		begin
			if Sda = Null then
				Sda := new T_Cellule'(Page_Referencee, Null);
				Modif := True;
			elsif Page = Sda.all.Page then
				Modif := False;
			else
				Enregistrer(Sda.all.Suivant, Page, Modif);
			end if;
		end Enregistrer;

		Modif : Boolean;

	begin
		if (Page_Cle>Nombre_Pages-1) or (Page_Referencee>Nombre_Pages-1) or 
			(Page_Cle<0) or (Page_Referencee<0) then
				raise Index_Exception;
		else 
			Enregistrer(Dico(Page_Cle).Pages_Ref, Page_Referencee, Modif);
			if Modif then
				Dico(Page_Cle).Nb_Liens := Dico(Page_Cle).Nb_Liens + 1;
			else
				Null;
			end if;
		end if;
	end Ajouter_Lien;


	function Liens(Dico : in T_Dico_Referencement; Page_Cle : in Integer) return Integer is
	begin
		if (Page_Cle>Nombre_Pages-1) or (Page_Cle<0) then
			raise Index_Exception;
		else 
			return Dico(Page_Cle).Nb_Liens;
		end if;
	end Liens;


	function Reference(Dico : in  T_Dico_Referencement; Page_Cle : in Integer; 
		Page_Referencee : in Integer) return Boolean is

		Sda : T_LCA;

	begin
		if (Page_Cle>Nombre_Pages-1) or (Page_Referencee>Nombre_Pages-1) or	
			(Page_Cle<0) or (Page_Referencee<0) then
				raise Index_Exception;
		else 
			Sda := Dico(Page_Cle).Pages_Ref;
			loop
				if Sda = Null then
					return False;
				elsif Page_Referencee = Sda.all.Page then
					return True;
				else
					Sda := Sda.all.Suivant;
				end if;
			end loop;
		end if;
	end Reference;


  procedure Vider(Dico : in out T_Dico_Referencement) is

		procedure Detruire (Sda : in out T_LCA) is
		begin
			if Sda /= Null then
				Detruire (Sda.all.Suivant);
				Free (Sda);
			else
				Null;
			end if;
		end Detruire;

	begin
		for i in 0..Nombre_Pages-1 loop
			Detruire(Dico(i).Pages_Ref);
			Dico(i).Nb_Liens := 0;
		end loop;
	end Vider;


	procedure Remplir_Matrice(Dico : in T_Dico_Referencement; Mat : in out T_Matrice) is 
	
		procedure Pour_Chaque_Lien(Page_Cle : in Integer; Sda : in T_LCA; Nb_Liens : in Integer) is
		begin
			if Sda /= Null then
				Enregistrer(Mat, 1.0/Long_Float(Nb_Liens), Page_Cle, Sda.all.Page);
				Pour_Chaque_Lien(Page_Cle, Sda.all.Suivant, Nb_Liens);
			else
				Null;
			end if;
		end Pour_Chaque_Lien;

		Nb_Liens : Integer;
	begin
		if Mat.Pleine then
			for Page_Cle in 0..Nombre_Pages-1 loop
				Nb_Liens := Liens(Dico, Page_Cle);
				if Nb_Liens = 0 then -- la page clé n'a pas de pages référencées (page puit)
					for j in 0..Nombre_Pages-1 loop
						Enregistrer(Mat, 1.0/Long_Float(Nombre_Pages), Page_Cle, j);
					end loop;
				else -- la page clé référence bien des pages
					Pour_Chaque_Lien(Page_Cle, Dico(Page_Cle).Pages_Ref, Nb_Liens);
				end if;
			end loop;
		else -- dans le cas matrice creuses on rempli seulement la matrice H
			for Page_Cle in 0..Nombre_Pages-1 loop
				Nb_Liens := Liens(Dico, Page_Cle);
				if Nb_Liens = 0 then -- la page clé n'a pas de pages référencées (page puit)
					Null;
				else -- la page clé référence bien des pages
					Pour_Chaque_Lien(Page_Cle, Dico(Page_Cle).Pages_Ref, Nb_Liens);
				end if;
			end loop;
		end if;
	end Remplir_Matrice;


end Dico_Referencement;
