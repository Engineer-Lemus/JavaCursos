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
		System.out.println(" Estoy Creando una Cuenta " + this.numero);

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

	public void retirar(double valor) throws SaldoInsuficienteException  {
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
}