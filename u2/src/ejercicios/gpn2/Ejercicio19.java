package ejercicios.gpn2;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        int numeroIngresado;
        int menorNumero = Integer.MAX_VALUE;
        int segundoMenorNumero = Integer.MAX_VALUE;
        final int CANTIDAD_MAXIMA_DE_INGRESOS = 15;
        Scanner ent = new Scanner(System.in);

        for (int i = 0; i < CANTIDAD_MAXIMA_DE_INGRESOS; i++) {
            numeroIngresado = ent.nextInt();
            if (numeroIngresado < menorNumero) {
                segundoMenorNumero = menorNumero;
                menorNumero = numeroIngresado;
            } else if (numeroIngresado < segundoMenorNumero) {
                segundoMenorNumero = numeroIngresado;
            }
        }

        System.out.println("El menor número ingresado es " + menorNumero + " y el segundo menor número es " + segundoMenorNumero);
    }

}
