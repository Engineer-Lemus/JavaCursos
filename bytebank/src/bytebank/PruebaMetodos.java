package bytebank;

public class PruebaMetodos {

	public static void main(String[] args) {

		Cuenta cuentaDaniel = new Cuenta(785);
		cuentaDaniel.saldo = 300;
		cuentaDaniel.depositar(200);

		System.out.println(cuentaDaniel.saldo);

		cuentaDaniel.retirar(100);
		System.out.println(cuentaDaniel.saldo);

		Cuenta cuentaJimena = new Cuenta(865);
		cuentaJimena.depositar(1000);
		boolean puedeTransferir = cuentaJimena.transferir(400, cuentaDaniel);

		if (puedeTransferir) {
			System.out.println("Transferencia Exitosa");
		} else {
			System.out.println("No es posible Transferir");
		}

		System.out.println(cuentaJimena.saldo);
		System.out.println(cuentaDaniel.saldo);

	}

}
