package com.ups;

import com.ups.Clases.Empleado;
import com.ups.Clases.Genero;

public class GeneroFilter implements Filter {
    @Override
    public boolean apply(Empleado empleados){
        return (empleados != null && Genero.MASCULINO.equals(empleados.getGenero()));
    }

}
