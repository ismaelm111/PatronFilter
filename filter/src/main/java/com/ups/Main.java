package com.ups;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.ups.Clases.Clima;


public class Main {
    public static void main(String[] args) {
        List<Clima> climas = Arrays.asList(
				new Clima.ClimaBuilder().idClima(101).ciudad("Cuenca").hora(6).temperatura(10).build(),
				new Clima.ClimaBuilder().idClima(102).ciudad("Guayaquil").hora(6).temperatura(30).build(),
				new Clima.ClimaBuilder().idClima(103).ciudad("Quito").hora(6).temperatura(15).build(),
				new Clima.ClimaBuilder().idClima(104).ciudad("Manta").hora(6).temperatura(32).build(),
				new Clima.ClimaBuilder().idClima(105).ciudad("Machala").hora(6).temperatura(40).build(),
				new Clima.ClimaBuilder().idClima(106).ciudad("Azogues").hora(6).temperatura(12).build(),

                new Clima.ClimaBuilder().idClima(101).ciudad("Cuenca").hora(8).temperatura(10).build(),
				new Clima.ClimaBuilder().idClima(102).ciudad("Guayaquil").hora(8).temperatura(30).build(),
				new Clima.ClimaBuilder().idClima(103).ciudad("Quito").hora(8).temperatura(15).build(),
				new Clima.ClimaBuilder().idClima(104).ciudad("Manta").hora(8).temperatura(32).build(),
				new Clima.ClimaBuilder().idClima(105).ciudad("Machala").hora(8).temperatura(40).build(),
				new Clima.ClimaBuilder().idClima(106).ciudad("Azogues").hora(8).temperatura(12).build(),

                new Clima.ClimaBuilder().idClima(101).ciudad("Cuenca").hora(12).temperatura(20).build(),
				new Clima.ClimaBuilder().idClima(102).ciudad("Guayaquil").hora(12).temperatura(25).build(),
				new Clima.ClimaBuilder().idClima(103).ciudad("Quito").hora(12).temperatura(4).build(),
				new Clima.ClimaBuilder().idClima(104).ciudad("Manta").hora(12).temperatura(35).build(),
				new Clima.ClimaBuilder().idClima(105).ciudad("Machala").hora(12).temperatura(23).build(),
				new Clima.ClimaBuilder().idClima(106).ciudad("Azogues").hora(12).temperatura(6).build(),

                new Clima.ClimaBuilder().idClima(101).ciudad("Cuenca").hora(18).temperatura(18).build(),
				new Clima.ClimaBuilder().idClima(102).ciudad("Guayaquil").hora(18).temperatura(38).build(),
				new Clima.ClimaBuilder().idClima(103).ciudad("Quito").hora(18).temperatura(15).build(),
				new Clima.ClimaBuilder().idClima(104).ciudad("Manta").hora(18).temperatura(42).build(),
				new Clima.ClimaBuilder().idClima(105).ciudad("Machala").hora(18).temperatura(28).build(),
				new Clima.ClimaBuilder().idClima(106).ciudad("Azogues").hora(18).temperatura(9).build(),

                new Clima.ClimaBuilder().idClima(101).ciudad("Cuenca").hora(22).temperatura(10).build(),
				new Clima.ClimaBuilder().idClima(102).ciudad("Guayaquil").hora(22).temperatura(30).build(),
				new Clima.ClimaBuilder().idClima(103).ciudad("Quito").hora(22).temperatura(15).build(),
				new Clima.ClimaBuilder().idClima(104).ciudad("Manta").hora(22).temperatura(32).build(),
				new Clima.ClimaBuilder().idClima(105).ciudad("Machala").hora(22).temperatura(40).build(),
				new Clima.ClimaBuilder().idClima(106).ciudad("Azogues").hora(22).temperatura(12).build()
                );
				
    

    System.out.println("Todas las Ciudades con sus temperaturas...");
		printClima(climas);
		List<Clima> climaAlertas = applyFilter(new TemperaturaFilter() , climas);
		System.out.println("Alerta de temperaturas de Ciudades...");
        System.out.println("Temperaturas Menores a 12º y Mayores a 38º");
		printClima(climaAlertas);

        List<Clima> climaCiudad = applyFilter(new CiudadFilter("Azogues",8,15) , climas);
		System.out.println("Ciudad...");
        System.out.println("Hora Inicio 8 am A 12 pm");
		printClima(climaCiudad);
	}

    private static List<Clima> applyFilter(Filter filter, List<Clima> Climas) {
		return Climas.stream().filter(Clima -> filter.apply(Clima)).collect(Collectors.toList());
	}

	private static void printClima(List<Clima> Climas) {
		System.out.println("======================================================================");
		Climas.stream().forEach(Clima -> System.out.println(Clima));
		System.out.println("======================================================================");
	}
}