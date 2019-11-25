package com.eduit.clase3;

public class Entrenador extends Persona {

	/** ATRIBUTOS */
	public String idFederacion;

	public Entrenador(String nombre, String apellido, float id, int edad) {
		super(nombre, apellido, id, edad);

	}

	public void dirigirPartido() {
		System.out.println("estoy dirigiendo el partido ");
	}

	public void dirigirEntrenamiento() {
		System.out.println("estoy dirigiendo el entrenamiento  ");
	}

}
