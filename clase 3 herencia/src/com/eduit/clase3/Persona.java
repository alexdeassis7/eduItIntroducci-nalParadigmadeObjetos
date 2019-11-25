package com.eduit.clase3;

public class Persona {
	/** ATRIBUTOS */

	public String nombre ;
	public String apellido;
	public float id;
	public int edad;

	public Persona(String nombre, String apellido, float id, int edad) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.edad = edad;
	}

	public void concentrarce() {
		System.out.println("me estoy concentrando como una persona");

	}

	public void viajar() {
		System.out.println("Estoy viajando como una persona");
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", id="
				+ id + ", edad=" + edad + "]";
	}

	
	
}
