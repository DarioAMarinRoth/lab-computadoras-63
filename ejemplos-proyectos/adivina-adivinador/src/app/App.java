package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int numeroGanador;
        int intento = -1;
        int intentosGastados = 0;
        final int CANTIDAD_MAXIMA_DE_INTENTOS = 10;
        Scanner ent = new Scanner(System.in);

        System.out.println("Jugador 1, ingrese un número: ");
        numeroGanador = ent.nextInt();

        System.out.println("Jugador 2, intente adivinar");
        while (intento != numeroGanador && intentosGastados < CANTIDAD_MAXIMA_DE_INTENTOS) {
            intento = ent.nextInt();
            intentosGastados++;

            int distancia;
            // Calcular la distancia

            if (numeroGanador > intento) {
                distancia = numeroGanador - intento;
            } else {
                distancia = intento - numeroGanador;
            }

            int muyCerca = 5;
            int cerca = 10;
            int medianamenteCerca = 20;

            if (distancia < muyCerca) {
                System.out.println("Te estás quemando");
            } else if (distancia < cerca) {
                System.out.println("Caliente");
            } else if (distancia < medianamenteCerca) {
                System.out.println("Tibio");
            } else {
                System.out.println("Frio");
            }
        }

        if (intento == numeroGanador) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Perdiste");
        }
    }
}
