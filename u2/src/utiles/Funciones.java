package utiles;

public class Funciones {

    public static double abs(double a) {
        if (a < 0) {
            return a * -1;
        } else {
            return a;
        }
    }

    public static boolean sonIguales(double num1, double num2, double tolerancia) {
        return abs(num1 - num2) <= tolerancia;
    }

    public static void main(String[] args) {
        System.out.println(sonIguales(1000, 1001, 1));
    }
}
