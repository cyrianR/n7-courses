with PageRank_Exceptions;		use PageRank_Exceptions;
with Ada.Command_line;			use Ada.Command_line;

procedure Traiter_Ligne_Commande(Alpha : out Long_Float; K : out Integer; Epsilon : out Long_Float;
Algo_Mat_Pleine : out Boolean; Prefixe : out Unbounded_String;
Fichier_Graphe : out Unbounded_String) is
	
	Compteur : Integer;
begin

	-- initialiser les paramètres par défaut
	Alpha := 0.85;
	K := 150;
	Epsilon := 0.0;
	Algo_Mat_Pleine := False;
	Prefixe := To_Unbounded_String("output");

	Compteur := 1;

	while Compteur < Argument_Count loop
		if Length(To_Unbounded_String(Argument(Compteur))) /= 2 or Argument(Compteur)(1) /= '-' then
			raise Argument_Exception;
		else
			case Argument(Compteur)(2) is
				when 'A' =>
					Alpha := Long_Float'Value(Argument(Compteur + 1));
					Compteur := Compteur + 1;  -- on saute l'argument correspondant à alpha
					if Alpha > 1.0 or Alpha < 0.0 then -- Alpha doit être positif et infèrieur à 1
						raise Argument_Exception;
					else
						null;
					end if;
				when 'K' =>
					K := Integer'Value(Argument(Compteur + 1));
					Compteur := Compteur + 1;  -- on saute l'argument correspondant à k
					if K < 0 then -- K doit être positif
						raise Argument_Exception;
					else
						null;
					end if;
				when 'E' =>
					Epsilon := Long_Float'Value(Argument(Compteur + 1));
					Compteur := Compteur + 1; -- on saute l'argument correspondant à epsilon 
					if Epsilon < 0.0 then -- Epsilon doit être positif
						raise Argument_Exception;
					else 
						null;
					end if;
				when 'P' =>
					Algo_Mat_Pleine := True;
				when 'C' =>
					Algo_Mat_Pleine := False;
				when 'R' =>
					Prefixe := To_Unbounded_String(Argument(Compteur + 1));
					Compteur := Compteur + 1; -- on saute l'argument correspondant à prefixe
				when others => raise Argument_Exception;
			end case;
			Compteur := Compteur + 1;
		end if;
	end loop;

	-- le nom du fichier graph est le dernier argument
	Fichier_Graphe := To_Unbounded_String(Argument(Compteur)); 

	-- le prefixe ne doit pas être le nom du fichier graphe
	if Fichier_Graphe = Prefixe then
		raise Argument_Exception;
	else
		Null;
	end if;
	
exception
	when CONSTRAINT_ERROR => raise Argument_Exception;
	
end Traiter_Ligne_Commande;
