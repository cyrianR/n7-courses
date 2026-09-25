%
% Projet Telecom Partie 3 : Implantation de la chaine passe-bas
% Format DVB-S
% Mapping QPSK, filtre mise en forme cos surélevé (roll off 0.35)
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
EbsurN0 = 100; % rapport signal à bruit par bit

fc = Fp; % fréquence du filtre passe bas
T = 2*fc/Fe; % periode filtre passe bas
retard = span*Ns; % retard introduit avant filtres mise en forme et reception
N0 = Ns/2; % instant initial d'échantillonnage


%% CHAINE DE TRANSMISSION
%% Modulation
% mapping
ak = bits(1:2:end)*2 - 1; % partie réelle
bk = bits(2:2:end)*2 - 1; % partie imaginaire
symboles = ak + 1i*bk;
% filtrage
h = rcosdesign(alpha,2*span,Ns); % filtre de mise en forme
symboles_dirac = [kron(symboles, [1, zeros(1,Ns-1)]) zeros(1,retard)];
signal = filter(h,1,symboles_dirac);
signal = signal(retard+1:end);


%% Implantation de chaine passe-bas équivalente à la chaine de transmission
% transposition de fréquence
temps = (0:Te:(length(signal)-1)*Te);
x = real(signal).*cos(2*pi*Fp*temps) - imag(signal).*sin(2*pi*Fp*temps);
% DSP
dsp_x = pwelch(x,[],[],[],Fe,'twosided');
freq_dsp_x = linspace(-Fe/2,Fe/2,length(dsp_x));
dsp_x_pb = pwelch(signal,[],[],[],Fe,'twosided');

%% AFFICHAGE
% diagramme de l'oeil
%eyediagram(z(Ns:end),2*Ns,2*Ns,Ns-1)
% tracé des signaux générés sur les voies en phase et en quadrature
figure
grid
title("Signaux générés sur les voies en phase et en quadrature");
subplot(2,1,1)
plot(real(signal));
axis([0 length(signal) -1 1]);
xlabel('Temps (s)')
ylabel('Voie en phase')
subplot(2,1,2);
plot(imag(signal));
axis([0 length(signal) -1 1])
xlabel('Temps (s)');
ylabel('Voie en quadrature');

figure
title("DSP");
% DSP de l'enveloppe complexe 
nexttile
semilogy(freq_dsp_x,fftshift(dsp_x_pb));
title("DSP de l'enveloppe complexe associée au signal modulé sur fréquence porteuse");
xlabel("Fréquences normalisées");
ylabel("Densité spectrale de puissance");

% Comparaison entre DSP de l'enveloppe conplexe et celle du signal sur
% fréquence porteuse
nexttile
semilogy(freq_dsp_x,fftshift(dsp_x_pb));
hold on;
semilogy(freq_dsp_x,fftshift(dsp_x));
title("Comparaison entre les deux DSPs");
xlabel("Fréquences normalisées");
ylabel("Densité spectrale de puissance");
legend("Chaine passe-bas équivalente","Chaine sur fréquence porteuse")

% Tracé des constellations en sortie du mapping et en sortie de
% l'échantillonneur pour valeur donnée de Eb/N0.
scatterplot(symboles);
title("Tracé des constellations en sortie du mapping");

