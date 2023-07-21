package bytebank;

public class PruebaConstructor {
	
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(555);
		Cuenta cuenta2 = new Cuenta(255);
		Cuenta cuenta3 = new Cuenta(754);
		
	System.out.println(Cuenta.getTotal());
	}

}
