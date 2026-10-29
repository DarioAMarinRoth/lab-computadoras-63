package teoria4;

public class Persona {
    private String nombre;
    private int dni;
    private EstadoCivil estadoCivil;

    private static int personasCreadas;

    public Persona(String nombre, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.estadoCivil = estadoCivil;
        personasCreadas++;
        dni = personasCreadas;
    }

    // Devuelve true si la persona es soltera
    public boolean esSoltera() {
        return estadoCivil.equals(EstadoCivil.SOLTERO);
    }

    public int consultarDni() {
        return dni;
    }

    public static int getPersonasCreadas() {
        return personasCreadas;
    }
}
