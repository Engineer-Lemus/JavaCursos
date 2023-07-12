package bytebank;

public class CrearCuenta {

	public static void main(String[] args) {

		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.depositar(400);

		System.out.println(primeraCuenta.getSaldo());

		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.depositar(400);

		System.out.println(segundaCuenta.getSaldo());

		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);

		if (primeraCuenta.getSaldo() == segundaCuenta.getSaldo()) {

			System.out.println("Son el mismo objeto");
		} else {
			System.out.println(" Son diferentes ");

		}

	}

}
