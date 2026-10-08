package teoria3;

import teoria2.Persona;

import java.util.ArrayList;

public class PruebaListas {
    static void main() {
        Persona p1 = new Persona("Fulano", 1, 1);
        Persona p2 = new Persona("Fulana", 1, 1);
        Persona p3 = new Persona("Mengano", 1, 1);

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);


    }
}
