%% Application : compression d'images

clear all
close all

%% Choix des constantes utilisées dans le programme

% tolérance
eps = 1e-8;

% nombre d'itérations max pour atteindre la convergence
maxit = 10000;

% pourcentage de la trace à atteindre
percentage = 0.995;

% p pour les versions subspace_iter_v2 et 3 (p utilisé comme taille)
puiss = 2;

% nombre de valeurs propres pour atteindre le pourcentage de la trace
% ci-dessus
k = 100;

% version de l'algorithme utilisée
% eig : 10
% puissance itérée : 11
% puissance itérée améliorée : 12
% subspace_iter_v0 : 0
% subspace_iter_v1 : 1
% subspace_iter_v2 : 2
% subspace_iter_v3 : 3
v = 10;

fprintf("\n========== Début du programme ==========\n")

% Lecture de l'image
I = imread('BD_Asterix_0.png');
I = rgb2gray(I);
I = double(I);

% Extraction de la taille de I
[q, p] = size(I);
fprintf("\nL'image choisie a pour dimensions : %d * %d\n", q, p)

% On fait pivoter l'image si elle n'est pas dans le bon sens
bonSens = p <= q;
if ~bonSens
    I = I';
    [q, p] = size(I);
end

% Construction de sigma k
fprintf("\n Construction de la matrice sigma_k et des vecteurs u_k et v_k : ")
M = I*I';
switch v
    case 10     %eig
        [vect_p, val_p] = eig(M);
end

[val_p, indices] = sort(sqrt(diag(val_p)), 'descend');
sigma_k = diag(val_p(1:k));
u_k = vect_p(:, indices(1:k));

v_k = zeros(q,k);
for i = 1:k
    v_k(:,i) = I'*u_k(:,i)/sigma_k(i,i);
end

fprintf("OK.\n")
