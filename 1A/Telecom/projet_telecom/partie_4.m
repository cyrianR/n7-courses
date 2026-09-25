%
% Projet Telecom Partie 4 : Implantation de la modulation 4-ASK
% Format DVB-S
% Mapping 4-ASK, filtre mise en forme cos surélevé (roll off 0.35)
%

clear all;
close all;

%% CONSTANTES
M = 4; % ordre de modulation (QPSK)
n = 2; % bits par symboles
alpha = 0.35; % roll-off
span = 8; % span du rcosdesign
Fe = 6000; % fréquence échantillonnage (Hz)
Te = 1/Fe; % pèriode échantiollnnage (s)
Rb = 3000; % débit binaire (bps)
Tb = 1/Rb; % pèriode binaire (bits)
Ts = n*Tb; % pèriode symbole
Ns = floor(Ts/Te);  % facteur de suréchantillonnage
Fp = 2000; % fréquence porteuse (Hz)
N = 10000; % nombre d'échantillons
bits = randi([0,1],1,N); % information binaire à transmettre
EbsurN0 = 10^100; % rapport signal à bruit par bit

retard = span*Ns; % retard introduit avant filtres mise en forme et reception

%% CHAINE DE TRANSMISSION
%% Modulation
% mapping
mapping = [-3, -1, 3, 1];
symboles_binaire = reshape(bits, 2, []);
symboles_decimal = symboles_binaire(1,:) * 2 + symboles_binaire(2,:) + 1;
symboles = mapping(symboles_decimal);
% filtrage
h = rcosdesign(alpha,2*span,Ns); % filtre de mise en forme
symboles_dirac = [kron(symboles, [1, zeros(1,Ns-1)]) zeros(1,retard)];
signal = filter(h,1,symboles_dirac);
signal = signal(retard+1:end);


[TEB_list,x_ech_constellation,TEB_theo]=TEB_p4(signal,bits,Ns,h,6,N,10^3,n,retard);

%Chaine de transmission sans bruit
            %Passage par filtre de réception
            xi_r = filter(h,1,[signal zeros(1,retard)]);
            xi_r = xi_r(retard +1:end);
            %Echantillonnage
            xi_ech = xi_r(1:Ns:end);
            %Demapping
            bits_recu_i = zeros(1,N);
            symboles_ai_r = xi_ech>0;
            symboles_bi_r = abs(xi_ech)<2;
            bits_recu_i(1:2:end) = symboles_ai_r;
            bits_recu_i(2:2:end) = symboles_bi_r;
           
            %Calcul du TEB
            TEB = sum(bits ~= bits_recu_i)/length(bits);
    % le TEB est bien nul

% Tracé des constellations en sortie du mapping et en sortie de
% l'échantillonneur pour valeur donnée de Eb/N0.
scatterplot(symboles);
title("Tracé des constellations en sortie du mapping");
%Pour une valeur de Eb/N0 égale à 6dB.
scatterplot(x_ech_constellation(6,:));
title("Les constellations en sortie de l'échantillonneur");

% tracé du taux d'erreur binaire obtenu en fonction du rapport signal à bruit par bit à l'entrée du
% récepteur pour des valeurs allant de 0 à 6 dB
figure('Name',"TEB fonction du rapport signal à bruit par bits");
grid;
title('TEB fonction de Eb/N0');
plot([0:6], TEB_list); hold on;
plot([0:6], TEB_theo);
set(gca, 'YScale', 'log');
xlabel('Eb/N0 (dB)');
ylabel('TEB');
legend("Expérimental", "Théorique")

% comparaison des chaines avec modulateur 4-ASK et QPSK
[TEB_QPSK,x_ech_constellation]=TEB_p3(signal,bits,Ns,h,6,N,10^3,n,retard);

figure
plot([0:6],TEB_QPSK,'x-');
set(gca, 'YScale', 'log');
hold on;
plot([0:6],TEB_list,'O-');
set(gca, 'YScale', 'log');
title("Taux d'erreur binaire pour les deux modulateurs");
xlabel("Eb/N0 (en dB)");
ylabel("TEB");
legend("Modulateur QPSK","Modulateur 4-ASK");
grid on;
