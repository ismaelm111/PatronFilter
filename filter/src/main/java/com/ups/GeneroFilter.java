package com.ups;

import com.ups.Clases.Empleado;
import com.ups.Clases.Genero;

public class GeneroFilter implements Filter {

    Genero generofiltro;
    GeneroFilter(Genero genero){
        this.generofiltro = genero;
    }
    @Override
    public boolean apply(Empleado empleados){
        return (empleados != null && generofiltro.equals(empleados.getGenero()));
    }

}
