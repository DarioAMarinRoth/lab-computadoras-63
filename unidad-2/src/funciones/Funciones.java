package funciones;

public class Funciones {

    public static boolean sonIguales(double num1, double num2, double tolerancia) {
        double diferencia = num2 > num1 ? num2 - num1 : num1 - num2; // Operador ternario
        return diferencia <= tolerancia;
    }

    public static double valorAbsoluto(double num) {
        double resultado = num; // Asumiendo que es positivo
        if (resultado < 0) {
            resultado = resultado * -1;
        }
        return resultado;
    }

    public static int enteroAleatorio(int li, int ls) {
        int A = ls + 1 - li;
        return (int) Math.floor(Math.random() * A + li); // Math.floor(...) elimina los decimales de un double.
    }

}