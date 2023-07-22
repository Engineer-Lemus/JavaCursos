package com.bytebankHeredado.modelo;

public class Gerente extends Funcionario implements Autenticable {

	private String clave;

	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean iniciarSesion(String clave) {
		return clave == "AluraCursos";
	}

	public double getBonificacion() {
		System.out.println("Ejecutando test desde gerente");
		return super.getSalario() + this.getSalario() * 0.05;

	}
}