
tests_unitaires:
	gnat make -gnata -gnatwa -g ./test_dico_referencement.adb
	gnat make -gnata -gnatwa -g ./test_ecriture_fichiers_resultats.adb
	gnat make -gnata -gnatwa -g ./test_lire_fichier_graphe.adb
	gnat make -gnata -gnatwa -g ./test_mat_vec.adb
	gnat make ./test_tri_pages_poids.adb
	./test_dico_referencement
	./test_ecriture_fichiers_resultats
	./test_lire_fichier_graphe
	./test_mat_vec
	./test_tri_pages_poids
	gnat clean -q test_dico_referencement
	gnat clean -q test_ecriture_fichiers_resultats
	gnat clean -q test_lire_fichier_graphe
	gnat clean -q test_mat_vec
	gnat clean -q test_tri_pages_poids
