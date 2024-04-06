package com.ups;

import com.ups.Clases.Clima;

public class CiudadFilter implements Filter {

    private String ciudad;    
    private int horaInicio;
    private int horaFin;

    CiudadFilter(String ciudad, int horaInicio, int horaFin){
        super();
        this.ciudad = ciudad;
        this.horaFin = horaFin;
        this.horaInicio = horaInicio;
    }

    @Override
    public boolean apply(Clima clima) {
        return (clima != null && clima.getCiudad().equals(ciudad) && clima.getHora()>= horaInicio && clima.getHora() <= horaFin);
    }



}
