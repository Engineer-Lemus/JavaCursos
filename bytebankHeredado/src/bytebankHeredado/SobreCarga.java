package bytebankHeredado;

public class Gerente extends Funcionario {

    private int contraseña;

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public boolean autenticar(int contraseña) {
        if (this.contraseña == contraseña) {
            return true;
        } else {
            return false;
        }
    }

    // Nuevo método, recibiendo dos parámetros
    public boolean autenticar(String login, int contraseña) {
        // implementación omitida
    }

    // Otros métodos omitidos
}