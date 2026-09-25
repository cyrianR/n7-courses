function [symboles] = mapping_8_psk(bits)
    mapping=[0 0 0; 1 0 0; 1 1 0 ; 0 1 0; 0 1 1; 1 1 1; 1 0 1; 0 0 1];
    symboles=zeros(1,length(bits)/3);
    for k=1:3:length(bits)
        for i=1:length(mapping)
            if (bits(k:k+2)==mapping(i,:))
                symboles(floor(k/3)+1)=i-1;
            end
        end
    end
end

