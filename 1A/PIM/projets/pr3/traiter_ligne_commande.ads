with Ada.Strings.Unbounded; use Ada.Strings.Unbounded;

-- modifier les arguments fournit par l'utilisateur en ligne de commande
procedure Traiter_Ligne_Commande(Alpha : out Long_Float; K : out Integer; Epsilon : out Long_Float;
Algo_Mat_Pleine : out Boolean; Prefixe : out Unbounded_String;
Fichier_Graphe : out Unbounded_String);
