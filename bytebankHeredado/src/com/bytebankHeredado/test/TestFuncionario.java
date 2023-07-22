package com.bytebankHeredado.test;

import com.bytebankHeredado.modelo.*;

public class TestFuncionario {

	public static void main(String[] args) {
		com.bytebankHeredado.modelo.Funcionario diego = new Contador();
		diego.setDocumento("Daniel");
		diego.setDocumento("4523587");
		diego.setSalario(20000);
		diego.setTipo(0);

		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());

	}

}
