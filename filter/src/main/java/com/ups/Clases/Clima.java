package com.ups.Clases;

public class Clima {

    private int idClima;
    private String ciudad;
    private int temperatura;

    public Clima(ClimaBuilder ClimaBuilder) {
        if (ClimaBuilder == null) {
            throw new IllegalArgumentException("Error objeto clima");
        }
        if (ClimaBuilder.idClima <= 0) {
            throw new IllegalArgumentException("id debe ser mayor a 0");
        }
        if (ClimaBuilder.ciudad == null || ClimaBuilder.ciudad.trim().isEmpty()) {
            throw new IllegalArgumentException("Falta la ciudad");
        }
        this.idClima = ClimaBuilder.idClima;
        this.ciudad = ClimaBuilder.ciudad;
        this.temperatura = ClimaBuilder.temperatura;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    

    @Override
    public String toString() {
        return "Clima [idClima=" + idClima + ", ciudad=" + ciudad + ", temperatura=" + temperatura + "]";
    }

    public static class ClimaBuilder {
        private int idClima;
    private String ciudad;
    private int temperatura;

        public ClimaBuilder() {
            super();
        }

        public ClimaBuilder idClima(int idClima) {
            this.idClima = idClima;
            return this;
        }

        public ClimaBuilder ciudad(String ciudad) {
            this.ciudad = ciudad;
            return this;
        }

        public ClimaBuilder temperatura(int temperatura) {
            this.temperatura = temperatura;
            return this;
        }

        public Clima build() {
            Clima emp = null;
            if (validarClima()) {
                emp = new Clima(this);
            } else {
                System.out.println("El Clima no se pueden crear");
            }
            return emp;
        }

        private boolean validarClima() {
            return (idClima > 0 && ciudad != null && !ciudad.trim().isEmpty());
        }

    }
 

}
