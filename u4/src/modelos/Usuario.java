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
        return "Usuario{" +
                "telefono=" + telefono +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", ID=" + ID +
                '}';
    }

    public Usuario() {
        ID = ++contadorUsuarios;
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
        ID = ++contadorUsuarios;
    }

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        ID = ++contadorUsuarios;
    }

    public Usuario(int telefono, String nombre) {
        this.telefono = telefono;
        this.nombre = nombre;
    }

    public Usuario(String email, int telefono) {

    }
    public int getID() {
        return ID;
    }

    public static int getContadorUsuarios() {
        return contadorUsuarios;
    }
}
