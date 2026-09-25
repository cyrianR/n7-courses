function [ech,bits_sortie] = ech_8_psk(signal,Ns)
    Arg=[(-pi/8):pi/4:15*pi/8];
    %Arg=[(-15*pi/8):pi/4:15*pi/8];
    xi_ech=signal(1:Ns:end);
    ech=zeros(1,length(xi_ech));
    mapping=[0 0 0; 1 0 0; 1 1 0 ; 0 1 0; 0 1 1; 1 1 1; 1 0 1; 0 0 1];
    %mapping=[0 1 1; 1 1 1; 1 0 1; 0 0 1; 0 0 0; 1 0 0; 1 1 0 ; 0 1 0];
    bits_sortie=zeros(1,length(xi_ech)*3);
    for k=1:length(xi_ech)
        if ((-pi/8)<angle(xi_ech(k)))
            angle_corr=angle(xi_ech(k));
        else
            angle_corr=pi-angle(xi_ech(k));
        end
        for i=1:length(Arg)-1
            if (Arg(i)<=angle_corr && angle_corr<Arg(i+1))
                a=1;
                ech(k)=i-1;
                bits_sortie(3*k-2:3*k)=mapping(i,:);
            end
        end
        if (Arg(1)>angle_corr || angle_corr>=Arg(end))
            a=2;
            ech(k)=length(mapping)-1;
            bits_sortie(3*k-2:3*k)=mapping(length(mapping),:);
        end
    end
end
