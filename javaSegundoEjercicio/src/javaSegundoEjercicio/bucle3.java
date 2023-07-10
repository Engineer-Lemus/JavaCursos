package javaSegundoEjercicio;

public class bucle3 {
	public static void main (String[] args) {
        for (int i = 1; i < 100; i++ ){
            if (i % 3 == 0)    {
                System.out.println(i);
            }
        }
    }

}

class MultiplosDeTresHastaCien {

    public static void main (String[] args) {
        for (int i = 3; i < 100; i += 3 ){
            System.out.println(i);
        }
    }

}