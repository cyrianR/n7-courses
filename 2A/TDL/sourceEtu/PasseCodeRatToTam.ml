(* Module de la passe de génération de code *)
(* doit être conforme à l'interface Passe *)
open Tds
open Ast
open Tam
open Type
open Code

type t1 = Ast.AstPlacement.programme
type t2 = string

(* analyse_code_affectable : AstType.affectable -> bool -> bool -> string *)
(* Paramètre a : l'affectable à analyser *)
(* Paramètre modif : vrai si on fait une modification de la valeur de l'affectable *)
(* Paramètre isDeref : vrai si l'affectable a déjà subit un déréférencement *)
(* Transforme l'affectable en code TAM *)
let rec analyse_code_affectable a modif isDeref =
  match a with
  | AstType.Ident(info) ->
    begin
      match info_ast_to_info info with
      | InfoVar (_, t, adr, reg) ->
        if (modif && not isDeref) then
          (store (getTaille(t)) adr reg)
        else
          (load (getTaille(t)) adr reg) 
      | InfoConst (_, v) -> loadl_int v
      | _ -> failwith "L'info est une InfoFun." 
    end
  | AstType.Dereference(a, _) ->
    begin
      let res =
        if (modif && not isDeref) then
          (storei 1)
        else
          (loadi 1) (* un pointeur correspond à un entier qui est de taille 1 *)
      in (analyse_code_affectable a modif true)^res
    end


(* analyse_code_expression : AstType.expression -> string *)
(* Paramètre e : l'expression à analyser *)
(* Transforme l'expression en code TAM *)
let rec analyse_code_expression e =
  match e with
   | AstType.AppelFonction (info, le) ->
    begin
      match info_ast_to_info info with
      | InfoFun(n, _, _) -> (List.fold_right (fun e res -> analyse_code_expression e ^ res) le "") ^ (call "ST" n)
      | _ -> failwith "L'info n'est pas une InfoFun." 
    end
  | AstType.Booleen b -> if b then (loadl_int 1) else (loadl_int 0)
  | AstType.Entier i -> (loadl_int i) 
  | AstType.Unaire (op, e) ->
    begin
      let ne = analyse_code_expression e in
      match op with
      | Numerateur -> ne ^ (pop 0 1)
      | Denominateur -> ne ^ (pop 1 1)
    end
  | AstType.Binaire (b, e1, e2) ->
      (analyse_code_expression e1) ^ 
      (analyse_code_expression e2) ^
      begin
        match b with
        | Fraction -> call "SB" "norm"
        | PlusInt -> subr "IAdd"
        | PlusRat -> call "SB" "RAdd"
        | MultInt -> subr "IMul"
        | MultRat -> call "SB" "RMul"
        | EquInt -> subr "IEq"
        | EquBool -> subr "IEq"
        | EquPointer -> subr "IEq"
        | Inf -> subr "ILss"
      end
  | AstType.Affectable(a) ->
    begin
      (analyse_code_affectable a false false)
    end
  | AstType.New t ->
    begin
      match t with
      | _ -> (loadl_int (getTaille t) ^ subr "MAlloc")
    end
  | AstType.Adresse info ->
    begin
      match info_ast_to_info info with
      | InfoVar (_, _, adr, reg) -> loada adr reg
      | _ -> failwith "L'info n'est pas une InfoVar."
    end
  | AstType.Null ->
    begin
      loadl_int 0
    end


(* analyse_code_instruction : AstPlacement.instruction -> string *)
(* Paramètre i : l'instruction à analyser *)
(* Transforme l'instruction en code TAM *)
let rec analyse_code_instruction i =
  match i with
  | AstPlacement.Declaration (info, e) ->
    begin
      match info_ast_to_info info with
      | InfoVar (_, t, adr, reg) -> 
        let ne = analyse_code_expression e in
        (push (getTaille(t))) ^ ne ^ (store (getTaille(t)) adr reg)
      | _ -> failwith "L'info n'est pas une InfoVar."
    end
  | AstPlacement.Affectation (a, e) ->
    begin
      let ne = analyse_code_expression e in
      let na = analyse_code_affectable a true false in 
        ne ^ na
    end
  | AstPlacement.AffichageInt e -> (analyse_code_expression e) ^ (subr "IOut")
  | AstPlacement.AffichageRat e -> (analyse_code_expression e) ^ (call "SB" "ROut")
  | AstPlacement.AffichageBool e -> (analyse_code_expression e) ^ (subr "BOut")
  | AstPlacement.AffichagePointer e -> (analyse_code_expression e) ^ (subr "IOut")
  | AstPlacement.Conditionnelle (c, t, e) ->
    begin
      let etiq1 = getEtiquette () in
      let etiq2 = getEtiquette () in
      (analyse_code_expression c) ^ (jumpif 0 etiq1) ^ (analyse_code_bloc t) ^ (jump etiq2) ^ etiq1 ^ "\n" ^ (analyse_code_bloc e) ^ etiq2 ^ "\n"
    end
  | AstPlacement.TantQue (c, b) ->
    begin
      let nc = analyse_code_expression c in
      let nb = analyse_code_bloc b in
      let debut = getEtiquette() in
      let fin = getEtiquette() in
      debut ^ "\n" ^ nc ^ (jumpif 0 fin) ^ nb ^ (jump debut) ^ fin ^ "\n"
    end
  | AstPlacement.Retour (e, tailleRet, tailleParam) ->
    (analyse_code_expression e) ^ (Tam.return tailleRet tailleParam)
  | Empty -> ""


(* analyse_code_bloc : AstPlacement.instruction list * int -> string *)
(* Paramètre li : liste d'instructions à analyser *)
(* Paramètre taille : taille mémoire des allocations *)
(* Tranforme le bloc en code TAM *)
and analyse_code_bloc (li, taille) =
  (String.concat "" (List.map analyse_code_instruction li)) ^ (pop 0 taille)


(* analyse_code_fonction : AstPlacement.fonction -> string *)
(* Paramètre : la fonction à analyser *)
(* Tranforme la fonction en code TAM *)
let analyse_code_fonction (AstPlacement.Fonction (info, _, (li, _))) =
  match info_ast_to_info info with
  | InfoFun (nom, t, _) -> (label nom) ^ analyse_code_bloc (li, (getTaille t)) ^ halt
  | _ -> failwith "error"


(* analyse_code_var : AstPlacement.var -> t2 *)
(* Paramètre : la variable à analyser *)
(* Tranforme la variable en code TAM *)
let analyse_code_var (AstPlacement.Var(info, e)) = analyse_code_instruction (AstPlacement.Declaration (info, e))


(* analyser : AstPlacement.programme -> string *)
(* Paramètre : le programme *)
(* Tranforme la fonction en code TAM *)
let analyser (AstPlacement.Programme(vars, fonctions, prog, delta)) =
  (getEntete()) ^ (String.concat "" (List.map analyse_code_fonction fonctions)) ^ "main\n" ^ (String.concat "" (List.map analyse_code_var vars)) ^ push delta ^ (analyse_code_bloc prog) ^ halt