package conceptos.sintaxis;

import java.awt.*;
import java.util.GregorianCalendar;

public class Objetos {
    public static void main(String[] args) {
        // Para crear un objeto primero necesitamos una variable para almacenar la referencia al objeto:
        // <Clase> <identificador>;
        // Ejemplos:

        Point miPunto;                      // Una variable para objeto del tipo Point
        GregorianCalendar miCalendario;     // Una variable para objeto del tipo GregorianCalendar.

        // Para crear un objeto se utiliza un mét. especial que se llama "Constructor"
        // El constructor se llama SIEMPRE igual que la clase.
        // Para invocar a un constructor se utiliza la palabra reservada `new`.

        miPunto = new Point();
        miCalendario = new GregorianCalendar();

        // Es normal que una clase tenga más de un constructor.

        Point otroPunto = new Point(1,1);
    }
}
