package com.bytebankHeredado.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.bytebankHeredado.modelo.Cliente;
import com.bytebankHeredado.modelo.Cuenta;
import com.bytebankHeredado.modelo.CuentaCorriente;

public class TestArrayList {

	public static void main(String[] args) {

		ArrayList<Cuenta> lista = new ArrayList();
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(13, 42);

		lista.add(cc);
		lista.add(cc2);

		// Cliente cliente = new Cliente();
		// lista.add(cliente);

		Cuenta obtenerCuenta = lista.get(0);
		System.out.println(obtenerCuenta);

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}

	}

}
