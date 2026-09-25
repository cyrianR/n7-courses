%%  Application de la SVD : compression d'images

clear all
close all

% Lecture de l'image
I = imread('BD_Asterix_1.png');
I = rgb2gray(I);
I = double(I);

[q, p] = size(I)

% Décomposition par SVD
fprintf('Décomposition en valeurs singulières\n')
tic
[U, S, V] = svd(I);
toc

l = min(p,q);

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% On choisit de ne considérer que 200 vecteurs
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

% vecteur pour stocker la différence entre l'image et l'image reconstuite
inter = 1:40:(200+40);
inter(end) = 500;
differenceSVD = zeros(size(inter,2), 1);

% images reconstruites en utilisant de 1 à 200 vecteurs (avec un pas de 40)
ti = 0;
td = 0;
for k = inter

    % Calcul de l'image de rang k
    Im_k = U(:, 1:k)*S(1:k, 1:k)*V(:, 1:k)';

    % Affichage de l'image reconstruite
    ti = ti+1;
    figure(ti)
    colormap('gray')
    imagesc(Im_k), axis equal
    
    % Calcul de la différence entre les 2 images
    td = td + 1;
    differenceSVD(td) = sqrt(sum(sum((I-Im_k).^2)));
    %pause
end

% Figure des différences entre image réelle et image reconstruite
ti = ti+1;
figure(ti)
hold on 
plot(inter, differenceSVD, 'rx')
ylabel('RMSE')
xlabel('rank k')
%pause


% Plugger les différentes méthodes : eig, puissance itérée et les 4 versions de la "subspace iteration method" 

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% QUELQUES VALEURS PAR DÉFAUT DE PARAMÈTRES, 
% VALEURS QUE VOUS POUVEZ/DEVEZ FAIRE ÉVOLUER
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

% tolérance
eps = 1e-8;
% nombre d'itérations max pour atteindre la convergence
maxit = 10000;

% taille de l'espace de recherche (m)
search_space = 600;

% pourcentage que l'on se fixe
percentage = 0.995;

% p pour les versions 2 et 3 (attention p déjà utilisé comme taille)
puiss = 8;

%%%%%%%%%%%%%
% À COMPLÉTER
%%%%%%%%%%%%%

% version de l'algorithme utilisée
% eig : 10
% puissance itérée améliorée : 12
% subspace_iter_v0 : 0
% subspace_iter_v1 : 1
% subspace_iter_v2 : 2
% subspace_iter_v3 : 3
v = 10;

% On fait pivoter l'image si elle n'est pas dans le bon sens
bonSens = p <= q;
if ~bonSens
    I = I';
    [q, p] = size(I);
end

%%
% calcul des couples propres
%%
switch v
    case 10
        [vect_p, val_p] = eig(I*I');
    case 12
        [vect_p, val_p, n_ev, itv, flag] = power_v12(I*I', k, percentage, eps, maxit);
    case 0
        [vect_p, val_p] = subspace_iter_v0(I*I', k, eps, maxit);
    case 1
        [vect_p, val_p] = subspace_iter_v1(I*I', k, percentage, eps, maxit);
    case 2
        [vect_p, val_p] = subspace_iter_v2(I*I', k, percentage, p, eps, maxit);
    case 3
        [vect_p, val_p] = subspace_iter_v3(I*I', k, percentage, p, eps, maxit);
end
%%
% calcul des valeurs singulières
%%
[val_p, indices] = sort(sqrt(diag(val_p)), 'descend');
sigma_k = diag(val_p(1:k));
u_k = vect_p(:, indices(1:k));
%%
% calcul de l'autre ensemble de vecteurs
%%
v_k = zeros(p,k);
for i = 1:k
    v_k(:,i) = I'*u_k(:,i)/sigma_k(i,i);
end

I_k = u_k*sigma_k*v_k';

if ~bonSens
    I_k  = I_k';
end

figure(ti+1)
colormap('gray')
imagesc(I_k)
%%
% calcul des meilleures approximations de rang faible
%%

difference = sqrt(sum(sum((I-I_k).^2)))

