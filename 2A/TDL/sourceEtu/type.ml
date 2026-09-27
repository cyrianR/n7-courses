type typ = Bool | Int | Rat | Undefined | Pointer of typ

let rec string_of_type t = 
  match t with
  | Bool ->  "Bool"
  | Int  ->  "Int"
  | Rat  ->  "Rat"
  | Undefined -> "Undefined"
  | Pointer t -> (string_of_type t)^"*"


let rec est_compatible t1 t2 =
  match t1, t2 with
  | Bool, Bool -> true
  | Int, Int -> true
  | Rat, Rat -> true 
  | Pointer t1, Pointer t2 -> 
    if t1 = Undefined || t2 = Undefined then
      true
    else
      est_compatible t1 t2
  | _ -> false 

let%test _ = est_compatible Bool Bool
let%test _ = est_compatible Int Int
let%test _ = est_compatible Rat Rat
let%test _ = not (est_compatible Int Bool)
let%test _ = not (est_compatible Bool Int)
let%test _ = not (est_compatible Int Rat)
let%test _ = not (est_compatible Rat Int)
let%test _ = not (est_compatible Bool Rat)
let%test _ = not (est_compatible Rat Bool)
let%test _ = not (est_compatible Int Undefined)
let%test _ = not (est_compatible Rat Undefined)
let%test _ = not (est_compatible Bool Undefined)
let%test _ = not (est_compatible Undefined Int)
let%test _ = not (est_compatible Undefined Rat)
let%test _ = not (est_compatible Undefined Bool)
let%test _ = est_compatible (Pointer Rat) (Pointer Rat)
let%test _ = est_compatible (Pointer Int) (Pointer Int)
let%test _ = est_compatible (Pointer Bool) (Pointer Bool)
let%test _ = est_compatible (Pointer (Pointer Rat)) (Pointer (Pointer Rat))
let%test _ = est_compatible (Pointer (Pointer Int)) (Pointer (Pointer Int))
let%test _ = est_compatible (Pointer (Pointer Bool)) (Pointer (Pointer Bool))
let%test _ = est_compatible (Pointer Undefined) (Pointer Int)
let%test _ = est_compatible (Pointer Undefined) (Pointer Rat)
let%test _ = est_compatible (Pointer Undefined) (Pointer Bool)
let%test _ = est_compatible (Pointer Int) (Pointer Undefined)
let%test _ = est_compatible (Pointer Rat) (Pointer Undefined)
let%test _ = est_compatible (Pointer Bool) (Pointer Undefined)
let%test _ = not (est_compatible Int Undefined)
let%test _ = not (est_compatible Rat Undefined)
let%test _ = not (est_compatible Bool Undefined)
let%test _ = not (est_compatible Undefined Int)
let%test _ = not (est_compatible Undefined Rat)
let%test _ = not (est_compatible Undefined Bool)
let%test _ = not (est_compatible (Pointer Rat) (Pointer Int))
let%test _ = not (est_compatible (Pointer Bool) (Pointer Int))
let%test _ = not (est_compatible (Pointer Int) (Pointer Rat))
let%test _ = not (est_compatible (Pointer Int) (Pointer Bool))
let%test _ = not (est_compatible (Pointer Bool) (Pointer Rat))
let%test _ = not (est_compatible (Pointer Rat) (Pointer Bool))
let%test _ = not (est_compatible (Pointer Int) Undefined)
let%test _ = not (est_compatible (Pointer Bool) Undefined)
let%test _ = not (est_compatible (Pointer Rat) Undefined)
let%test _ = not (est_compatible Undefined (Pointer Int))
let%test _ = not (est_compatible Undefined (Pointer Bool))
let%test _ = not (est_compatible Undefined (Pointer Rat))

let est_compatible_list lt1 lt2 =
  try
    List.for_all2 est_compatible lt1 lt2
  with Invalid_argument _ -> false

let%test _ = est_compatible_list [] []
let%test _ = est_compatible_list [Int ; Rat] [Int ; Rat]
let%test _ = est_compatible_list [Bool ; Rat ; Bool] [Bool ; Rat ; Bool]
let%test _ = not (est_compatible_list [Int] [Int ; Rat])
let%test _ = not (est_compatible_list [Int] [Rat ; Int])
let%test _ = not (est_compatible_list [Int ; Rat] [Rat ; Int])
let%test _ = not (est_compatible_list [Bool ; Rat ; Bool] [Bool ; Rat ; Bool ; Int])

let getTaille t =
  match t with
  | Int -> 1
  | Bool -> 1
  | Rat -> 2
  | Undefined -> 0
  | Pointer _ -> 1
  
let%test _ = getTaille Int = 1
let%test _ = getTaille Bool = 1
let%test _ = getTaille Rat = 2
let%test _ = getTaille Undefined = 0
let%test _ = getTaille (Pointer Int) = 1
let%test _ = getTaille (Pointer Rat) = 1
let%test _ = getTaille (Pointer Bool) = 1
let%test _ = getTaille (Pointer Undefined) = 1

