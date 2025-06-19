package ejercicios.propuestos;

import java.util.Scanner;

public class AlimentoGranja {
    public static void main(String[] args) {

        double comidaDiaria;
        int numAnimales;
        double kilosPorAnimal;
        double comidaNecesaria;

        Scanner ent = new Scanner(System.in);

        // Solicitar valores al usuario:

        System.out.println("Ingrese la cantidad de comida disponible:");
        comidaDiaria = ent.nextDouble();

        while (comidaDiaria < 0) {
            System.out.println("La cantidad de comida no puede ser un número negativo. Vuelva a ingresar el valor:");
            comidaDiaria = ent.nextDouble();
        }



        System.out.println("Ingrese la cantidad de animales de la granja:");
        numAnimales = ent.nextInt();
        System.out.println("Ingrese cuanto come cada animal:");
        kilosPorAnimal = ent.nextDouble();

        comidaNecesaria = numAnimales * kilosPorAnimal;

        if (comidaDiaria >= comidaNecesaria) {
            System.out.println("La comida es suficiente.");
        } else {
            double comidaFaltante = comidaNecesaria - comidaDiaria;
            System.out.println("La comida es insuficiente, falta " + comidaFaltante);
        }


    }
}
