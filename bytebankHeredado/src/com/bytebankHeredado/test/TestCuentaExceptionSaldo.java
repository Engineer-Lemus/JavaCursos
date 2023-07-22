package com.bytebankHeredado.test;

import com.bytebankHeredado.modelo.*;

public class TestCuentaExceptionSaldo {
	public static void main(String[] args)  {
		
		Cuenta cuenta = new CuentaAhorros (123,456);
		cuenta.depositar(200);
		try {
			cuenta.retirar(100);
		} catch (SaldoInsuficienteException e) {
		
			e.printStackTrace();
		}
	}

}
