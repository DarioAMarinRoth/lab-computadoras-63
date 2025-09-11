package utils;

public class Funciones {

    public static int enteroAleatorio(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }

    public static void imprimirVector(int[] vector) {
        System.out.print("[");
        for (int e : vector) {
            System.out.printf("%d ", e);
        }
        System.out.print("]");
    }


    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-10d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] generarVectorAleatorio(int dimension, int min, int max) {
        int[] vector = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            vector[i] = enteroAleatorio(min, max);
        }
        return vector;
    }


    public static void reordenarParesImpares(int[] vector) {
        int j = 0;
        for (int i = 0; i < vector.length; i++) {
            if (esPar(vector[i])) {
                int temp = vector[i];
                vector[i] = vector[j];
                vector[j] = temp;
                j++;
            }
        }
    }

    public static void menorAMayorParesImpares(int[] vector) {
        int n = vector.length - 1;
        for (int i = 0; i < vector.length; i++) {
            if (!esPar(vector[i])) {
                n = i - 1;
                break;
            }
        }

        for (int j = n; j > 0 ; j--) {
            for (int i = 0; i < j; i++) {
                if (vector[i] > vector[j]) {
                    int temp = vector[i];
                    vector[i] = vector[j];
                    vector[j] = temp;
                }
            }
        }

    }
}
