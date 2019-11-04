package com.eduit.clase1;

public class AppPrincipal {

	public static void main(String[] args) {
		// punto de inicio
		// INTANCIAMOS 3 OBJETOS DE LA CLASE AUTO

		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		Auto auto3 = new Auto();

		// Seteamos Valores (ESTADOS) a los atributos de los objetos creados previamente
		auto1.marca = "fiat ";
		auto1.modelo = "Toro";
		auto1.capacidadTanque = 50;
		auto1.color = "Azul";
		auto1.kilometraje = 0;
		auto1.velocidaAceleracion = 100;
		auto1.cantidadCinturones = 5;
		auto1.litrosTanque = 0;

		// seteamos la instacia Auto2
		auto2.marca = "Audi ";
		auto2.modelo = "a4";
		auto2.capacidadTanque = 25;
		auto2.color = "Rojo";
		auto2.kilometraje = 10000;
		auto2.velocidaAceleracion = 200;
		auto2.cantidadCinturones = 2;
		auto2.litrosTanque = 20;

		System.out.println("#########AUTO 1 #######");
		System.out.println(auto1.toString());
		auto1.cargarCombustible(30);
		auto1.acelerar();
		auto1.frenar(30);
		
		
		System.out.println("#########AUTO 2 #######");
		System.out.println(auto2.toString());
		auto2.cargarCombustible(4);
		auto2.acelerar();
		auto2.frenar(50);
		
		System.out.println("#########AUTO 3 #######");
		System.out.println(auto3.toString());
				
		
	}

}
