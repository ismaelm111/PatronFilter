package com.ups.Clases;

public class Empleado {

    private int idEmpleado;
    private String nombre;
    private Genero genero;
    private Departamento departamento;
    private int salario;    

    public Empleado(EmpleadoBuilder empleadoBuilder) {
		if (empleadoBuilder == null) {
			throw new IllegalArgumentException("Please provide employee builder to build employee object.");
		}
		if (empleadoBuilder.idEmpleado <= 0) {
			throw new IllegalArgumentException("Please provide valid employee number.");
		}
		if (empleadoBuilder.nombre == null || empleadoBuilder.nombre.trim().isEmpty()) {
			throw new IllegalArgumentException("Please provide employee name.");
		}
		this.idEmpleado = empleadoBuilder.idEmpleado;
		this.nombre = empleadoBuilder.nombre;
		this.genero = empleadoBuilder.genero;
		this.departamento = empleadoBuilder.departamento;
		this.salario = empleadoBuilder.salario;				
	}
    
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", genero=" + genero + ", departamento="
                + departamento + ", salario=" + salario + "]";
    }
    
public static class EmpleadoBuilder {
    private int idEmpleado;
    private String nombre;
    private Genero genero;
    private Departamento departamento;
    private int salario;

    public EmpleadoBuilder(){
        super();
    }

    public EmpleadoBuilder idEmpleado(int idEmpleado){
        this.idEmpleado = idEmpleado;
        return this;
    }

    public EmpleadoBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public EmpleadoBuilder genero(Genero genero){
        this.genero = genero;
        return this;
    }

    public EmpleadoBuilder departamento(Departamento departamento){
        this.departamento = departamento;
        return this;
    }

    public EmpleadoBuilder salario(int salario){
        this.salario = salario;
        return this;
    }

    public Empleado build(){
        Empleado emp = null;
        if (validarEmpleado()){
            emp = new Empleado(this);
        } else{
            System.out.println("El empleado no se pueden crear");
        }
        return emp;
    }

    private boolean validarEmpleado(){
        return (idEmpleado>0 && nombre != null && !nombre.trim().isEmpty());
    }
    
}
    
}
