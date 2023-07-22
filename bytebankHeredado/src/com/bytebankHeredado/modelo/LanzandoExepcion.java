package com.bytebankHeredado.modelo;

public class LanzandoExepcion {

	ArithmeticException exception = new ArithmeticException();
	
	private static void metodo2() {
        System.out.println("Inicio del metodo2");
        throw new ArithmeticException("Surgió un error");
}
}
	
	

