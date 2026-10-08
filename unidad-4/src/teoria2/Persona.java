package teoria2;

public class Persona {

    // Atributos

    private String nombre;
    private int edad;
    private double altura;

    // # Métodos

    // Constructores

    public Persona(){}

    public Persona(String nombre, int edad, double altura) {
       this.nombre = nombre;
       setAltura(altura);
       setEdad(edad);
    }

    // Otros métodos

    public void presentarse() {
        IO.println("Hola soy " + nombre);
    }

    public void setEdad(int edad) { // Setter
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public int getEdad() {    // Getter
        return edad;
    }

    public void imprimirInformacion() {
        IO.println("El estado del objeto es:");
        IO.println("-nombre: " + nombre);
        IO.println("-edad: " + edad);
        IO.println("-altura: " + altura);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }
}


