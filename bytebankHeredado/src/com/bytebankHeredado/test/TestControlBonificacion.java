package com.bytebankHeredado.test;

import com.bytebankHeredado.modelo.*;


public class TestControlBonificacion {

	public static void main(String[] args) {

		Funcionario diego = new Contador();
		diego.setSalario(2000);

		Gerente jimena = new Gerente();
		jimena.setSalario(10000);

		Contador alexis = new Contador();
		alexis.setSalario(5000);

		Control controlBonificacion = new Control();

		controlBonificacion.registrarSalario(diego);
		controlBonificacion.registrarSalario(jimena);
		controlBonificacion.registrarSalario(alexis);
	}

}
