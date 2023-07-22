package com.bytebankHeredado.test;

import com.bytebankHeredado.modelo.*;


public class TestReferencias {

	public static void main(String[] args) {
		
		com.bytebankHeredado.modelo.Funcionario funcionario = new Contador();
		funcionario.setNombre("Daniel");

		com.bytebankHeredado.modelo.Gerente gerente = new Gerente();
		gerente.setNombre("Isabel");

		funcionario.setSalario(2000);
		gerente.setSalario(15000);
		
		gerente.iniciarSesion("_asasa");

	}
}
