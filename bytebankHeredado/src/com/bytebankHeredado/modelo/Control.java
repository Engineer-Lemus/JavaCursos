package com.bytebankHeredado.modelo;

public class Control {

	private double suma;

	public double registrarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;

	}

}