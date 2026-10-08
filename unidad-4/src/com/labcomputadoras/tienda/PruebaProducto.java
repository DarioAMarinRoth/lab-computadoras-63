package com.labcomputadoras.tienda;

import com.labcomputadoras.tienda.modelos.Pedido;
import com.labcomputadoras.tienda.modelos.Producto;

public class PruebaProducto {
    static void main() {

        Pedido miPedido = new Pedido("El profe", 2); // Creando un pedido que va a tener dos productos.

        miPedido.agregarProducto("Pitusas", 1000);

        IO.println(miPedido.calcularTotal());
    }
}
