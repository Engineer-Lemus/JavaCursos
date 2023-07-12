package bytebank;

public class pruebaEncapsulamiento {

	public static void main(String[] args) {

		Cuenta cuenta = new Cuenta();
		Cliente cliente = new Cliente();
		cliente.setNombre("Diego");
		cliente.setDocumento("ffaffd5255");

		cuenta.setTitular(cliente);

		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());
	}

}
