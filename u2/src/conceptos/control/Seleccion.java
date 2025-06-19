package conceptos.control;

import java.util.Scanner;

public class Seleccion {
    public static void main(String[] args) {

        boolean exp = true;

        System.out.println("El comienzo del programa");

        if (exp) {
            System.out.println("El programa va por la mitad y estamos en la rama true");
        } else {
            System.out.println("El programa va por la mitad y estamos en la rama false");
        }

        System.out.println("Terminó el programa");

        Scanner ent = new Scanner(System.in);

        boolean exp1 = false;
        boolean exp2 = false;
        boolean exp3 = false;

        if (exp1){
            System.out.println("Entró al primer if");
        } else if (exp2) {
            System.out.println("Entro al segundo if");
        } else if (exp3) {
            System.out.println("Entró al tercer if");
        } else {
            System.out.println("El else final");
        }

    }
}
