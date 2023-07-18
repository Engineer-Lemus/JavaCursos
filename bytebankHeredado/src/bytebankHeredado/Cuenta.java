package bytebankHeredado;

public abstract class Cuenta {

	protected double saldo;
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente();

	private static int total;

	public static int getTotal() {
		return total;
	}

	public Cuenta() {
	}

	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println(" Estoy Creando : " + total + " cuentas ");

		total++;

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		}
	}

	public abstract void  depositar(double valor); 


	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;

	}

	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.retirar(valor);
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
		System.out.println("Ejecutando test de gerente");
	}
}