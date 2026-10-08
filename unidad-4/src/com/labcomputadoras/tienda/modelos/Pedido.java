package com.labcomputadoras.tienda.modelos;

public class Pedido {
    private String cliente;
    private int cantidadDeProductos;

    private Producto[] productos;
    private int cantidadActualDeProductos; // Lleva la cuenta actual de productos ingresados


    public Pedido(String cliente, int cantidadDeProductos) {
        this.cliente = cliente;

        if (cantidadDeProductos > 0) {
            this.cantidadDeProductos = cantidadDeProductos;
        } else {
            this.cantidadDeProductos = 1;
        }

        productos = new Producto[cantidadDeProductos];
    }

    public void agregarProducto(Producto producto) {
        if (cantidadActualDeProductos < cantidadDeProductos) {
            productos[cantidadActualDeProductos] = producto;
            cantidadActualDeProductos++;
        }
    }

    public void agregarProducto(String nombreProducto, double precioProducto) {
        Producto auxiliar = new Producto(nombreProducto, precioProducto);
        agregarProducto(auxiliar);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }


}
