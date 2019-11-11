package com.eduit.sobrecarga;

public class Auto {
	// SOBRECARGA DE METODO!
	int velocidad = 0;

	public void acelerar() {
		velocidad = velocidad + 10;
		System.out.println(velocidad);
	}

	public void acelerar(int km) {
		velocidad = velocidad + km;
		System.out.println(velocidad);
	}

	
	public void acelerar(int km, boolean nitro) {
		if (nitro == false) {
			System.out.println(" NO TENGO NITRO");
			acelerar(km);
			System.out.println(velocidad);
		} else {
			System.out.println("TENGO NITRO");
			acelerar(km * 2);
			
		}
	}

}
