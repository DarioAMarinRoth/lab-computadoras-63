package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Pedir al usuario:
        // - edad
        // - altura
        // - nombre completo
        // Imprimir toda la info

        int edad;
        double altura;
        String nombreCompleto;

        Scanner ent = new Scanner(System.in);

        System.out.println("Por favor, ingrese su altura: ");
        altura = ent.nextDouble();

        System.out.println("Por favor, ingrese su edad: ");
        edad = ent.nextInt();

        System.out.println("Por favor, ingrese su nombre y apellido:");
        ent.nextLine();
        nombreCompleto = ent.nextLine();

        System.out.println("La info ingresada fue:");
        System.out.println(nombreCompleto);
        System.out.println(edad);
        System.out.println(altura);


//        String consolaSimulada = "5\n 7\n Fulano de Tal\n";
//        Scanner ent = new Scanner(consolaSimulada);
//        System.out.println("Por favor, ingrese su altura: ");
//        altura = ent.nextDouble();
//
//        System.out.println("Por favor, ingrese su edad: ");
//        edad = ent.nextInt();
//
//        System.out.println("Por favor, ingrese su nombre y apellido:");
//        nombreCompleto = ent.nextLine();
//        String auxiliar = ent.nextLine();
//
//        System.out.println("La info ingresada fue:");
//        System.out.println(altura);
//        System.out.println(edad);
//        System.out.println(nombreCompleto);
//        System.out.println(auxiliar);

    }
}
