package ejercicios.propuestos;

// Crear un vector de tamaño N y llenarlo de forma automática con números aleatorios e
// imprimir el vector. Colocar los elementos pares en las primeras coordenadas del vector y los
// impares en las últimas. Luego, ordenar los elementos pares e impares de menor a mayor. Para
// finalizar, imprimir el vector modificado.
// Aclaración: se debe trabajar con un único vector.

/*
* [X] Obtener la dimensión
* [X] Generar el vector
* [X] Imprimir el vector
* [X] Reordenar pares e impares
* [] Ordenar de menor a mayor (pares e impares de forma independiente)
* [] Volver a imprimir el vector
* */

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

import static utils.Funciones.*;

public class Clase0911 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int dimension;
        int[] vector;

        System.out.println("Por favor, ingrese la dimensión del vector: ");
        dimension = ent.nextInt();
        int min = 1;
        int max = 10;
        vector = generarVectorAleatorio(dimension, min, max);
        imprimirVector(vector);
        System.out.println();
        reordenarParesImpares(vector);
        imprimirVector(vector);
        System.out.println();
        menorAMayorParesImpares(vector);
        imprimirVector(vector);


    }
}
