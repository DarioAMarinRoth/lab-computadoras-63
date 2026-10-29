package teoria4;

public class PruebaPersona {
    static void main() {
        Persona p1 = new Persona("Pepito", EstadoCivil.CASADO);
        Persona p2 = new Persona("Pepito", EstadoCivil.CASADO);
        Persona p3 = new Persona("Pepito", EstadoCivil.CASADO);
        Persona p4 = new Persona("Pepito", EstadoCivil.CASADO);
        Persona p5 = new Persona("Pepito", EstadoCivil.CASADO);

        IO.println(Persona.getPersonasCreadas());

    }
}
