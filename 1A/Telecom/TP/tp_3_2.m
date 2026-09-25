%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%   Partie 3.2 Telecom
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

% Vous allez devoir implanter ici une chaine de transmission en bande de base sans canal et l%analyser en vous
% focalisant sur les interférences entre symboles : leur impact sur la transmission et l%influence du respect ou
% du non respect du critère de Nyquist.
% On considèrera un mapping binaire à moyenne nulle. Les filtres de mise en forme et de réception auront les
% mêmes réponses impulsionnelles : rectangulaires de durées égales à la période symbole et de hauteur 1.

clear all;
close all;

% Constantes 
N = 10;     % nombre d'échantillons
Fe = 24000;  % fréquence échantillonnage (Hz)
Te = 1/Fe;   % pèriode d'échantillonnage (s)
Rb = 3000;   % débit binaire (bits/s)
Tb = 1/Rb;   % pèriode binaire (bits)
bits = randi([0,1],1,N); % générer bits aléatoires

%% Signal sortie filtre
n = 1;
Ts = n*Tb;   % pèriode symbole
Ns = floor(Ts/Te);  % facteur de suréchantillonnage

% Filtrage
temps = linspace(0, Te*(Ns*N-1), Ns*N);
symboles = 2*bits - ones(size(bits));
sign_dirac = kron(symboles, [1, zeros(1,Ns-1)]);
h = ones(1,Ns);  % filtre transmission
hr = ones(1,Ns); % filtre réception
sign_filtre_h = filter(h,1,sign_dirac);
sign_filtre_hr = filter(hr,1,sign_filtre_h);

% Affichage
f = figure('Name',"Signal de sortie de filtre de réception.");
f.Position = [100 100 750 700];
grid;
title('Tracé du signal de sortie de filtre de réception');
xlabel('Temps (s)');
ylabel('Signal sortie');
plot(temps, sign_filtre_hr);

%% Réponse impulsionnelle globale


