package com.bytebankHeredado.test;

import com.bytebankHeredado.modelo.*;

public class TestGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();

		gerente.setSalario(95000);
		gerente.setNombre("Lemus");
		gerente.setTipo(1);
		gerente.setClave("AluraCursos");

		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.getNombre());
		System.out.println(gerente.iniciarSesion("AluraCursos"));

	}
}