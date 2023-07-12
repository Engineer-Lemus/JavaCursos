package bytebank;

public class TestReferencia2 {

	public static void main(String[] args) {

		Cliente daniel = new Cliente();
		daniel.setNombre("Daniel");
		daniel.setTelefono ("3356985471");
		daniel.setDocumento("516987");

		Cuenta cuentaDaniel = new Cuenta();
		cuentaDaniel.titular = daniel;

		System.out.println(cuentaDaniel.titular.getDocumento());
	}

}
