package com.bytebankHeredado.test;

import com.bytebankHeredado.modelo.Cliente;
import com.bytebankHeredado.modelo.Cuenta;
import com.bytebankHeredado.modelo.CuentaAhorros;
import com.bytebankHeredado.modelo.CuentaCorriente;

public class TestArregloReferencias {

	public static void main(String[] args) {

		Object[] referencias = new Object[5];

		CuentaCorriente cc = new CuentaCorriente(23, 44);

		referencias[1] = cc;

		Cliente cliente = new Cliente();
		referencias[4] = cliente;

		Cliente obtenido = (Cliente) referencias[4];
		System.out.println(obtenido);

		CuentaAhorros ca = new CuentaAhorros(44, 55);
		referencias[3] = ca;

		referencias[0] = new CuentaCorriente(11, 99);
		System.out.println(referencias[0]);

		System.out.println(cc);
		System.out.println(referencias[1]);

		// cast
		CuentaCorriente cuenta = (CuentaCorriente) referencias[1];
		System.out.println(cuenta);

		for (int i = 0; i < referencias.length; i++)

		{
			System.out.println(referencias[i]);
		}
		int[] refs = { 1, 2, 3, 4, 5 };
		System.out.println(refs[0]);
	}

}