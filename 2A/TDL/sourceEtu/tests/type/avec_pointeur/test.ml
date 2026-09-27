open Rat
open Compilateur
open Exceptions

exception ErreurNonDetectee

(****************************************)
(** Chemin d'accès aux fichiers de test *)
(****************************************)

let pathFichiersRat = "../../../../../tests/type/avec_pointeur/fichiersRat/"

(**********)
(*  TESTS *)
(**********)

let%test_unit "testAffectationPointeur1"= 
  let _ = compiler (pathFichiersRat^"testAffectationPointeur1.rat") in ()

let%test_unit "testAffectationPointeur2"= 
  let _ = compiler (pathFichiersRat^"testAffectationPointeur2.rat") in ()

let%test_unit "testAffectationPointeur3"= 
  let _ = compiler (pathFichiersRat^"testAffectationPointeur3.rat") in ()

let%test_unit "testAffectationPointeur4"= 
  let _ = compiler (pathFichiersRat^"testAffectationPointeur4.rat") in ()

let%test_unit "testAffectationPointeur5"= 
  try 
    let _ = compiler (pathFichiersRat^"testAffectationPointeur5.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Int,Bool) -> ()

let%test_unit "testAffectationPointeur6"= 
  try 
    let _ = compiler (pathFichiersRat^"testAffectationPointeur6.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Int,Rat) -> ()

let%test_unit "testAffectationPointeur7"= 
  try 
    let _ = compiler (pathFichiersRat^"testAffectationPointeur7.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Rat,Bool) -> ()

let%test_unit "testAffectationPointeur8"= 
  try 
    let _ = compiler (pathFichiersRat^"testAffectationPointeur8.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Rat,Int) -> ()

let%test_unit "testAffectationPointeur9"= 
  try 
    let _ = compiler (pathFichiersRat^"testAffectationPointeur9.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Bool,Int) -> ()

let%test_unit "testAffectationPointeur10"= 
  try 
    let _ = compiler (pathFichiersRat^"testAffectationPointeur10.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Bool,Rat) -> ()

let%test_unit "testAffectationPointeur11"= 
  try 
    let _ = compiler (pathFichiersRat^"testAffectationPointeur11.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Int,Pointer(Int)) -> ()

let%test_unit "testAffectationPointeur12"= 
  try 
    let _ = compiler (pathFichiersRat^"testAffectationPointeur12.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Pointer(Pointer(Int)),Int) -> ()

let%test_unit "testAffectationPointeur13"= 
  let _ = compiler (pathFichiersRat^"testAffectationPointeur13.rat") in ()

  let%test_unit "testAffectationPointeur14"= 
  let _ = compiler (pathFichiersRat^"testAffectationPointeur14.rat") in ()

  let%test_unit "testAffectationPointeur15"= 
  let _ = compiler (pathFichiersRat^"testAffectationPointeur15.rat") in ()

  let%test_unit "testAffectationPointeur16"= 
  let _ = compiler (pathFichiersRat^"testAffectationPointeur16.rat") in ()

  let%test_unit "testAffectationPointeur17"= 
  try 
    let _ = compiler (pathFichiersRat^"testAffectationPointeur17.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Pointer(Undefined),Bool) -> ()

  let%test_unit "testAffectationPointeur18"= 
  try 
    let _ = compiler (pathFichiersRat^"testAffectationPointeur18.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Pointer(Undefined),Int) -> ()

  let%test_unit "testAffectationPointeur19"= 
  try 
    let _ = compiler (pathFichiersRat^"testAffectationPointeur19.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Pointer(Undefined),Rat) -> ()

  let%test_unit "testDeclarationPointeur1"= 
  let _ = compiler (pathFichiersRat^"testDeclarationPointeur1.rat") in ()

  let%test_unit "testDeclarationPointeur2"= 
  let _ = compiler (pathFichiersRat^"testDeclarationPointeur2.rat") in ()

  let%test_unit "testDeclarationPointeur3"= 
  let _ = compiler (pathFichiersRat^"testDeclarationPointeur3.rat") in ()

  let%test_unit "testDeclarationPointeur4"= 
  let _ = compiler (pathFichiersRat^"testDeclarationPointeur4.rat") in ()

  let%test_unit "testDeclarationPointeur5"= 
  try 
    let _ = compiler (pathFichiersRat^"testDeclarationPointeur5.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Pointer(Int),Pointer(Rat)) -> ()

  let%test_unit "testDeclarationPointeur6"= 
  try 
    let _ = compiler (pathFichiersRat^"testDeclarationPointeur6.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Pointer(Rat),Pointer(Int)) -> ()

  let%test_unit "testDeclarationPointeur7"= 
  try 
    let _ = compiler (pathFichiersRat^"testDeclarationPointeur7.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Pointer(Bool),Pointer(Int)) -> ()

  let%test_unit "testDeclarationPointeur8"= 
  try 
    let _ = compiler (pathFichiersRat^"testDeclarationPointeur8.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Pointer(Int),Pointer(Bool)) -> ()

  let%test_unit "testDeclarationPointeur9"= 
  try 
    let _ = compiler (pathFichiersRat^"testDeclarationPointeur9.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Pointer(Rat),Pointer(Bool)) -> ()

  let%test_unit "testDeclarationPointeur10"= 
  try 
    let _ = compiler (pathFichiersRat^"testDeclarationPointeur10.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Pointer(Bool),Pointer(Rat)) -> ()

  let%test_unit "testDeclarationPointeur11"= 
  let _ = compiler (pathFichiersRat^"testDeclarationPointeur11.rat") in ()

  let%test_unit "testDeclarationPointeur12"= 
  let _ = compiler (pathFichiersRat^"testDeclarationPointeur12.rat") in ()

  let%test_unit "testDeclarationPointeur13"= 
  let _ = compiler (pathFichiersRat^"testDeclarationPointeur13.rat") in ()

  let%test_unit "testDereferenceNonPointeur1"= 
  try 
    let _ = compiler (pathFichiersRat^"testDereferenceNonPointeur1.rat")
    in  raise ErreurNonDetectee
  with
  | TypeNonPointeur -> ()

  let%test_unit "testDereferenceNonPointeur2"= 
  try 
    let _ = compiler (pathFichiersRat^"testDereferenceNonPointeur2.rat")
    in  raise ErreurNonDetectee
  with
  | TypeNonPointeur -> ()

  let%test_unit "testReferencePointeur1"= 
  let _ = compiler (pathFichiersRat^"testReferencePointeur1.rat") in ()

  let%test_unit "testReferencePointeur2"= 
  let _ = compiler (pathFichiersRat^"testReferencePointeur2.rat") in ()

  let%test_unit "testAffichagePointeur"= 
  let _ = compiler (pathFichiersRat^"testAffichagePointeur.rat") in ()

  let%test_unit "testConditionnellePointeur1"= 
  try 
    let _ = compiler (pathFichiersRat^"testConditionnellePointeur1.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Pointer(Bool),Bool) -> ()

  let%test_unit "testConditionnellePointeur2"= 
  try 
    let _ = compiler (pathFichiersRat^"testConditionnellePointeur2.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Pointer(Undefined),Bool) -> ()

  let%test_unit "testOperationPointeur1"= 
  try 
    let _ = compiler (pathFichiersRat^"testOperationPointeur1.rat")
    in  raise ErreurNonDetectee
  with
  | TypeBinaireInattendu(Plus, Pointer(Int), Pointer(Int)) -> ()

  let%test_unit "testOperationPointeur2"= 
  try 
    let _ = compiler (pathFichiersRat^"testOperationPointeur2.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Pointer(Rat), Rat) -> ()

  let%test_unit "testOperationPointeur3"= 
  try 
    let _ = compiler (pathFichiersRat^"testOperationPointeur3.rat")
    in  raise ErreurNonDetectee
  with
  | TypeBinaireInattendu(Mult, Int, Pointer(Int)) -> ()

  let%test_unit "testRetourPointeur1"= 
  let _ = compiler (pathFichiersRat^"testRetourPointeur1.rat") in ()

  let%test_unit "testRetourPointeur2"= 
  try 
    let _ = compiler (pathFichiersRat^"testRetourPointeur2.rat")
    in  raise ErreurNonDetectee
  with
  | TypeInattendu(Pointer(Int), Int) -> ()

  let%test_unit "testParametrePointeur1"= 
  let _ = compiler (pathFichiersRat^"testParametrePointeur1.rat") in ()

  let%test_unit "testParametrePointeur2"= 
  try 
    let _ = compiler (pathFichiersRat^"testParametrePointeur2.rat")
    in  raise ErreurNonDetectee
  with
  | TypesParametresInattendus([Pointer(Int)], [Int]) -> ()

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