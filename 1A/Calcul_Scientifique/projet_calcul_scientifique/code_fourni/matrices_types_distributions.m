clear all;
close all;

for i = [1 2 3 4]

    genere = 0;
    load(['A_' num2str(500) '_' num2str(i)]);
    figure
    histogram(D);
    %ylim([0,100])
    set(gca,'yscale','log')
    title("Distribution du spectre d'une matrice de type " + num2str(i) + " de taille 500 ");
    xlabel("Valeur propre");
    ylabel("Nombre d'occurences");
    

end