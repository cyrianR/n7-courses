(* Module de la passe de gestion des identifiants *)
(* doit être conforme à l'interface Passe *)
open Tds
open Exceptions
open Ast

type t1 = Ast.AstSyntax.programme
type t2 = Ast.AstTds.programme

(* analyse_tds_affectable : tds -> AstSyntax.affectable -> bool -> AstTds.affectable *)
(* Paramètre tds : la table des symboles courante *)
(* Paramètre a : l'affectable à analyser *)
(* Paramètre modif : vrai si on fait une modification de la valeur de l'affectable *)
(* Vérifie la bonne utilisation des identifiants et tranforme l'affectable
en un affectable de type AstTds.affectable *)
(* Erreur si mauvaise utilisation des identifiants *)
let rec analyser_tds_affectable tds a modif =
  match a with
  | AstSyntax.Ident n -> 
    begin
      match chercherGlobalement tds n with
      | None -> raise (IdentifiantNonDeclare n)
      | Some info -> match info_ast_to_info info with
        | InfoVar _ -> AstTds.Ident(info)
        | InfoConst _ ->
          if modif then 
            raise (MauvaiseUtilisationIdentifiant n)
          else 
            AstTds.Ident(info)
        | InfoFun _ -> raise (MauvaiseUtilisationIdentifiant n)
    end
  | AstSyntax.Dereference a ->
    begin
      let na = analyser_tds_affectable tds a modif in
      AstTds.Dereference(na)
    end


(* analyse_tds_expression : tds -> AstSyntax.expression -> AstTds.expression *)
(* Paramètre tds : la table des symboles courante *)
(* Paramètre e : l'expression à analyser *)
(* Vérifie la bonne utilisation des identifiants et tranforme l'expression
en une expression de type AstTds.expression *)
(* Erreur si mauvaise utilisation des identifiants *)
let rec analyse_tds_expression tds e =
  match e with
  | AstSyntax.AppelFonction(id, le) ->
    begin
      match chercherGlobalement tds id with
      | None -> raise (IdentifiantNonDeclare id)
      | Some info -> match info_ast_to_info info with
        | InfoFun _ -> let nle = (List.map (analyse_tds_expression tds) le) in
            AstTds.AppelFonction(info, nle)
        | _ -> raise (MauvaiseUtilisationIdentifiant id)
    end
  | AstSyntax.Binaire (b, e1, e2) ->
    begin
      let ne1 = analyse_tds_expression tds e1 in
        let ne2 = analyse_tds_expression tds e2 in
          AstTds.Binaire(b, ne1, ne2)
    end
  | AstSyntax.Unaire (op, e1) ->
    begin
      let ne1 = analyse_tds_expression tds e1 in
        AstTds.Unaire(op, ne1)
    end
  | AstSyntax.Booleen b ->
    begin
      AstTds.Booleen b
    end
  | AstSyntax.Entier i ->
    begin
      AstTds.Entier i
    end
  | AstSyntax.Affectable a ->
    begin
      AstTds.Affectable(analyser_tds_affectable tds a false)
    end
  | Adresse add ->
    begin 
      match (chercherGlobalement tds add) with
      | None -> raise (IdentifiantNonDeclare add)
      | Some info -> 
        begin
          match (info_ast_to_info info) with
          | InfoVar _ -> AstTds.Adresse info
          | _ -> raise (MauvaiseUtilisationIdentifiant add)
        end
    end
  | AstSyntax.New t ->
    begin
      AstTds.New(t)
    end
  | AstSyntax.Null ->
    begin
      AstTds.Null
    end


(* analyse_tds_instruction : tds -> info_ast option -> AstSyntax.instruction -> AstTds.instruction *)
(* Paramètre tds : la table des symboles courante *)
(* Paramètre oia : None si l'instruction i est dans le bloc principal,
                   Some ia où ia est l'information associée à la fonction dans laquelle est l'instruction i sinon *)
(* Paramètre i : l'instruction à analyser *)
(* Vérifie la bonne utilisation des identifiants et tranforme l'instruction
en une instruction de type AstTds.instruction *)
(* Erreur si mauvaise utilisation des identifiants *)
let rec analyse_tds_instruction tds oia i =
  match i with
  | AstSyntax.Declaration (t, n, e) ->
      begin
        match chercherLocalement tds n with
        | None ->
            (* L'identifiant n'est pas trouvé dans la tds locale,
            il n'a donc pas été déclaré dans le bloc courant *)
            (* Vérification de la bonne utilisation des identifiants dans l'expression *)
            (* et obtention de l'expression transformée *)
            let ne = analyse_tds_expression tds e in
            (* Création de l'information associée à l'identfiant *)
            let info = InfoVar (n,Undefined, 0, "") in
            (* Création du pointeur sur l'information *)
            let ia = info_to_info_ast info in
            (* Ajout de l'information (pointeur) dans la tds *)
            ajouter tds n ia;
            (* Renvoie de la nouvelle déclaration où le nom a été remplacé par l'information
            et l'expression remplacée par l'expression issue de l'analyse *)
            AstTds.Declaration (t, ia, ne)
        | Some _ ->
            (* L'identifiant est trouvé dans la tds locale,
            il a donc déjà été déclaré dans le bloc courant *)
            raise (DoubleDeclaration n)
      end
  | AstSyntax.Affectation (a,e) ->
      begin
        AstTds.Affectation(analyser_tds_affectable tds a true, analyse_tds_expression tds e)
      end
  | AstSyntax.Constante (n,v) ->
      begin
        match chercherLocalement tds n with
        | None ->
          (* L'identifiant n'est pas trouvé dans la tds locale,
             il n'a donc pas été déclaré dans le bloc courant *)
          (* Ajout dans la tds de la constante *)
          ajouter tds n (info_to_info_ast (InfoConst (n,v)));
          (* Suppression du noeud de déclaration des constantes devenu inutile *)
          AstTds.Empty
        | Some _ ->
          (* L'identifiant est trouvé dans la tds locale,
          il a donc déjà été déclaré dans le bloc courant *)
          raise (DoubleDeclaration n)
      end
  | AstSyntax.Affichage e ->
      (* Vérification de la bonne utilisation des identifiants dans l'expression *)
      (* et obtention de l'expression transformée *)
      let ne = analyse_tds_expression tds e in
      (* Renvoie du nouvel affichage où l'expression remplacée par l'expression issue de l'analyse *)
      AstTds.Affichage (ne)
  | AstSyntax.Conditionnelle (c,t,e) ->
      (* Analyse de la condition *)
      let nc = analyse_tds_expression tds c in
      (* Analyse du bloc then *)
      let tast = analyse_tds_bloc tds oia t in
      (* Analyse du bloc else *)
      let east = analyse_tds_bloc tds oia e in
      (* Renvoie la nouvelle structure de la conditionnelle *)
      AstTds.Conditionnelle (nc, tast, east)
  | AstSyntax.TantQue (c,b) ->
      (* Analyse de la condition *)
      let nc = analyse_tds_expression tds c in
      (* Analyse du bloc *)
      let bast = analyse_tds_bloc tds oia b in
      (* Renvoie la nouvelle structure de la boucle *)
      AstTds.TantQue (nc, bast)
  | AstSyntax.Retour (e) ->
      begin
      (* On récupère l'information associée à la fonction à laquelle le return est associée *)
      match oia with
        (* Il n'y a pas d'information -> l'instruction est dans le bloc principal : erreur *)
      | None -> raise RetourDansMain
        (* Il y a une information -> l'instruction est dans une fonction *)
      | Some ia ->
        (* Analyse de l'expression *)
        let ne = analyse_tds_expression tds e in
        AstTds.Retour (ne,ia)
      end


(* analyse_tds_bloc : tds -> info_ast option -> AstSyntax.bloc -> AstTds.bloc *)
(* Paramètre tds : la table des symboles courante *)
(* Paramètre oia : None si le bloc li est dans le programme principal,
                   Some ia où ia est l'information associée à la fonction dans laquelle est le bloc li sinon *)
(* Paramètre li : liste d'instructions à analyser *)
(* Vérifie la bonne utilisation des identifiants et tranforme le bloc en un bloc de type AstTds.bloc *)
(* Erreur si mauvaise utilisation des identifiants *)
and analyse_tds_bloc tds oia li =
  (* Entrée dans un nouveau bloc, donc création d'une nouvelle tds locale
  pointant sur la table du bloc parent *)
  let tdsbloc = creerTDSFille tds in
  (* Analyse des instructions du bloc avec la tds du nouveau bloc.
     Cette tds est modifiée par effet de bord *)
   let nli = List.map (analyse_tds_instruction tdsbloc oia) li in
   (* afficher_locale tdsbloc ; *) (* décommenter pour afficher la table locale *)
   nli


(* analyse_tds_param : tds -> Type.typ * string -> Type.typ * info_ast *)
(* Paramètre tds : la table des symboles courante *)
(* Paramètre t : type du paramètre *)
(* Paramètre n : nom du paramètre *)
(* Vérifie la bonne utilisation d'une variable et tranforme nom de la variable en une info *)
(* Erreur si double déclaration de la variable *)
let analyse_tds_param tds (t, n) =
  match chercherLocalement tds n with
  | Some _ -> raise (DoubleDeclaration n)
  | None -> 
    let info = InfoVar(n, t, 0, "") in
    let ia = info_to_info_ast info in
    ajouter tds n ia;
    (t, ia)


(* analyse_tds_params : tds -> (Type.typ * string) list -> (Type.typ * info_ast) list *)
(* Paramètre tds : la table des symboles courante *)
(* Paramètre lp : liste des paramètres à analyser *)
(* Vérifie la bonne utilisation des variables d'une liste et tranforme les noms des variables de la liste en info *)
let analyse_tds_params tds lp =
  List.map (analyse_tds_param tds) lp


(* analyse_tds_fonction : tds -> AstSyntax.fonction -> AstTds.fonction *)
(* Paramètre maintds : la table des symboles courante *)
(* Paramètre : la fonction à analyser *)
(* Vérifie la bonne utilisation des identifiants et tranforme la fonction
en une fonction de type AstTds.fonction *)
(* Erreur si mauvaise utilisation des identifiants *)
let analyse_tds_fonction maintds (AstSyntax.Fonction(t,n,lp,li))  = 
  match chercherGlobalement maintds n with 
  | Some _ -> raise (DoubleDeclaration n)
  | None -> let info = InfoFun(n, t, List.map fst lp) in
    let ia = info_to_info_ast info in
    ajouter maintds n ia;
    let tdsparam = creerTDSFille maintds in
    let nlp = analyse_tds_params tdsparam lp in (* nouvelle liste de param *) 
    let nli = analyse_tds_bloc tdsparam (Some ia) li in (* nouveau bloc *)
    AstTds.Fonction(t, ia, nlp, nli)
      

(* analyse_tds_var : tds -> AstSyntax.var -> AstTds.var *)
(* Paramètre tds : la table des symboles courante *)
(* Paramètre : la variable à analyser *)
(* Vérifie la bonne utilisation des identifiants et transforme la variable globale en une variable globale de type AstTds.var *)
(* Erreur si mauvaise utilisation des identifiants *)
let analyse_tds_var tds (AstSyntax.Var (t, n, e)) =
  begin
    match chercherLocalement tds n with
    | None ->
        let ne = analyse_tds_expression tds e in
        let info = InfoVar (n,Undefined, 0, "") in
        let ia = info_to_info_ast info in
        ajouter tds n ia;
        AstTds.Var (t, ia, ne)
    | Some _ ->
        (* Identifiant trouvé dans la tds locale *)
        raise (DoubleDeclaration n)
    end


(* analyser : AstSyntax.programme -> AstTds.programme *)
(* Paramètre : le programme à analyser *)
(* Vérifie la bonne utilisation des identifiants et tranforme le programme
en un programme de type AstTds.programme *)
(* Erreur si mauvaise utilisation des identifiants *)
let analyser (AstSyntax.Programme (vars, fonctions, prog)) =
  let tds = creerTDSMere () in
  let nv = List.map (analyse_tds_var tds) vars in 
  let nf = List.map (analyse_tds_fonction tds) fonctions in
  let nb = analyse_tds_bloc tds None prog in
  AstTds.Programme (nv, nf, nb)
