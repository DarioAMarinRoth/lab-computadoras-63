package teoria;

public class Repaso {
    public static void main(String[] args) {

        // Vectores

        // <tipo de dato> [] identificador; // Declaro un vector

        int[] numerosEnteros;
        boolean[] banderas;
        String[] palabras;

        int dimension = 5;

        numerosEnteros = new int[dimension];
        int i = 0;
        numerosEnteros[i] = 10;
        numerosEnteros[1] = -4;
        numerosEnteros[2] = 590;
        numerosEnteros[3] = 1;
        numerosEnteros[4] = 101;

        imprimirVector(numerosEnteros);

    }

    public static void imprimirVector(int[] numeros) {
        for (int elemento : numeros) {      // int i = 0; i < numeros.length; i++; elemento = numeros[i]
            System.out.println(elemento);
            elemento++;
        }
    }
}
