package conceptos.sintaxis;

import java.util.Scanner;

public class EntradaEstandar {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Scanner otroScanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese un número: ");
        int num = teclado.nextInt();
        System.out.println("El número ingresado fue " + num);
    }
}
