package teoria;

import static util.Funciones.*;

public class Matrices {
    public static void main(String[] args) {

        int edad = 0;

        int[][] miMatriz = {{1, 100, 12543, 12}, {12, 1, 12, 1}, {1000, 132, 453, 3245}};
        imprimirMatriz(miMatriz);

    }

    public static void imprimirVector(int[] vector) {

        for (int elemento : vector) {
            System.out.println(elemento);
        }

    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.printf("%-10d" ,elemento);
            }
            System.out.println();
        }
    }

    /*      TAREA: función "matrizAleatoria"
            Realizar una función que reciba como parámetro de entrada 4 enteros:
            - n: Filas de una matriz.
            - m: Columnas de una matriz.
            - min: Un valor mínimo
            - max: Un valor máximo
            La función debe retornar una matriz de n filas y m columnas con elementos
            enteros aleatorios pertenecientes al intervalo [min; max]
     */
}
