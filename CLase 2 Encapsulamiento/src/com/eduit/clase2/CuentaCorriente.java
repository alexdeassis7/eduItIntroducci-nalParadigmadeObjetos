package com.eduit.clase2;

public class CuentaCorriente {
	// ATRIBUTOS ENCAPSULADOS
	private float saldo = 0;
	private float descubierto = 1000;

	public float GetTotalDisponible() {

		return saldo + descubierto;
	}

	public void SetSaldo(float dineroADepocitar) {
		// saldo = saldo + dineroADepocitar;
		saldo = saldo + dineroADepocitar;
	}

	public void ExtraerDinero(float montoAextraer) {

		if (montoAextraer <= (saldo + descubierto)) {
			System.out.println("entre !!");
			if (montoAextraer > saldo && montoAextraer < (saldo + descubierto)) {
				float diferencia = montoAextraer - saldo;				
				descubierto = descubierto - diferencia;
				saldo = 0;
			}else {
				saldo = saldo -montoAextraer;
			}

		} else {

			System.out.println("supero su limite de saldo ");
			System.out.println("su saldo es : " + GetTotalDisponible());

		}

	}

	public float GetSaldo() {

		return saldo;
	}

	public float GetDescubierto() {

		return descubierto;
	}
}
