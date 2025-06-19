package conceptos.control;

import java.util.Scanner;

public class Iteraciones {
    public static void main(String[] args) {

//        int contador = 0;
//
//        while (contador < 10) {
//            ++contador; // -> contador++ o ++contador
//            System.out.println("Este loop se repite 10 veces. Vamos por la vez " + contador);
//            System.out.println("Si el contador llega a 6, entonces el loop se va a interrumpir");
//            if (contador == 6) {
//                break;
//            }
//        }
//        System.out.println("El fin del programa");


        int contador = 0;

        while (contador < 10) {
            ++contador; // -> contador++ o ++contador
            if (contador == 2) {
               continue;
            }
            System.out.println("Este loop se repite 10 veces. Vamos por la vez " + contador);
            System.out.println("Si el contador llega a 6, se saltea esa repetición");
        }
        System.out.println("El fin del programa");
    }
}
