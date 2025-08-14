package teoria;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        int[] asistenciaSemanal;                                            // Declaración de una variable del tipo Array int
        int tamaño = 3;
        asistenciaSemanal = new int[100];                                     // Crear un array de 7 elementos y almacenamos su dirección en la variable asistenciaSemanal;

        Scanner ent = new Scanner(System.in);

        System.out.println("Ingrese la asistencia semanal día por día:");

        for (int i = 0; i < asistenciaSemanal.length; i++) {
            asistenciaSemanal[i] = ent.nextInt();
        }



        System.out.println("La asistencia que ingresó son: ");



        for (int asistenciaDiaria : asistenciaSemanal) { // For each - Bucle for mejorado
            System.out.print(asistenciaDiaria + " ");
        }

        // printArray(asistenciaSemanal);


        // Función que reciba como parametro un array de enteros y que lo imprima
        // Versión 1: imprimir horizontalmente x0 x1 x2 x3 x4
        // Versión 2: [x0, x1, x2, x3, ... xn]

    }
}

