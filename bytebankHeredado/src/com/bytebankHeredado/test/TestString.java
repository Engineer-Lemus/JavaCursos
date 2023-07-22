package com.bytebankHeredado.test;

import com.bytebankHeredado.modelo.CuentaAhorros;

public class TestString {

	public static void main(String[] args) {

		String nombre = "Alura";

		System.out.println("Antes de replace: " + nombre);
		nombre = nombre.replace("A", "a");
		nombre = nombre.concat(" cursos online ");
		nombre = nombre.toUpperCase();
		nombre = nombre.toLowerCase();
		char letra = nombre.charAt(4);
		int indice = nombre.indexOf("e");
		
		Object cuenta =  new CuentaAhorros(344,544);

		printLine(nombre);
		printLine(letra);
		printLine(indice);
		printLine(new CuentaAhorros(200, 300));

	}

	public static void printLine(Object valor) {

		System.out.println(valor.toString());
	}
}
