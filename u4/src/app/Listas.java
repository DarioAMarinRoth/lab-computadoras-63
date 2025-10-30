package app;

import enums.Color;
import modelos.Persona;

import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {

        // Clases Wrappers:
        // int -> Integer
        // double -> Double
        // boolean -> Boolean
        // char -> Character

        ArrayList<Persona> miLista = new ArrayList<>();

        Persona unaPersona = new Persona("Fulano", 20, Color.MARRON);
        Persona otraPersona = new Persona("Mengano", 21, Color.AZUL);

        miLista.add(unaPersona);
        miLista.add(otraPersona);
        miLista.add(new Persona("Miguelito", 23, Color.VERDE));
        miLista.size(); // equivalente a miArray.length

        System.out.println(miLista.get(1));

        for (Persona persona : miLista) {
            System.out.println(persona);
        }

    }

}
