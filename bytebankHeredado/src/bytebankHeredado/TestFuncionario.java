package bytebankHeredado;

public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario diego = new Funcionario();
		diego.setDocumento("Daniel");
		diego.setDocumento("4523587");
		diego.setSalario(2000);
		diego.setTipo(0);

		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());

	}

}
