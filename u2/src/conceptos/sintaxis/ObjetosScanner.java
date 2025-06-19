package conceptos.sintaxis;

import java.util.Scanner;

public class ObjetosScanner {
    public static void main(String[] args) {

        String cuentito = "3 tristes tigres \n tragaban trigo \n en un trigal.";

        Scanner miScanner = new Scanner(cuentito);

//        int num = miScanner.nextInt();
//        System.out.println(num);
//        String palabra = miScanner.next();
//        System.out.println(palabra);
//        palabra = miScanner.next();
//        System.out.println(palabra);
//        num = miScanner.nextInt();
//        System.out.println(num);

        System.out.println(miScanner.nextLine());
        System.out.println(miScanner.nextLine());
        System.out.println(miScanner.nextLine());

        miScanner.close();

        // Métodos útiles de Scanner:

        // next() -> lee la siguiete palabra.
        // nextLine() -> lee la siguiente línea.
        // nextInt() -> lee el siguiente entero.
        // nextBoolean() -> lee el siguiente booleano
        // nextDouble() -> lee el siguiente double(flotante).

    }
}
