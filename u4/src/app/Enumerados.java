package app;

import enums.Color;
import modelos.Persona;

public class Enumerados {
    public static void main(String[] args) {
        Persona unaPersona = new Persona("Fulano", 20, Color.MARRON);
        Persona otraPersona = new Persona("Mengano", 21, Color.MARRON);

        System.out.println(unaPersona.colorDeOjos.equals(otraPersona.colorDeOjos));
    }
}
