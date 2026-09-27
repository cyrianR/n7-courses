open Rat
open Compilateur

(* Changer le chemin d'accès du jar. *)
let runtamcmde = "java -jar ../../../../../tests/runtam.jar"
(* let runtamcmde = "java -jar /mnt/n7fs/.../tools/runtam/runtam.jar" *)

(* Execute the TAM code obtained from the rat file and return the ouptut of this code *)
let runtamcode cmde ratfile =
  let tamcode = compiler ratfile in
  let (tamfile, chan) = Filename.open_temp_file "test" ".tam" in
  output_string chan tamcode;
  close_out chan;
  let ic = Unix.open_process_in (cmde ^ " " ^ tamfile) in
  let printed = input_line ic in
  close_in ic;
  Sys.remove tamfile;    (* à commenter si on veut étudier le code TAM. *)
  String.trim printed

(* Compile and run ratfile, then print its output *)
let runtam ratfile =
  print_string (runtamcode runtamcmde ratfile)

(****************************************)
(** Chemin d'accès aux fichiers de test *)
(****************************************)

let pathFichiersRat = "../../../../../tests/tam/avec_pointeur/fichiersRat/"

(**********)
(*  TESTS *)
(**********)


(* requires ppx_expect in jbuild, and `opam install ppx_expect` *)
let%expect_test "testModifVar" =
  runtam (pathFichiersRat^"testModifVar.rat");
  [%expect{| [3/2] |}]

let%expect_test "testEgalitePointeurNull" =
  runtam (pathFichiersRat^"testEgalitePointeurNull.rat");
  [%expect{| 1 |}]

let%expect_test "testNewPointeur" =
  runtam (pathFichiersRat^"testNewPointeur.rat");
  [%expect{| [4/5] |}]

let%expect_test "testPointeurMultiple" =
  runtam (pathFichiersRat^"testPointeurMultiple.rat");
  [%expect{| 8 |}]

let%expect_test "testPointeurMultipleEtrange" =
  runtam (pathFichiersRat^"testPointeurMultipleEtrange.rat");
  [%expect{| 11 |}]



