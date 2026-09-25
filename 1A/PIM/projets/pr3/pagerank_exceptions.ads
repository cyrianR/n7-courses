-- définition des exceptions propres au PageRank
package PageRank_Exceptions is

	Argument_Exception : Exception; -- l'un des arguments en ligne de commande ne respecte pas l'usage
	Index_Exception : Exception; -- un indice fourni n'est pas dans les bornes requises
	Fichier_Graphe_Exception : Exception;

end PageRank_Exceptions;
