clear all
close all

% Lecture de l'image
I = imread('BD_Asterix_1.png');
I = rgb2gray(I);
I = double(I);

[q, p] = size(I);

val_propres = eig(I*I');

figure
histogram(val_propres,100000);
ylim([0,10000])
xlim([-1,1e8])
set(gca,'yscale','log')
title("Distribution du spectre correspondant à l'image BD\_Asterix\_1.png");
xlabel("Valeur propre");
ylabel("Nombre d'occurences");