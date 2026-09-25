%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%   Partie 3.1 Telecom
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

clear all;
close all;

% Constantes 
N = 100;     % nombre d'échantillons
Fe = 24000;  % fréquence échantillonnage (Hz)
Te = 1/Fe;   % pèriode d'échantillonnage (s)
Rb = 3000;   % débit binaire (bits/s)
Tb = 1/Rb;   % pèriode binaire (bits)
bits = randi([0,1],1,N); % générer bits aléatoires

%% Modulateur 1
% Mapping : Symboles binaires à moyenne nulle
% Filtre de mise en forme de réponse impulsionnelle rectangulaire de hauteur 1 et de durée égale à
% la période symbole.
n = 1;
Ts = n*Tb;   % pèriode symbole
Ns = floor(Ts/Te);  % facteur de suréchantillonnage

% Filtrage
temps1 = linspace(0, Te*(Ns*N-1), Ns*N);
symboles = 2*bits - ones(size(bits));
sign_dirac = kron(symboles, [1, zeros(1,Ns-1)]);
h = ones(1,Ns);  % filtre
sign_filtre1 = filter(h,1,sign_dirac);

% DSP
dsp1 = pwelch(sign_filtre1,[],[],[],Fe,'twosided');
f1 = linspace(-Fe/2,Fe/2,length(dsp1));

% Affichage
f = figure('Name',"Modulateur 1");
f.Position = [100 100 750 700];
grid;
title('Tracé du signal pour le modulateur 1');
subplot(2,1,1);
xlabel('Temps (s)');
ylabel('Signal modulateur');
plot(temps1, sign_filtre1);
subplot(2,1,2);
xlabel('Fréquences (Hz)');
ylabel('DSP');
semilogy(f1, fftshift(abs(dsp1)));


%% Modulateur 2
% Mapping : Symboles 4-aires à moyenne nulle
% Filtre de mise en forme de réponse impulsionnelle rectangulaire de hauteur 1 et de durée égale à
% la période symbole.
n = 2;
Ts = n*Tb;   % pèriode symbole
Ns = floor(Ts/Te);  % facteur de suréchantillonnage

% Filtrage
temps2 = linspace(0, Te*(Ns*N-1), Ns*N);
mapping = [-3, -1, 3, 1];
symboles_binaire = reshape(bits, 2, []);
symboles_decimal = symboles_binaire(1,:) * 2 + symboles_binaire(2,:) + 1;
symboles = mapping(symboles_decimal);
sign_dirac = kron(symboles, [1, zeros(1,Ns-1)]);
h = ones(1,Ns);  % filtre
sign_filtre2 = filter(h,1,sign_dirac);

% DSP
dsp2 = pwelch(sign_filtre2,[],[],[],Fe,'twosided');
f2 = linspace(-Fe/2,Fe/2,length(dsp2));

% Affichage
temps2 = (0:Te:(length(sign_filtre2)-1)*Te)/n;
f = figure('Name',"Modulateur 2");
f.Position = [100 100 750 700];
grid
title('Tracé du signal pour le modulateur 2')
subplot(2,1,1)
xlabel('Temps (s)')
ylabel('Signal modulateur')
plot(temps2, sign_filtre2);
subplot(2,1,2);
xlabel('Fréquences (Hz)');
ylabel('DSP');
semilogy(f2, fftshift(abs(dsp2)));


%% Modulateur 3
% Mapping : Symboles binaires à moyenne nulle
% Filtre de mise en forme de réponse impulsionnelle en racine de cosinus surélevé de roll off égal à 0.5.
% Vous pouvez utiliser la fonction rcosdesign.m de Matlab afin de générer la réponse impulsionnelle
% de ce filtre. Ce filtre a une bande fréquentielle finie, il a donc une réponse impulsionnelle infinie qui
% devra être tronquée afin de réaliser un filtre de type RIF. En utilisant h = rcosdesign(α, L, Ns );
% vous pouvez réaliser un filtre en racine de cosinus surélevé avec une réponse impulsionnelle de
% longueur N = L × Ns + 1 échantillons (ou coefficients) et de roll off α (paramètre compris entre 0
% (filtre passe-bas idéal) et 1)
n = 1;
Ts = n*Tb;   % pèriode symbole
Ns = floor(Ts/Te);  % facteur de suréchantillonnage

% Filtrage
temps3 = linspace(0, Te*(Ns*N-1), Ns*N);
symboles = 2*bits - ones(size(bits));
sign_dirac = kron(symboles, [1, zeros(1,Ns-1)]);
L = 2;
alpha = 1;
h = rcosdesign(alpha,2,Ns);  % filtre
sign_filtre3 = filter(h,1,sign_dirac);

% DSP
dsp3 = pwelch(sign_filtre3,[],[],[],1,'twosided'); % mettre 1 parce que sinon pwelch divise par Fe
f3 = linspace(-Fe/2,Fe/2,length(dsp3));

% Affichage
temps3 = (0:Te:(length(sign_filtre3)-1)*Te)/n;
f = figure('Name',"Modulateur 3");
f.Position = [100 100 750 700];
grid
title('Tracé du signal pour le modulateur 3')
subplot(2,1,1)
xlabel('Temps (s)')
ylabel('Signal modulateur')
plot(temps3, sign_filtre3);
subplot(2,1,2);
xlabel('Fréquences (Hz)');
ylabel('DSP');
semilogy(f3, fftshift(abs(dsp3)));


%% Affichage DSP superposées
f = figure('Name',"DSP des signaux pour les 3 modulateurs étudiés");
f.Position = [100 100 750 700];
grid
semilogy(f1, fftshift(abs(dsp1)));
hold on;
semilogy(f2, fftshift(abs(dsp2)));
hold on;
semilogy(f3, fftshift(abs(dsp3)));
hold off;
legend('Modulateur 1','Modulateur 2','Modulateur 3');


