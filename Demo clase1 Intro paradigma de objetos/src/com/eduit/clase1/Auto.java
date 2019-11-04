package com.eduit.clase1;

public class Auto {
	// Atributos de la clase
	int litrosTanque = 0;
	int capacidadTanque = 0;
	int velocidaAceleracion = 0;
	int cantidadRuedad = 4;
	int cantidadCinturones = 0;
	String color = null;
	String marca = null;
	String modelo = null;
	float kilometraje = 0;
	// METODOS DE LA CLASE

	void acelerar() {

		System.out.println("estoy acelerando el " + modelo);
	}

	void frenar(float potenciaDeFrenado) {
		// cuerpo del metodo
		System.out.println("estoy frenando  el " + modelo + "con una potencia de " + potenciaDeFrenado + " Km X m /seg");
	}

	void cargarCombustible(int CantidadACarga) {
		if (capacidadTanque > CantidadACarga && (CantidadACarga + litrosTanque) < capacidadTanque) {

			litrosTanque = litrosTanque + CantidadACarga;
			System.out.println("tu tanque tiene " + litrosTanque + "litros");

		} else {
			System.out.println("exediste la capacidad de tu tanque ");
			System.out.println("podes cargar hasta " + (capacidadTanque - litrosTanque) + "litros ");

		}

	}


	public String toString() {
		return "Auto [litrosTanque=" + litrosTanque + ", capacidadTanque=" + capacidadTanque + ", velocidaAceleracion="
				+ velocidaAceleracion + ", cantidadRuedad=" + cantidadRuedad + ", cantidadCinturones="
				+ cantidadCinturones + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", kilometraje="
				+ kilometraje + "]";
	}
	
	

}
