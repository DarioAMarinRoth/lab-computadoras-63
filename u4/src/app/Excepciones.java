package app;

import enums.Color;
import modelos.Persona;

import java.util.Scanner;

public class Excepciones {
    public static void main(String[] args) {
        Persona persona = new Persona("Fulano", 20, Color.MARRON);
        Scanner ent = new Scanner(System.in);

        try {
            persona.setEdad(ent.nextInt());
            int a = ent.nextInt();
            System.out.println(1 / a);
        } catch (Exception error) {
            System.out.println("La edad no puede ser negativa.");
            System.out.println("No se modificó su valor.");
        }

        System.out.println(persona);
    }
}
