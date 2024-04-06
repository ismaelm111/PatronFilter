package com.ups;

import com.ups.Clases.Clima;

public class TemperaturaFilter implements Filter {

    TemperaturaFilter(){
        super();
    }
    
    @Override
    public boolean apply(Clima clima){
        return (clima != null && (clima.getTemperatura() < 12 || clima.getTemperatura() >38));
    }

}
