%
% Projet Telecom Partie 2 : Transmission sur porteuse
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
Fe = 24000; % fréquence échantillonnage (Hz)
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
% filtrage
ak_dirac = [kron(ak, [1, zeros(1,Ns-1)]) zeros(1,retard)];
bk_dirac = [kron(bk, [1, zeros(1,Ns-1)]) zeros(1,retard)];
h = rcosdesign(alpha,2*span,Ns); % filtre de mise en forme
I = filter(h,1,ak_dirac); % voie en phase
I = I(retard+1:end);
Q = filter(h,1,bk_dirac); % voie en quadrature
Q = Q(retard+1:end);
% transposition de fréquence
temps = (0:Te:(length(Q)-1)*Te);
x = I.*cos(2*pi*Fp*temps) - Q.*sin(2*pi*Fp*temps);
%% Canal propagation
% bruit AWGN
Px = mean(abs(x).^2); % puissance signal à bruiter
sigma = sqrt((Px*Ns)/(2*n*EbsurN0)); % puissance bruit
awgn = sigma*randn(1, length(real(x))) + 1j*sigma*randn(1, length(imag(x)));
x_bruite = x + awgn;
%% Demodulation
% retour en bande de base
r_cos = x_bruite.*cos(2*pi*Fp*temps)*2;
r_sin = x_bruite.*sin(2*pi*Fp*temps)*2;
ordre = 11; % ordre filtre passe bas
freq_filtre = [-(ordre - 1)/2 : 1 : (ordre - 1)/2];
filtre_bas = fftshift(T*sinc(pi*T*freq_filtre));
r = filter(filtre_bas,1,r_cos) - 1j*filter(filtre_bas,1,r_sin);
% filtre réception
r_retarde = [r zeros(1, retard)];
z = filter(h,1,r_retarde);
z = z(retard+1:end);
% echantilloneur
zm = zeros(1,N/2);
i = N0;
j = 1;
while i < length(z)
    zm(j) = z(i);
    i = i + Ns;
    j = j + 1;
end
% décision
zm_real = real(zm);
zm_imag = imag(zm);
am_decision = zm_real;
bm_decision = zm_imag;
am_decision(am_decision<=0)=-1;
am_decision(am_decision>0)=1;
bm_decision(bm_decision<=0)=-1;
bm_decision(bm_decision>0)=1;
% demapping
bits_decision = zeros(1,length(am_decision)+length(bm_decision));
i = 1;
j = 1;
while i < N/2
    bits_decision(j) = am_decision(i);
    bits_decision(j+1) = bm_decision(i);
    j = j + 2;
    i = i + 1;
end
bits_decision(bits_decision<=0)=0;

%% AUTRES CALCULS
% DSP
dsp_x = pwelch(x,[],[],[],Fe,'twosided');
freq_dsp_x = linspace(-Fe/2,Fe/2,length(dsp_x));
% un seul TEB
TEB_test = sum(bits_decision~=bits)/length(bits)
% TEB fonction de EbsurN0
[SNRdB, SNR, TEB_exp, TEB_theo] = TEB_partie_2(x, bits, Ns, h, Fp, temps, T, N, N0, retard);

TEB_exp
TEB_theo


%% AFFICHAGE
% diagramme de l'oeil
eyediagram(z(Ns:end),2*Ns,2*Ns,Ns-1)
% tracé des signaux générés sur les voies en phase et en quadrature
figure
grid
title("Signaux générés sur les voies en phase et en quadrature");
subplot(2,1,1)
plot(temps, I);
xlabel('Temps (s)')
ylabel('Voie en phase')
subplot(2,1,2);
plot(temps, Q);
xlabel('Temps (s)');
ylabel('Voie en quadrature');
% tracé du signal transmis sur fréquence porteuse et de sa dsp
figure('Name',"Signal transmis");
grid;
title('Tracé du signal pour le modulateur 1');
subplot(2,1,1);
plot(temps, x);
xlabel('Temps (s)');
ylabel('Signal transmis x');
subplot(2,1,2);
semilogy(freq_dsp_x, fftshift(abs(dsp_x)));
xlabel('Fréquences (Hz)');
ylabel('DSP');
% tracé du taux d'erreur binaire obtenu en fonction du rapport signal à bruit par bit à l'entrée du
% récepteur pour des valeurs allant de 0 à 6 dB
figure('Name',"TEB fonction du rapport signal à bruit par bits");
grid;
title('TEB fonction de Eb/N0');
plot(SNRdB, TEB_exp); hold on;
plot(SNRdB, TEB_theo);
set(gca, 'YScale', 'log');
xlabel('Eb/N0 (dB)');
ylabel('TEB');
legend("Expérimental", "Théorique")
