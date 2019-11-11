package com.eduit.sobrecarga;

public class main {

	public static void main(String[] args) {

		Auto a1 = new Auto();
		Auto a2 = new Auto();
		Auto a3 = new Auto();
		System.out.println("AUTO 1");
		a1.acelerar();
		System.out.println("AUTO 2");
		a2.acelerar(10);
		System.out.println("AUTO 3");
		a3.acelerar(10, true);

	}

}
