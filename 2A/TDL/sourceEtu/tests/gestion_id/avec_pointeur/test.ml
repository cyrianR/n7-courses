open Rat
open Compilateur
open Exceptions

exception ErreurNonDetectee

(****************************************)
(** Chemin d'accès aux fichiers de test *)
(****************************************)

let pathFichiersRat = "../../../../../tests/gestion_id/avec_pointeur/fichiersRat/"

(**********)
(*  TESTS *)
(**********)

let%test_unit "testAffectationPointeur1" = 
  let _ = compiler (pathFichiersRat^"testAffectationPointeur1.rat") in ()

let%test_unit "testAffectationPointeur2" = 
  try 
    let _ = compiler (pathFichiersRat^"testAffectationPointeur2.rat")
    in raise ErreurNonDetectee
  with
  | IdentifiantNonDeclare("y") -> ()

let%test_unit "testAffectationPointeur3" = 
  let _ = compiler (pathFichiersRat^"testAffectationPointeur3.rat") in ()

let%test_unit "testAffectationPointeur4" = 
  let _ = compiler (pathFichiersRat^"testAffectationPointeur4.rat") in ()

let%test_unit "testAffectationPointeur5" = 
  let _ = compiler (pathFichiersRat^"testAffectationPointeur5.rat") in ()

  let%test_unit "testUtilisationPointeur1" = 
  let _ = compiler (pathFichiersRat^"testUtilisationPointeur1.rat") in ()

let%test_unit "testUtilisationPointeur2" = 
  let _ = compiler (pathFichiersRat^"testUtilisationPointeur2.rat") in ()

let%test_unit "testUtilisationPointeur3" = 
  try 
    let _ = compiler (pathFichiersRat^"testUtilisationPointeur3.rat")
    in raise ErreurNonDetectee
  with
  | IdentifiantNonDeclare("x") -> ()

let%test_unit "testUtilisationPointeur4" = 
  let _ = compiler (pathFichiersRat^"testUtilisationPointeur4.rat") in ()

let%test_unit "testUtilisationPointeur5" = 
  let _ = compiler (pathFichiersRat^"testUtilisationPointeur5.rat") in ()

let%test_unit "testUtilisationPointeur6" = 
  try 
    let _ = compiler (pathFichiersRat^"testUtilisationPointeur6.rat")
    in raise ErreurNonDetectee
  with
  | MauvaiseUtilisationIdentifiant("x") -> ()

let%test_unit "testUtilisationFonctionPointeur1" = 
  let _ = compiler (pathFichiersRat^"testUtilisationFonctionPointeur1.rat") in ()

let%test_unit "testUtilisationFonctionPointeur2" = 
  let _ = compiler (pathFichiersRat^"testUtilisationFonctionPointeur2.rat") in ()

let%test_unit "testUtilisationFonctionPointeur3" = 
  try 
    let _ = compiler (pathFichiersRat^"testUtilisationFonctionPointeur3.rat")
    in raise ErreurNonDetectee
  with
  | IdentifiantNonDeclare("y") -> ()

let%test_unit "testDeclarationFonctionPointeur" = 
  let _ = compiler (pathFichiersRat^"testDeclarationFonctionPointeur.rat") in ()



(* Fichiers de tests de la génération de code -> doivent passer la TDS *)
open Unix
open Filename

let rec test d p_tam = 
  try 
    let file = readdir d in
    if (check_suffix file ".rat") 
    then
    (
     try
       let _ = compiler  (p_tam^file) in (); 
     with e -> print_string (p_tam^file); print_newline(); raise e;
    )
    else ();
    test d p_tam
  with End_of_file -> ()

let%test_unit "all_tam" =
  let p_tam = "../../../../../tests/tam/avec_pointeur/fichiersRat/" in
  let d = opendir p_tam in
  test d p_tam