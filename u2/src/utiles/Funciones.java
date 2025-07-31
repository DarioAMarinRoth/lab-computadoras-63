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

    public static double raizCuadrada(double argumento, double tolerancia) {
        double base = 7;    // Elegido arbitrariamente
        double altura = argumento / base;

        while (!sonIguales(base, altura, tolerancia)) {
            base = (base + altura) / 2;
            altura = argumento / base;
        }
        return base;
    }

    public static double raizCuadrada(double argumento) {
        return raizCuadrada(argumento, 0.0000000000001);
    }



    public static void main(String[] args) {
        System.out.println(potenciaIterativa(2, 5));
    }

    public static double potencia(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return potencia(base, exponente - 1) * base;
        }
    }

    public static double potenciaIterativa(double base, double exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
