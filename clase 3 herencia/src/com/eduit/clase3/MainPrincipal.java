package com.eduit.clase3;

public class MainPrincipal {

	public static void main(String[] args) {

		Persona p1 = new Persona("alex", "de assis", 8, 26);

		System.out.println("PERSONA");
		p1.concentrarce();
		p1.viajar();
		System.out.println(p1.toString());

		Futbolista f1 = new Futbolista("pepe", "gonzales", 5, 39);
		System.out.println("FUTBOLISTA");
		f1.viajar();
		f1.concentrarce();
		f1.entrenar();
		f1.JugarPartido();

		System.out.println(f1.toString());

		System.out.println("ENTRENADOR LOSSER");

		Entrenador e1 = new Entrenador("Marcelo", "Gallardo", 2.1f, 48);
		e1.idFederacion = "id fede";
		e1.dirigirEntrenamiento();
		e1.dirigirPartido();
		e1.viajar();
		e1.concentrarce();
		System.out.println(e1.toString());
		System.out.println("id de federacion " + e1.idFederacion);	
		
		System.out.println("MASAJISTA");
		Masajista m1 = new Masajista("RAMON", "valdes", 2, 49);
		m1.titulo = "masajista acupuntura";
		m1.Aniosexperiencia = 34;
		m1.darMasaje();
		m1.viajar();
		m1.concentrarce();
		System.out.println(m1.toString());
		System.out.println("Experiencia " + m1.Aniosexperiencia);
	}
}
