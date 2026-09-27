open Rat
open Compilateur
open Exceptions

exception ErreurNonDetectee

(****************************************)
(** Chemin d'accès aux fichiers de test *)
(****************************************)

let pathFichiersRat = "../../../../../tests/gestion_id/avec_var_glob/fichiersRat/"

(**********)
(*  TESTS *)
(**********)

let%test_unit "testVarGlob1" =
  let _ = compiler (pathFichiersRat ^ "testVarGlob1.rat") in ()

let%test_unit "testGlobales2" =
  try
    let _ = compiler (pathFichiersRat ^ "testVarGlob2.rat") in
    raise ErreurNonDetectee
  with 
  | DoubleDeclaration "variable" -> ()
  
let%test_unit "testGlobales3" =
  try
    let _ = compiler (pathFichiersRat ^ "testVarGlob3.rat") in
    raise ErreurNonDetectee
  with 
  | IdentifiantNonDeclare "variable" -> ()

let%test_unit "testVarGlobFonction1" =
  let _ = compiler (pathFichiersRat ^ "testVarGlob1.rat") in ()

let%test_unit "testGlobalesFonction2" =
  try
    let _ = compiler (pathFichiersRat ^ "testVarGlob2.rat") in
    raise ErreurNonDetectee
  with 
  | DoubleDeclaration "variable" -> ()

let%test_unit "testGlobalesFonction3" =
  try
    let _ = compiler (pathFichiersRat ^ "testVarGlob3.rat") in
    raise ErreurNonDetectee
  with 
  | IdentifiantNonDeclare "variable" -> ()

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
  let p_tam = "../../../../../tests/tam/avec_var_glob/fichiersRat/" in
  let d = opendir p_tam in
  test d p_tam