% %% Implantation de la chaine complète sans bruit et vérifier que TEB est nul
% %L=10000;
% %signal = filter(h,1,symboles_dirac);
% % filtre réception
% x_r = filter(h,1,[signal zeros(1,retard)]);
% x_r = x_r(retard+1:end);
% 
% % echantilloneur
% x_ech = x_r(1:Ns:end);
% 
% % demapping
% bits_recu = zeros(1,N);
% symboles_a_r = real(x_ech)>0;
% symboles_b_r = imag(x_ech)>0;
% bits_recu(1:2:end) = symboles_a_r;
% bits_recu(2:2:end) = symboles_b_r;
% 
% %4-TEB
% nb_erreurs = sum(bits ~= bits_recu);
% TEB_obtenu = nb_erreurs/length(bits);
% fprintf("(3.2.2) 3. Le TEB obtenu sans bruit est bien %f \n",TEB_obtenu)
%
% Px = mean(abs(signal).^2);
% dbmax=6;
% TEB_pb=zeros(1,dbmax+1);
% % (4) - Rajouter le bruit et tracer TEB.
% for i = 1:dbmax+1
%     %Calcul de la puissance
%     EbsurN0_i= 10^((i-1)/10);
%     sigma = sqrt((Px*Ns)/(2*n*EbsurN0_i)); % puissance bruit
% 
%     %Génération et ajout du bruit
%     br = sigma*randn(1,length(real(signal)));
%     bi = sigma*randn(1,length(imag(signal)));
%     bruit = br + 1i * bi;
%     signal_bruite = signal + bruit;
% 
%     %Passage par filtre de réception
%     xi_r = filter(h,1,[signal_bruite zeros(1,retard)]);
%     xi_r = xi_r(retard +1:end);
% 
%     %Echantillonnage
%     xi_ech = xi_r(1:Ns:end);
% 
%     %Demapping
%     bits_recu_i = zeros(1,N);
%     symboles_ai_r = real(xi_ech)>0;
%     symboles_bi_r = imag(xi_ech)>0;
%     bits_recu_i(1:2:end) = symboles_ai_r;
%     bits_recu_i(2:2:end) = symboles_bi_r;
% 
%     %Calcul du TEB
%     nb_erreurs_i = sum(bits ~= bits_recu_i);
%     TEB_pb(i) = nb_erreurs_i/length(bits);
% 
% end


[TEB_list,x_ech_constellation]=TEB_p3(signal,bits,Ns,h,6,N,10^3,n,retard);

%Pour une valeur de Eb/N0 égale à 6dB.
scatterplot(x_ech_constellation(6,:));
title("Les constellations en sortie de l'échantillonneur");

%% Comparaison partie 2
Fe = 24000; % fréquence échantillonnage (Hz)
Te = 1/Fe; % pèriode échantiollnnage (s)
%Rb = 3000; % débit binaire (bps)
%Tb = 1/Rb; % pèriode binaire (bits)
%Ts = n*Tb; % pèriode symbole
Ns = floor(Ts/Te);  % facteur de suréchantillonnage
Fp = 2000; % fréquence porteuse (Hz)
N = 10000; % nombre d'échantillons
bits = randi([0,1],1,N); % information binaire à transmettre
EbsurN0 = 100; % rapport signal à bruit par bit

fc = Fp; % fréquence du filtre passe bas
T = 2*fc/Fe; % periode filtre passe bas
retard = span*Ns; % retard introduit avant filtres mise en forme et reception
N0 = Ns/2; % instant initial d'échantillonnage


% CHAINE DE TRANSMISSION
%Modulation
% mapping
ak = bits(1:2:end)*2 - 1; % partie réelle
bk = bits(2:2:end)*2 - 1; % partie imaginaire
symboles = ak + 1i*bk;
% filtrage
h = rcosdesign(alpha,2*span,Ns); % filtre de mise en forme
symboles_dirac = [kron(symboles, [1, zeros(1,Ns-1)]) zeros(1,retard)];
signal = filter(h,1,symboles_dirac);
signal = signal(retard+1:end);


% Implantation de chaine passe-bas équivalente à la chaine de transmission
% transposition de fréquence
temps = (0:Te:(length(signal)-1)*Te);
x = real(signal).*cos(2*pi*Fp*temps) - imag(signal).*sin(2*pi*Fp*temps);
[SNRdB, SNR, TEB_exp, TEB_theo] = TEB_partie_2(x, bits, Ns, h, Fp, temps, T, N, N0, retard);

figure
semilogy([0:6],TEB_list,'x-');
hold on;
semilogy([0:6],TEB_exp,'O-');
hold on;
semilogy([0:6],TEB_theo,'g');
title("Taux d'erreur binaire pour les deux chaines");
xlabel("Eb/N0 (en dB)");
ylabel("TEB");
legend("Chaine passe-bas équivalente","Chaine sur fréquence porteuse","TEB théorique");
grid on;



