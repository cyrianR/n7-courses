%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%   Partie 3.1 Telecom
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

clear all;
close all;

% Constantes 
N = 1000;     % nombre d'échantillons
Fe = 24000;  % fréquence échantillonnage (Hz)
Te = 1/Fe;   % pèriode d'échantillonnage (s)
Rb = 3000;   % débit binaire (bits/s)
Tb = 1/Rb;   % pèriode binaire (bits)
bits = randi([0,1],1,N); % générer bits aléatoires
EbsurN0 = 500;


%% Chaine 1
% Mapping : Symboles binaires à moyenne nulle
% Filtre de mise en forme de réponse impulsionnelle rectangulaire de hauteur 1 et de durée égale à
% la période symbole.
n = 1;
Ts = n*Tb;   % pèriode symbole
Ns = floor(Ts/Te);  % facteur de suréchantillonnage

% Filtrage
figure
subplot(2,1,1)
temps1 = linspace(0, Te*(Ns*N-1), Ns*N);
symboles = 2*bits - ones(size(bits));
sign_dirac = kron(symboles, [1, zeros(1,Ns-1)]);
h = ones(1,Ns);  % filtre
sign_filtre1 = filter(h,1,sign_dirac);
sign_filtre1b = filter(h,1,sign_filtre1);
% eyediagram(sign_filtre1b(Ns+1:end), 2 * Ns, 2 * Ns, Ns - 1);
plot(reshape(sign_filtre1b,Ns,length(sign_filtre1b)/Ns)); hold off;

subplot(2,1,2)
Px = mean(abs(sign_filtre1).^2);
sigma = sqrt((Px*Ns)/(2*n*EbsurN0));
bruit=sigma*randn(1, length(sign_filtre1));
sign_bruit1 = sign_filtre1 + bruit;
sign_bruit1b = filter(h,1,sign_bruit1);
plot(reshape(sign_bruit1b,Ns,length(sign_bruit1b)/Ns)); hold off;



%% Chaine 2
% Mapping : Symboles binaires à moyenne nulle
% Filtre de mise en forme de réponse impulsionnelle rectangulaire de hauteur 1 et de durée égale à
% la moitié de la période symbole.
n = 1;
Ts = n*Tb;   % pèriode symbole
Ns = floor(Ts/Te);  % facteur de suréchantillonnage

% Filtrage
figure
subplot(2,1,1)
temps2 = linspace(0, Te*(Ns*N-1), 2*Ns*N);
symboles = 2*bits - ones(size(bits));
sign_dirac = kron(symboles, [1, zeros(1,2*Ns-1)]);
h = ones(1,Ns);  % filtre
sign_filtre2 = filter(h,1,sign_dirac);
sign_filtre2b = filter(h,1,sign_filtre2);
% eyediagram(sign_filtre2b(Ns+1:end), 2 * Ns, 2 * Ns, Ns - 1);
plot(reshape(sign_filtre2b,Ns,length(sign_filtre2b)/Ns)); hold off;

subplot(2,1,2)
Px = mean(abs(sign_filtre2).^2);
sigma = sqrt((Px*Ns)/(2*n*EbsurN0));
bruit=sigma*randn(1, length(sign_filtre2));
sign_bruit2 = sign_filtre2 + bruit;
sign_bruit2b = filter(h,1,sign_bruit2);
plot(reshape(sign_bruit2b,Ns,length(sign_bruit2b)/Ns)); hold off;

%% Chaine 3
% Mapping : Symboles 4-aires à moyenne nulle
% Filtre de mise en forme de réponse impulsionnelle rectangulaire de hauteur 1 et de durée égale à
% la période symbole.
n = 2;
Ts = n*Tb;   % pèriode symbole
Ns = floor(Ts/Te);  % facteur de suréchantillonnage

% Filtrage
figure
subplot(2,1,1)
temps3 = linspace(0, Te*(Ns*N-1), Ns*N);
mapping = [-3, -1, 3, 1];
symboles_binaire = reshape(bits, 2, []);
symboles_decimal = symboles_binaire(1,:) * 2 + symboles_binaire(2,:) + 1;
symboles = mapping(symboles_decimal);
sign_dirac = kron(symboles, [1, zeros(1,Ns-1)]);
h = ones(1,Ns);  % filtre
sign_filtre3 = filter(h,1,sign_dirac);
sign_filtre3b = filter(h,1,sign_filtre3);
% eyediagram(sign_filtre3b(Ns+1:end), 2 * Ns, 2 * Ns, Ns - 1);
plot(reshape(sign_filtre3b,Ns,length(sign_filtre3b)/Ns)); hold off;

subplot(2,1,2)
Px = mean(abs(sign_filtre3).^2);
sigma = sqrt((Px*Ns)/(2*n*EbsurN0));
bruit=sigma*randn(1, length(sign_filtre3));
sign_bruit3 = sign_filtre3 + bruit;
sign_bruit3b = filter(h,1,sign_bruit3);
plot(reshape(sign_bruit3b,Ns,length(sign_bruit3b)/Ns)); hold off;