package com.bytebankHeredado.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bytebankHeredado.modelo.Cliente;
import com.bytebankHeredado.modelo.Cuenta;
import com.bytebankHeredado.modelo.CuentaAhorros;
import com.bytebankHeredado.modelo.CuentaCorriente;

public class TestOrdenarLista {

	public static void main(String[] args) {

		Cuenta cc1 = new CuentaCorriente(88, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNombre("Diego");
		cc1.setTitular(clienteCC1);
		cc1.depositar((333.0));

		Cuenta cc2 = new CuentaCorriente(11, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNombre("Renato");
		cc2.setTitular(clienteCC2);
		cc2.depositar((444.0));

		Cuenta cc3 = new CuentaCorriente(22, 75);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNombre("Liam");
		cc3.setTitular(clienteCC3);
		cc3.depositar((111.0));

		Cuenta cc4 = new CuentaCorriente(44, 11);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNombre("Noel");
		cc4.setTitular(clienteCC4);
		cc4.depositar((111.0));

		/*
		 * Cuenta cc1 = new CuentaCorriente(22, 44); cc1.depositar(333.0);
		 * 
		 * Cuenta cc2 = new CuentaAhorros(22, 11); cc1.depositar(444.0);
		 * 
		 * Cuenta cc3 = new CuentaCorriente(22, 11); cc1.depositar(111.0);
		 * 
		 * Cuenta cc4 = new CuentaAhorros(22, 22); cc1.depositar(222.0);
		 */

		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		// Ordenar las cuentas

		// Comparator<Cuenta> comparatorTitular = new OrdenadorPorNombreTitular();
		// lista.sort(new OrdenadorPorNombreTitular());

		// Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
		lista.sort(new Comparator<Cuenta>() {

			@Override
			public int compare(Cuenta o1, Cuenta o2) {

				return Integer.compare(o1.getNumero(), o2.getNumero());
			}

		});

		System.out.println("Despues de ordenar ");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		Collections.sort(lista, new Comparator<Cuenta>() {

			@Override
			public int compare(Cuenta o1, Cuenta o2) {

				return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
			}

		});

		System.out.println("Despues de ordenar Titular");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		Collections.sort(lista);
		System.out.println("Despues de ordenar Natural");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}

	}

}

class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		// Forma Basica
		/*
		 * if (o1.getNumero() == o2.getNumero()) { return 0; } else if (o1.getNumero() >
		 * o2.getNumero()) { return 1; } else { return -1; }
		 */
		// Forma Intermedia
		// return o1.getNumero()- o2.getNumero();

		// Forma Wrapper
		return Integer.compare(o1.getNumero(), o2.getNumero());

	}

}

class OrdenadorPorNombreTitular implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());

	}

}
