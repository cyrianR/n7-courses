with Text_Io;               use Text_Io;
with Ada.Integer_Text_Io;   use Ada.Integer_Text_Io;


-- Auteur : SAHIR Aya
--
-- Jouer au jeu du devin avec l'ordinateur qui doit deviner un nombre entre 1 et 999 
procedure Jeu_devin_Exo2 is

        Choisi : Character ; -- indique si le joueur a choisi un nombre (vaut "o" dans ce cas)
        Retour : Character ; -- caractère qui modélise le retour de l'utilisateur lorsque l'ordinateur propose un nombre
        Min : Integer ; -- Min et Max deux bornes entre lesquels on cherche le nombre à deviner 
        Max : Integer ; 
        Tentatives : Integer ; -- nombre de tentatives effectuées par l'ordinateur
        Est_Trouve : Boolean ; -- vrai lorsque l'utilisateur a deviné le nombre
        Nombre_Candidat : Integer ; -- proposition donnée par l'ordinateur 
        A_Triche : Boolean ; -- vrai si l'utilisateur a triché

begin
        A_Triche := False;
        Est_Trouve := False;
        New_Line;

        -- Demander à l'utilisateur de choisir un nombre
        loop
                Put("Avez-vous choisi un nombre ? (o/n) ");
                Get(Choisi);

                -- Traiter la réponse de l'utilisateur
                if (Choisi /= 'o' and  Choisi /= 'O' ) then
                        Put("J'attends");
                        New_Line;
                else
                        null;
                end if;

                exit when (Choisi = 'o' or Choisi = 'O');
        end loop;

       -- Essayer de retrouver le nombre
       Min := 1;
       Max := 999;
       Tentatives := 0;
       loop
               Tentatives := Tentatives + 1 ;
               
               -- Proposer un nombre candidat par dichotomie    
               Nombre_Candidat := ( Min + Max )/2;
               Put("Proposition : ");
               Put(Nombre_Candidat,1);
               New_Line;

               -- Demander le retour de l'utilisateur
               Put("Le nombre est trop (p)etit, (g)rand ou (t)rouvé?");
               Get(Retour);

               -- Traiter le retour de l'utilisateur
               if ( Retour = 'g' or  Retour = 'G' ) then
                       Max := Nombre_Candidat-1 ;
                       Est_Trouve := False ;
               elsif ( Retour = 'p' or Retour = 'P' ) then
                       Min := Nombre_Candidat+1 ;
                       Est_Trouve := False ;
               elsif ( Retour = 't' or Retour = 'T' ) then
                       Est_Trouve := True ;
               else
                       Put("Je n'ai pas compris. Merci de répondre:");
                       New_Line ;
                       Put("   g si ma proposition est trop grande");
                       New_Line ;
                       Put("   p si ma proposition est trop petite");
                       New_Line ;
                       Put("   t si j'ai trouvé le nombre");
                       New_Line;
                       Est_Trouve := False;
               end if;

               -- Traiter le cas de triche
               if ( Min > Max ) and not Est_Trouve then
                  A_Triche := True;
                  New_Line ;
               else
                   Null;
               end if;

               exit when Est_Trouve or A_Triche;
       end loop;

       -- Afficher un message de fin de jeu 
       if A_Triche then
               Put("Tu triches !");
       else
               Put("J'ai trouvé ");
               Put(Nombre_Candidat, 1);
               Put(" en ");
               Put(Tentatives, 1);
               Put(" tentatives.");
       end if;
       New_Line;

end Jeu_Devin_Exo2;

