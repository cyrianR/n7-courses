(* Module de la passe de gestion des placements mémoires *)
(* doit être conforme à l'interface Passe *)
open Tds
(* open Exceptions *)
open Ast
open Type

type t1 = Ast.AstType.programme
type t2 = Ast.AstPlacement.programme

(* analyse_placement_instruction : AstType.instruction -> int -> string -> AstPlacement.instruction * int *)
(* Paramètre i : l'instruction à analyser *)
(* Paramètre depl : le déplacement par rapport au début du registre *)
(* Paramètre reg : le registre *)
(* Calcule la taille de l'instruction et tranforme l'instruction
en une instruction de type AstPlacement.instruction *)
let rec analyse_placement_instruction i depl reg =
  match i with
  | AstType.Declaration (info, e) ->
      begin
        match info_ast_to_info info with
        | InfoVar (_, typ, _, _) ->
          modifier_adresse_variable depl reg info;
          (AstPlacement.Declaration (info, e), getTaille typ)
        | _ -> failwith "L'info n'est pas une InfoVar."
      end
  | AstType.Conditionnelle (c, t, e) ->
      begin
        let nt = analyse_placement_bloc t depl reg in
        let ne = analyse_placement_bloc e depl reg in
        (AstPlacement.Conditionnelle (c, nt, ne), 0)
      end
  | AstType.TantQue (c,b) ->
      begin
        let nb = analyse_placement_bloc b depl reg in
        (AstPlacement.TantQue (c, nb), 0)
      end
  | AstType.Retour (e, ia) ->
      begin
        match info_ast_to_info ia with
        | InfoConst _ -> (AstPlacement.Retour(e, getTaille Int, 0), 0)
        | InfoVar (_, t, _, _) -> (AstPlacement.Retour(e, getTaille t, 0), 0)
        | InfoFun (_, t, lt) -> (AstPlacement.Retour (e, getTaille t, List.fold_right (+) (List.map getTaille lt) 0), 0)
      end
  | AstType.Affectation (a, e) ->
      begin
        (AstPlacement.Affectation(a, e), 0)
      end
  | AstType.AffichageInt e -> 
      begin
        (AstPlacement.AffichageInt (e), 0)
      end
  | AstType.AffichageRat e -> 
      begin
        (AstPlacement.AffichageRat (e), 0)
      end
  | AstType.AffichageBool e -> 
      begin
        (AstPlacement.AffichageBool (e), 0)
      end
  | AstType.AffichagePointer e ->
      begin
        (AstPlacement.AffichagePointer (e), 0)
      end
  | AstType.Empty -> (AstPlacement.Empty, 0)


(* analyse_placement_bloc : AstType.instruction list ->
int -> string -> AstPlacement.instruction list * int *)
(* Paramètre li : liste d'instructions à analyser *)
(* Paramètre depl : le déplacement par rapport au début du registre *)
(* Paramètre reg : le registre *)
(* Calcule la taille du bloc et transforme le bloc en un bloc de type AstPlacement.bloc *)
and analyse_placement_bloc li depl reg =
  match li with
  | [] -> ([], 0)
  | t::q -> let (ni, ti) = analyse_placement_instruction t depl reg in
            let (nq, tq) = analyse_placement_bloc q (depl + ti) reg in
              (ni::nq, ti + tq)


(* analyse_placement_fonction : AstType.fonction -> AstPlacement.fonction *)
(* Paramètre : la fonction à analyser *)
(* Tranforme la fonction en une fonction de type AstPlacement.fonction *)
let analyse_placement_fonction (AstType.Fonction (info, lp, li)) =
  let nlp = List.fold_right (fun t (depl, acc) ->
                              match info_ast_to_info t with
                              | InfoVar (_, typ, _, _) ->
                                  modifier_adresse_variable (depl - getTaille typ) "LB" t;
                                  (depl - getTaille typ, t :: acc)
                              | _ -> failwith "L'info n'est pas une InfoVar."
                            ) lp (0, []) |> snd in
  let nb = analyse_placement_bloc li 3 "LB" in
  AstPlacement.Fonction(info, nlp, nb)


(* analyse_placement_var : AstType.var -> int -> AstPlacement.var * int *)
(* Paramètre : la variable globale à analyser *)
(* Paramètre depl : le déplacement courant *)
(* Renvoie la variable e avec le déplacement mémoire mis à jour *)
let analyse_placement_var  (AstType.Var (info, e)) depl =
  match info_ast_to_info info with
  | InfoVar(_,t,_,_) -> modifier_adresse_variable depl "SB" info;
      (AstPlacement.Var(info,e), getTaille t)
  | _ -> failwith "L'info n'est pas une InfoVar."


(* analyse_placement_vars : AstType.var list -> AstPlacement.var list * int *)
(* Paramètre vars : les variables globales à analyser *)
(* Renvoie la liste des variables globales avec le déplacement associé *)
let rec analyse_placement_vars vars = 
  match vars with
  | [] -> [], 0
  | t::q -> 
    let (nq,depl) = analyse_placement_vars q in
    let (nv,t) = (analyse_placement_var t depl) in
    nv::(nq), depl+t


(* analyser : AstType.programme -> AstPlacement.programme *)
(* Paramètre : le programme à analyser *)
(* Tranforme le programme en un programme de type AstPlacement.programme *)
let analyser (AstType.Programme (vars, fonctions, prog)) =
  let nv, delta = (analyse_placement_vars vars) in
  let nlf = List.map analyse_placement_fonction fonctions in
  let nb = analyse_placement_bloc prog 0 "SB" in
  AstPlacement.Programme (nv, nlf, nb, delta)