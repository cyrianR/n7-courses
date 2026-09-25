function [Eb_N0_dB, Eb_N0, TEB_exp, TEB_theo] = TEB(x,bits,Ns,h,Fp,temps,T,N,N0,retard)
    n = 6; % Eb/N0 en db max
    Eb_N0_dB = 0:1:n;
    Eb_N0 = 10.^(Eb_N0_dB./10);
    Px = mean(abs(x).^2); % puissance signal à bruiter
    % TEB théorique
    TEB_theo = qfunc(sqrt(2 * Eb_N0));
    % TEB experimental
    TEB_exp = zeros(1,n+1);
    for p = 1:1:n+1
        k = 0;

        sigma = sqrt((Px*Ns)/(2*n*Eb_N0(p))); % puissance bruit
    
        SOMME = 0;
        precision = 0.1; % precision de mesure du TEB
        seuil = 1/(precision^2); % seuil du nombre d'erreurs
        nb_erreurs = 0;
        while nb_erreurs < seuil
    
            %% Canal propagation
            % bruit AWGN
            awgn = + 1j*sigma*randn(1, length(imag(x)));
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
            % calcul TEB
            TEB_actuel = sum(bits_decision~=bits)/length(bits);
            SOMME = SOMME + TEB_actuel;
            nb_erreurs = nb_erreurs + sum(bits_decision~=bits);
            k = k+1;
        end
        TEB_exp(1,p) = SOMME/k;
    end
    
end

