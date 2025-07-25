package validaciones;

import java.util.Scanner;

public class Validaciones {
    public static int ingresarNumero() {
        Scanner ent = new Scanner(System.in);
        int num = ent.nextInt();
        while (num > 1000 || num < 1) {
            System.out.println("El número ingresado no es valido. Ingrese un número entre el 1 y el 100:");
            num = ent.nextInt();
        }
        return num;
    }
}
