package com.eduit.constructores;

public class Main {

	public static void main(String[] args) {

		// invocamos al constructor VACIO!
		Persona p1 = new Persona("de assis", "alex");
		System.out.println("P1");
		System.out.println("apellido " + p1.getApellido());
		System.out.println("edad : " + p1.getEdad());
		System.out.println("dni : " + p1.getDni());
		System.out.println(" nombre " + p1.getNombre());

		Persona p2 = new Persona();
		System.out.println("P2");
		System.out.println("apellido " + p2.getApellido());
		System.out.println("edad : " + p2.getEdad());
		System.out.println("dni : " + p2.getDni());
		System.out.println(" nombre " + p2.getNombre());

		Persona p3 = new Persona("alex", "De assis");
		System.out.println("P3");
		System.out.println("P3 : nombre " + p3.getNombre());
		System.out.println("P3 : apellido " + p3.getApellido());
		System.out.println("P3 : dni " + p3.getDni());
		System.out.println("edad : " + p3.getEdad());

		Persona p4 = new Persona("jose", 345454);
		System.out.println("P4 : nombre " + p4.getNombre());
		System.out.println("P4 : dni " + p4.getDni());
		System.out.println("P4 : apellido " + p4.getApellido());
		System.out.println("edad : " + p4.getEdad());

	}

}
