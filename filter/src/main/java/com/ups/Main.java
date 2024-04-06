package com.ups;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.ups.Clases.Departamento;
import com.ups.Clases.Empleado;
import com.ups.Clases.Genero;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = Arrays.asList(
				new Empleado.EmpleadoBuilder().idEmpleado(101).nombre("Eduardo").genero(Genero.MASCULINO).departamento(Departamento.QA)
						.salario(1400).build(),
				new Empleado.EmpleadoBuilder().idEmpleado(102).nombre("Santiago").genero(Genero.MASCULINO).departamento(Departamento.ADMINISTRADOR)
						.salario(900).build(),
				new Empleado.EmpleadoBuilder().idEmpleado(103).nombre("Cristian").genero(Genero.MASCULINO).departamento(Departamento.RH)
						.salario(1500).build(),
				new Empleado.EmpleadoBuilder().idEmpleado(104).nombre("Ismael").genero(Genero.MASCULINO).departamento(Departamento.TI)
						.salario(800).build(),
				new Empleado.EmpleadoBuilder().idEmpleado(105).nombre("Martina").genero(Genero.FEMENINO).departamento(Departamento.SOPORTE)
						.salario(650).build(),
				new Empleado.EmpleadoBuilder().idEmpleado(106).nombre("Juana").genero(Genero.FEMENINO).departamento(Departamento.RH)
						.salario(1300).build(),
				new Empleado.EmpleadoBuilder().idEmpleado(107).nombre("Miguel").genero(Genero.MASCULINO).departamento(Departamento.QA)
						.salario(600).build(),
				new Empleado.EmpleadoBuilder().idEmpleado(108).nombre("Luis").genero(Genero.MASCULINO).departamento(Departamento.QA)
						.salario(700).build(),
				new Empleado.EmpleadoBuilder().idEmpleado(109).nombre("Paola").genero(Genero.FEMENINO).departamento(Departamento.RH)
						.salario(1700).build(),
				new Empleado.EmpleadoBuilder().idEmpleado(110).nombre("Jorge").genero(Genero.MASCULINO).departamento(Departamento.TI)
						.salario(1500).build());
    

    System.out.println("Todos los Empleados...");
		printEmpleado(empleados);
		List<Empleado> maleEmployees = applyFilter(new GeneroFilter(), empleados);
		System.out.println("Empleados de Genero Masculino...");
		printEmpleado(maleEmployees);
	/* 	List<Empleado> maleEngEmployees = (new AndFilter(new MaleFilter(), new EngFilter()).apply(employees));
		System.out.println("Print all Male And ENG employees...");
		printEmpleado(maleEngEmployees);
		List<Empleado> femaleOrHREmployees = (new OrFilter(new FemaleFilter(), new HRFilter()).apply(employees));
		System.out.println("Print all Female Or HR employees...");
		printEmpleado(femaleOrHREmployees);
        */
	}

    private static List<Empleado> applyFilter(Filter filter, List<Empleado> empleados) {
		return empleados.stream().filter(empleado -> filter.apply(empleado)).collect(Collectors.toList());
	}

	private static void printEmpleado(List<Empleado> empleados) {
		System.out.println("======================================================================");
		empleados.stream().forEach(empleado -> System.out.println(empleado));
		System.out.println("======================================================================");
	}
}