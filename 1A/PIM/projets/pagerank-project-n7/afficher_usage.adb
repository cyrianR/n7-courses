with Ada.Text_IO;						use Ada.Text_IO;

procedure Afficher_Usage is
begin

	New_Line;
	Put_Line("Usage du programme PageRank : pagerank [options] [fichier graphe]");
	New_Line;
	Put_Line("Options :");
	New_Line;
	Put_Line("  -K <entier>    Définit l'indice K du vecteur poids à calculer (défaut : 150).");
	Put_Line("                 La valeur fournie doit vérifier K > 0.");
	New_Line;
	Put_Line("  -A <réel>      Définit la valeur de la pondération alpha utilisée pour le calcul");
	Put_Line("                 de la matrice de Google (défaut : 0.85).");
	Put_Line("                 Plus sa valeur est proche de 1, plus la convergence du calcul est");
	Put_Line("                 lente. Plus la valeur est faible, plus le calcul est rapide mais"); 
	Put_Line("                 moins les poids prennent en compte la topologie du graphe.");
	Put_Line("                 La valeur fournie doit vérifier 0 < alpha < 1.");
	New_Line;
	Put_Line("  -E <réel>      Définit une précision espilon qui interrompra le calcul du PageRank");
	Put_Line("                 si le vecteur poids est à une distance du vecteur poids précédent");
	Put_Line("                 strictement infèrieure à epsilon. (défaut : 0.0).");
	Put_Line("                 La valeur fournie doit vérifier epsilon > 0.");
	New_Line;
	Put_Line("  -P             Choisir l'algorithme avec des matrices pleines.");
	New_Line;
	Put_Line("  -C             Choisir l'algorithme avec des matrices creuses (utilisé par défaut).");
	New_Line;
	Put_Line("  -R <préfixe>   Choisir le préfixe des fichiers résultats (défaut : 'output').");
	New_Line;

end Afficher_Usage;
