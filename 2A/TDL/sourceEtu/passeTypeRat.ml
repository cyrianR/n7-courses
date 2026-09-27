(* Module de la passe de gestion des identifiants *)
(* doit être conforme à l'interface Passe *)
open Tds
open Exceptions
open Ast
open Type

type t1 = Ast.AstTds.programme
type t2 = Ast.AstType.programme

(* analyse_type_affectable : AstTds.affectable -> AstType.affectable * typ *)
(* Paramètre a : l'affectable à analyser *)
(* Vérifie la bonne utilisation des types et tranforme l'affectable
en un affectable de type AstType.affectable *)
(* Erreur si type inattendu *)
let rec analyser_type_affectable a = 
  match a with
  | AstTds.Ident info -> 
    begin
      match info_ast_to_info info with
      | InfoVar(_,typ,_,_) -> (AstType.Ident(info), typ)
      | InfoConst _ -> (AstType.Ident(info), Int)
      | _ -> failwith "L'info est une InfoFun."
    end
  | AstTds.Dereference(a) -> 
    begin
      let na, ta = analyser_type_affectable a in
      match na, ta with
      | (na, Pointer(typ)) -> (AstType.Dereference(na, typ), typ)
      | (_, _) -> raise (TypeNonPointeur)
    end


(* analyse_type_expression : AstTds.expression -> AstType.expression * typ *)
(* Paramètre e : l'expression à analyser *)
(* Vérifie la bonne utilisation des types et tranforme l'expression
en une expression de type AstType.expression *)
(* Erreur si type inattendu *)
let rec analyse_type_expression e =
  match e with
  | AstTds.AppelFonction(info, le) ->
    begin
      match info_ast_to_info info with
      | InfoFun(_, tr, tp) ->
        let l = List.map analyse_type_expression le in
        let np = List.map fst l in
        let ntp = List.map snd l in
        if est_compatible_list tp ntp then
          (AstType.AppelFonction(info, np), tr)
        else raise (TypesParametresInattendus (ntp, tp))
      | _ -> failwith "L'info n'est pas une InfoFun."
    end
  | AstTds.Affectable(a) ->
    let (na, typ) = analyser_type_affectable a in
      (AstType.Affectable na, typ)
  | AstTds.Binaire (op, e1, e2) ->
    begin
      let (ne1, te1) = analyse_type_expression(e1) in
      let (ne2, te2) = analyse_type_expression(e2) in 
      match te1, op ,te2 with
      | Int, Plus, Int -> (AstType.Binaire(PlusInt, ne1, ne2), Int)
      | Rat, Plus, Rat -> (AstType.Binaire(PlusRat, ne1, ne2), Rat)
      | Int, Fraction, Int -> (AstType.Binaire(Fraction, ne1, ne2), Rat)
      | Int, Mult, Int -> (AstType.Binaire(MultInt, ne1, ne2), Int)
      | Rat, Mult, Rat -> (AstType.Binaire(MultRat, ne1, ne2), Rat)
      | Int, Equ, Int -> (AstType.Binaire(EquInt, ne1, ne2), Bool)
      | Bool, Equ, Bool -> (AstType.Binaire(EquBool, ne1, ne2), Bool)
      | Int, Inf, Int -> (AstType.Binaire(Inf, ne1, ne2), Bool)
      | Pointer _, Equ, Pointer _ -> (AstType.Binaire(EquPointer, ne1, ne2),Bool)
      | _ -> raise (TypeBinaireInattendu (op, te1, te2))
    end
  | AstTds.Unaire (op, e1) ->
    begin
      let (ne1, te1) = analyse_type_expression(e1) in
      match op, te1 with
      | Numerateur, Rat -> (AstType.Unaire (Numerateur, ne1), Int)
      | Denominateur , Rat -> (AstType.Unaire (Denominateur, ne1), Int)
      | _ -> raise (TypeInattendu (te1, Rat))
    end
  | AstTds.Booleen b ->
    begin
      (AstType.Booleen b, Bool)
    end
  | AstTds.Entier i ->
    begin
      (AstType.Entier i, Int)
    end
  | AstTds.Adresse info -> 
    begin
      match info_ast_to_info info with
      | InfoVar(_, t, _, _) -> (AstType.Adresse(info), Pointer(t))
      | _ -> failwith "L'info n'est pas une InfoFun."
    end
  | AstTds.New t ->
    begin
      (AstType.New t, Pointer(t))
    end
  | AstTds.Null ->
    begin
      (AstType.Null, Pointer(Undefined))
    end
  

(* analyse_type_instruction : AstTds.instruction -> AstType.instruction *)
(* Paramètre i : l'instruction à analyser *)
(* Vérifie la bonne utilisation des types et tranforme l'instruction
en une instruction de type AstType.instruction *)
(* Erreur si type inattendu *)
let rec analyse_type_instruction i =
  match i with
  | AstTds.Declaration (t, info, e) ->
      begin
        let (ne, te) = (analyse_type_expression e) in
        if (est_compatible t te) then
          begin
            modifier_type_variable t info;
            AstType.Declaration (info, ne)
          end
        else
          raise (TypeInattendu (te, t))
      end
  | AstTds.Affectation (a, e) ->
      begin
        let (na, ta) = analyser_type_affectable a in
        let (ne, te) = analyse_type_expression e in
          if (est_compatible ta te) then 
            AstType.Affectation(na, ne)
          else 
            raise (TypeInattendu(te, ta))
      end
  | AstTds.Affichage e -> 
      begin
        let (ne, te) = analyse_type_expression e in 
          match te with
          | Int -> AstType.AffichageInt (ne)
          | Bool -> AstType.AffichageBool (ne)
          | Rat -> AstType.AffichageRat (ne)
          | Pointer _ -> AstType.AffichagePointer (ne)
          | _ -> failwith "Mauvais type voulant être affiché"
      end
  | AstTds.Conditionnelle (c, t, e) ->
      begin
        let (nc, tc) = analyse_type_expression c in 
        if (tc == Bool) then
          let nt = analyse_type_bloc(t) in
          let ne = analyse_type_bloc(e) in
          AstType.Conditionnelle(nc, nt, ne)
        else raise (TypeInattendu (tc, Bool))
      end
  | AstTds.TantQue (c,b) ->
      begin
        let (nc, tc) = analyse_type_expression c in 
        if (tc == Bool) then
          let nb = analyse_type_bloc(b) in
          AstType.TantQue(nc, nb)
        else raise (TypeInattendu (tc, Bool))
      end
  | AstTds.Retour (e, ia) ->
      begin
        let (ne, te) = analyse_type_expression e in 
        match info_ast_to_info ia with
        | InfoFun (_, typ, _) ->
          if (est_compatible typ te) then
            AstType.Retour(ne, ia)
          else
            raise (TypeInattendu (te, typ))
        | InfoConst (_, _) -> AstType.Retour(ne, ia)
        | InfoVar (_, typ, _, _) ->
          if (est_compatible typ te) then
            AstType.Retour(ne, ia)
          else
            raise (TypeInattendu (te, typ))
      end
  | AstTds.Empty -> AstType.Empty


(* analyse_type_bloc : AstTds.instruction list -> AstType.instruction list *)
(* Paramètre li : liste d'instructions à analyser *)
(* Tranforme le bloc en un bloc de type AstType.bloc *)
and analyse_type_bloc li =
   let nli = List.map analyse_type_instruction li in
   nli


(* analyse_type_fonction : AstTds.fonction -> AstType.fonction *)
(* Paramètre : la fonction à analyser *)
(* Tranforme la fonction en une fonction de type AstType.fonction *)
let analyse_type_fonction (AstTds.Fonction(t, info, lp, li))  = 
  let nli = analyse_type_bloc li in
  let lt1 = List.map fst lp in
  let lt2 = List.map snd lp in
  modifier_type_fonction t lt1 info;
  List.iter (fun (t, ia) -> modifier_type_variable t ia) lp;
  AstType.Fonction(info, lt2, nli)


(* analyse_type_fonctions : AstTds.fonction list -> AstType.fonction list *)
(* Paramètre : la liste des fonctions à analyser *)
(* Tranforme la liste de fonctions en une liste de fonctions de type AstType.fonction *)
let analyse_type_fonctions lf = List.map analyse_type_fonction lf


(* analyse_type_var : AstTds.var -> AstType.var *)
(* Paramètre : la variable contenant le type à analyser *)
(* Transforme le type d'une variable en un type de type AstTds *)
let analyse_type_var (AstTds.Var (t, info, e)) = 
  let (ne,te) = analyse_type_expression(e) in 
  if est_compatible t te then
    begin
      modifier_type_variable t info;
      AstType.Var (info, ne)
    end
  else
    raise (TypeInattendu (te, t))

(* analyse_type_vars : AstTds.var list -> AstType.var *)
(* Paramètre : la liste de variables globales à analyser *)
(* Tranforme la liste de variables globales en une liste de variables globales de type AstType.var *)
let analyse_type_vars lv = List.map analyse_type_var lv

(* analyser : AstTds.programme -> AstType.programme *)
(* Paramètre : le programme à analyser *)
(* Tranforme le programme en un programme de type AstType.programme *)
let analyser (AstTds.Programme (vars, fonctions, prog)) =
  let nv = analyse_type_vars vars in
  let nf = analyse_type_fonctions fonctions in
  let nb = analyse_type_bloc prog in
  AstType.Programme (nv, nf, nb)