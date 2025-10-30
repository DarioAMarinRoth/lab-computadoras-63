package modelos;

import enums.Color;

public class Persona {
    private String nombre;
    private int edad;
    public Color colorDeOjos;

    public Persona(){}

    public Persona(String nombre, int edad, Color colorDeOjos) {
        this.nombre = nombre;
        this.edad = edad;
        this.colorDeOjos = colorDeOjos;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            RuntimeException error = new IllegalArgumentException();
            throw error;
        }
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", colorDeOjos='" + colorDeOjos + '\'' +
                '}';
    }
}
