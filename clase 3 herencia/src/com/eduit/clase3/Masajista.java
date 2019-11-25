package com.eduit.clase3;

public class Masajista extends Persona {

	public String titulo;
	public int Aniosexperiencia;

	public Masajista(String nombre, String apellido, int id, int edad) {
		super(nombre, apellido, id, edad);

	}

	public void darMasaje() {
		System.out.println("EStoy haciendo un masaje ");
	}
}
