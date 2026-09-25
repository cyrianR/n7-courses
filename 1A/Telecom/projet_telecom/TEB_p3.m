function [TEB,x_ech_constellation] = TEB_p3(signal,bits,Ns,h,dBmax,N,erreurs,n,retard)
    Px = mean(abs(signal).^2);
    TEB=zeros(1,dBmax+1);
    x_ech_constellation=zeros(dBmax+1,N/2);
    %size(x_ech_constellation)
    for j=1:dBmax+1
        k=0;
        
        %Calcul de la puissance
        EbsurN0_i= 10^((j-1)/10);
        sigma = sqrt((Px*Ns)/(2*n*EbsurN0_i)); % puissance bruit
    
        SOMME=0;
        precision = 0.1; % precision de mesure du TEB
        seuil = 1/(precision^2); % seuil du nombre d'erreurs
        nb_erreurs=0;
        while nb_erreurs<seuil
    
    
            %Génération et ajout du bruit
            br = sigma*randn(1,length(real(signal)));
            bi = sigma*randn(1,length(imag(signal)));
            bruit = br + 1i * bi;
            signal_bruite = signal + bruit;

            %Passage par filtre de réception
            xi_r = filter(h,1,[signal_bruite zeros(1,retard)]);
            xi_r = xi_r(retard +1:end);
           
            %Echantillonnage
            xi_ech = xi_r(1:Ns:end);
        
            %Demapping
            bits_recu_i = zeros(1,N);
            symboles_ai_r = real(xi_ech)>0;
            symboles_bi_r = imag(xi_ech)>0;
            bits_recu_i(1:2:end) = symboles_ai_r;
            bits_recu_i(2:2:end) = symboles_bi_r;
           
            %Calcul du TEB
            nb_erreurs_i = sum(bits ~= bits_recu_i);
            SOMME = SOMME + nb_erreurs_i/length(bits);
            nb_erreurs=nb_erreurs+nb_erreurs_i;
            k=k+1;
        end
        TEB(1,j)=SOMME/k;
        x_ech_constellation(j,:)=xi_ech;
        k=0;
    end
