package com.bytebankHeredado.modelo;

/**
 * Cuenta va a creae nuevas instancias de cuenta corriente, cuenta de ahorros
 * 
 * @author HappyFeet
 * @version 1.0
 * 
 * 
 */

public abstract class Cuenta {

	// public accesible cualquier parte proyecto
	// default accesible dentro del paquete
	// protected default + clases hijas
	// private solo desde la clase

	protected double saldo;
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente();

	private static int total;

	public static int getTotal() {
		return total;
	}

	/**
	 * Instancia una nueva cuenta sin parametros
	 * 
	 * @author HappyFeet
	 */
	public Cuenta() {
	}

	/**
	 * Instancia una nueva cuenta usando agencia y numero
	 * 
	 * @author HappyFeet
	 */
	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estoy Creando una Cuenta " + this.numero);

		Cuenta.total++;

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		}
	}

	public abstract void depositar(double valor);

	/**
	 * Este metodo retira dinero de la cuenta y si ocurre un error devuelve una
	 * excepcion
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */

	public void retirar(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("No tienes Saldo");

		}
		this.saldo -= valor;
	}

	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			try {
				this.retirar(valor);
			} catch (SaldoInsuficienteException e) {

				e.printStackTrace();
			}
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;

		} else {
			System.out.println("No estan permitidos numeros negativos");
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static void main(String[] args) {

	}

	@Override
	public String toString() {
		String cuenta = "Numero: " + this.numero + " , Agencia: " + this.agencia;
		return cuenta;
	}

}