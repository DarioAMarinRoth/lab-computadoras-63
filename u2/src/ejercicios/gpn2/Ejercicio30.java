package ejercicios.gpn2;

import static utiles.Funciones.potencia;

public class Ejercicio30 {

    public static void main(String[] args) {
        System.out.println(deBinarioADecimal(100));
    }

    public static int deBinarioADecimal(int numeroBinario) {
        int numeroDecimal = 0;
        int digito;
        int exponente = 0;
        while (numeroBinario != 0) {
            digito = numeroBinario % 10;
            numeroDecimal += digito * (int) potencia(2, exponente);
            exponente++;
            numeroBinario /= 10;
        }
        return numeroDecimal;
    }


}
