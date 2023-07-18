package bytebankHeredado;

public class TestReferencias {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Contador();
		funcionario.setNombre("Daniel");

		Gerente gerente = new Gerente();
		gerente.setNombre("Isabel");

		funcionario.setSalario(2000);
		gerente.setSalario(15000);
		
		gerente.iniciarSesion("_asasa");

	}
}
