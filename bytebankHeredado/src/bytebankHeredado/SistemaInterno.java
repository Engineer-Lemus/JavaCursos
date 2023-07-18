package bytebankHeredado;

public class SistemaInterno {

	private String clave = "AluraCursos";

	public boolean autentica(Autenticable gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if (puedeIniciarSesion) {
			System.out.println("Login Exitoso");
			return true;
		} else {
			System.out.println("Error en Login");
			return false;
		}
	}
}
