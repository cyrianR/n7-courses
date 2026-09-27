open Rat
open Compilateur
open Passe

(* Return la liste des adresses des variables d'un programme RAT *)
let getListeDep ratfile =
  let input = open_in ratfile in
  let filebuf = Lexing.from_channel input in
  try
  let ast = Parser.main Lexer.token filebuf in
  let past = CompilateurRat.calculer_placement ast in
  let listeAdresses = VerifPlacement.analyser past in
  listeAdresses
  with
  | Lexer.Error _ as e ->
      report_error ratfile filebuf "lexical error (unexpected character).";
      raise e
  | Parser.Error as e->
      report_error ratfile filebuf "syntax error.";
      raise e

(* teste si dans le fichier fichier, dans la fonction fonction (main pour programme principal)
la occ occurence de la variable var a l'adresse dep[registre]
*)
let test fichier fonction (var,occ) (dep,registre) = 
  let l = getListeDep fichier in
  let lmain = List.assoc fonction l in
  let rec aux i lmain = 
    if i=1 
    then
      let (d,r) = List.assoc var lmain in
      (d=dep && r=registre)
    else 
      aux (i-1) (List.remove_assoc var lmain)
  in aux occ lmain

(****************************************)
(** Chemin d'accès aux fichiers de test *)
(****************************************)

let pathFichiersRat = "../../../../../tests/placement/avec_pointeur/fichiersRat/"

(**********)
(*  TESTS *)
(**********)


let%test "testPointeur1_x" = 
  test (pathFichiersRat^"testPointeur1.rat")  "main" ("x",1)  (0,"SB")

let%test "testPointeur1_y" = 
  test (pathFichiersRat^"testPointeur1.rat")  "main" ("y",1)  (1,"SB")

let%test "testPointeur2_x" = 
  test (pathFichiersRat^"testPointeur2.rat")  "main" ("x",1)  (0, "SB")
  
let%test "testPointeur2_y" = 
  test (pathFichiersRat^"testPointeur2.rat")  "main" ("y",1)  (1, "SB")
  
let%test "testPointeur2_z" = 
  test (pathFichiersRat^"testPointeur2.rat")  "main" ("z",1)  (2, "SB")

let%test "testPointeur3_x_1" = 
  test (pathFichiersRat^"testPointeur3.rat")  "main" ("x",1)  (0, "SB")
  
let%test "testPointeur3_y_1" = 
  test (pathFichiersRat^"testPointeur3.rat")  "main" ("y",1)  (1, "SB")
  
let%test "testPointeur3_z_1" = 
  test (pathFichiersRat^"testPointeur3.rat")  "main" ("z",1)  (2, "SB")

let%test "testPointeur3_x_2" = 
  test (pathFichiersRat^"testPointeur3.rat")  "main" ("x",2)  (3, "SB")
  
let%test "testPointeur3_y_2" = 
  test (pathFichiersRat^"testPointeur3.rat")  "main" ("y",2)  (4, "SB")
  
let%test "testPointeur3_z_2" = 
  test (pathFichiersRat^"testPointeur3.rat")  "main" ("z",2)  (6, "SB")

let%test "testPointeur3_x_3" = 
  test (pathFichiersRat^"testPointeur3.rat")  "main" ("x",3)  (3, "SB")
  
let%test "testPointeur3_y_3" = 
  test (pathFichiersRat^"testPointeur3.rat")  "main" ("y",3)  (4, "SB")
  
let%test "testPointeur3_z_3" = 
  test (pathFichiersRat^"testPointeur3.rat")  "main" ("z",3)  (6, "SB")

let%test "testPointeur3_x1" = 
  test (pathFichiersRat^"testPointeur3.rat")  "main" ("x1",1)  (3, "SB")
  
let%test "testPointeur3_y1" = 
  test (pathFichiersRat^"testPointeur3.rat")  "main" ("y1",1)  (4, "SB")
  
let%test "testPointeur3_z1" = 
  test (pathFichiersRat^"testPointeur3.rat")  "main" ("z1",1)  (6, "SB")

let%test "testPointeur4_f_b" = 
  test (pathFichiersRat^"testPointeur4.rat")  "f" ("b",1)  (-3, "LB")
    
let%test "testPointeur4_f_r" = 
  test (pathFichiersRat^"testPointeur4.rat")  "f" ("r",1)  (-2, "LB")
    
let%test "testPointeur4_f_i" = 
  test (pathFichiersRat^"testPointeur4.rat")  "f" ("i",1)  (-1, "LB")