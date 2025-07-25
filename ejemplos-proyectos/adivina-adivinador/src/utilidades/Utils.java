package utilidades;


public class Utils {
    public static int calcularDistancia(int num1, int num2) {
        return Math.abs(num1 - num2);
    }

    public static void imprimirPista(int distancia) {
        final int MUY_CERCA = 5;
        final int CERCA = 10;
        final int MEDIANAMENTE_CERCA = 20;

        if (distancia < MUY_CERCA) {
            System.out.println("Te estás quemando");
        } else if (distancia < CERCA) {
            System.out.println("Caliente");
        } else if (distancia < MEDIANAMENTE_CERCA) {
            System.out.println("Tibio");
        } else {
            System.out.println("Frio");
        }
    }
}
