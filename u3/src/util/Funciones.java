package util;

public class Funciones {
    public static void imprimirVector(int[] vector) {
        for (int elemento : vector) {
            System.out.println(elemento);
        }
    }

    public static int[] vectorAleatorio(int n, int min, int max) {
        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = enteroAleatorio(min, max);
        }

        return vector;

    }

    public static int[][] matrizAleatoria(int n, int m, int min, int max) {
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            mat[i] = vectorAleatorio(m, min, max);
        }
        return mat;
    }


    public static int enteroAleatorio(int min, int max) {
        return (int) (Math.random() * (max + 1 - min) + min);
    }
}
