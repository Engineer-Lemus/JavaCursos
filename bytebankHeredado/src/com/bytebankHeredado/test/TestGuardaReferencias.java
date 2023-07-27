package com.bytebankHeredado.test;

import com.bytebankHeredado.modelo.Cuenta;
import com.bytebankHeredado.modelo.CuentaCorriente;
import com.bytebankHeredado.modelo.GuardaReferencias;

public class TestGuardaReferencias {
	
	public static void main(String[] args) {

		GuardaReferencias guardaReferencias = new GuardaReferencias();
		Cuenta cc = new CuentaCorriente(11, 22);
		guardaReferencias.adicionar(cc);
		Cuenta cc2 = new CuentaCorriente(22, 44);
		guardaReferencias.adicionar(cc2);

		guardaReferencias.obtener(1);

		System.out.println(guardaReferencias.obtener(0));
		System.out.println(guardaReferencias.obtener(1));

	}


}
