package com.eduit.clase2;

public class Main {

	public static void main(String[] args) {

		CuentaCorriente cliente1 = new CuentaCorriente();

		System.out.println("SALDO :"+ cliente1.GetSaldo());
		System.out.println("DISPONIBLE" +cliente1.GetDescubierto());

		cliente1.SetSaldo(10000);
		System.out.println("DISPONIBLE LUEGO DEL DEP :" + cliente1.GetTotalDisponible());
		cliente1.ExtraerDinero(8000);
		System.out.println("extraemos 8000 ");
		System.out.println("DISPONIBLE LUEGO DE la extrac :" + cliente1.GetTotalDisponible());
		
	}

}
