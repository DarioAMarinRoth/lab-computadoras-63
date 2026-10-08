package com.labcomputadoras.tienda.modelos;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        setPrecio(precio);
    }

    public void mostrarInformacion() {
        IO.println("Producto: " + nombre);
        IO.println("Precio: $" + precio);
    }

    // Entre el 0 y el 100%
    public void aplicarDescuento(double descuentoPorcentual) {
        double fraccion = (100 - descuentoPorcentual) / 100;
        precio *= fraccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }
    }
}
