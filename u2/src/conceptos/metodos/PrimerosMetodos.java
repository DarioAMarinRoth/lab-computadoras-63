package conceptos.metodos;

public class PrimerosMetodos {
    public static void main(String[] args) {
        miMetodo();
        imprimirSuma(1,3);
        int rta = incrementarEnDos(5);
        System.out.println(rta);
    }

    // Método sin parámetros de entrada y sin retorno
    public static void miMetodo() {
        System.out.println("Mi primer método");
    }

    // Método con parámetros de entrada y sin retorno.
    public static void imprimirSuma(int a, int b) {
        System.out.println(a + b);
    }

    // Método con parámetros de entrada y con retorno.
    public static int incrementarEnDos(int valor) {
        return  valor + 2;
    }
}
