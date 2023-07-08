package javaSegundoEjercicio;

public class TipoVariable {
	
	public static void main (String[] args) {
	
		System.out.println(" !!! Hola Mundo !!! ");
		
		int edad = 28;
		System.out.println(edad);
		
		edad = 47;
		System.out.println(edad);
		
		edad = 47*85;
		System.out.println("La edad de la tierra es " + edad + " miles de años");
		
		double salario = 1250.56;
		System.out.println(salario);
		
		double salarioMitad = salario / 2;
		System.out.println(salarioMitad);
		
		int division = 1250 / 3;
		System.out.println(division);
		
		double variable1 = 230.89;
		int  variable1Entero = (int) variable1; // cast
		System.out.println(variable1Entero);
		
		long prueba = 12222222222222222L;
		System.out.println(prueba);
		
		//  long 64 bits  int 32 bits  short 16 bits byte 8 bits  float decimales small //
		
		double resultado = variable1 + variable1Entero;
		System.out.println(resultado);
		
		
	}

}
