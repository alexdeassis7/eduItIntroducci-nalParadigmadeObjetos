package com.eduit.constructores;

public class Persona {

	private long dni;
	private int edad;
	private String nombre;
	private String apellido;

	// constructor vacio
	public Persona() {

	}

	// // Constructor con parametros
	
	public Persona(String no, String ap) {
		nombre = no;
		apellido = ap;
	}

	public Persona(String Nombre, int Dni) {
		nombre = Nombre;
		dni = Dni;
	}
	

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
