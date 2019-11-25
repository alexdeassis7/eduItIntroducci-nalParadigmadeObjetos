package com.eduit.clase3;

public class Futbolista extends Persona {

	// **ATRIBUTOS*/

	public Futbolista(String nombre, String apellido, int id, int edad) {
		super(nombre, apellido, id, edad);

	}

	public int dorsal;
	public String demarcacion;

	public void JugarPartido() {
		System.out.println("estoy jugando un partido ");

	}

	public void entrenar() {
		System.out.println("me estoy entrenando");

	}

	@Override
	/**ANOTATIONS*/
	public void viajar() {
		System.out.println("Estoy viajando como un futbolista");

	}

	@Override
	public String toString() {
		return "Futbolista [dorsal=" + dorsal + ", demarcacion=" + demarcacion
				+ ", nombre=" + nombre + ", apellido=" + apellido + ", id="
				+ id + ", edad=" + edad + "]";
	}

}
