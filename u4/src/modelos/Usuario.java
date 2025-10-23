package modelos;

public class Usuario {
    private int telefono;
    private String nombre;
    private String email;
    private int ID;
    private static int contadorUsuarios = 0;

    // Comportamientos

    public void saludar() {
        System.out.println("Hola! Soy " + nombre);
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\nTelefono: %d\nEmail: %s", nombre, telefono, email);
    }

    public Usuario() {
        ID = ++contadorUsuarios;
    }

    public int getID() {
        return ID;
    }

    public static int getContadorUsuarios() {
        return contadorUsuarios;
    }
}
