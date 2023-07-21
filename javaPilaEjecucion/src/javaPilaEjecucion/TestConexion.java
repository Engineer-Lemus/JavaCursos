package javaPilaEjecucion;

public class TestConexion {
	public static void main(String[] args) throws Exception {
		
		try (Conexion con = new Conexion()) {
			con.leerDatos();	
		}catch (IllegalStateException ex){
			System.out.println("Ejecutando cash");
			ex.printStackTrace();
		}
		
	}
}
		
	
		/*Conexion con = new Conexion();
		try {
			con.leerDatos();
		} catch (IllegalStateException ex) {
			System.out.println("Recibiendo Exception");
			ex.printStackTrace();

		} finally {
			System.out.println("Ejecutando finally");
			con.cerrar();
		}

	}*/


