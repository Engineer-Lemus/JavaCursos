package com.bytebank.test;

import com.bytebankHeredado.modelo.Cuenta;
import com.bytebankHeredado.modelo.CuentaCorriente;

public class TestLibreria {

	public static void main(String[] args) {

		Cuenta cuenta = new CuentaCorriente(12, 12);
		cuenta.depositar(200);

	}

}
