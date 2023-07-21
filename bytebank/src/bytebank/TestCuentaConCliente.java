package bytebank;

public class TestCuentaConCliente {

    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.setNombre("Diego Rojas");
        diego.setDocumento("33442211");
        diego.setTelefono("987654321");

        Cuenta cuentaDeDiego = new Cuenta(765);
        cuentaDeDiego.depositar(1000);

        // cuentaDeDiego.titular = diego;
        cuentaDeDiego.setTitular(diego);
        System.out.println(cuentaDeDiego.getTitular().getNombre());
    }
    
}
