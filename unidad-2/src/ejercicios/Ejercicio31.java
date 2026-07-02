import static funciones.Funciones.sonIguales;

void main() {

    IO.println(raizCuadrada(12));
}

// <tipo de retorno> <identificador>(<parametros>){}

// x es el valor al cual le quiero calcular la raíz.
double raizCuadrada(double x) {

    // Como vamos a usar el método del rectángulo x también
    // es el área del cuadrado/rectángulo.

    double base = x;
    double altura = 1;
    int i = 0;
    while (!(sonIguales(base, altura, 0.001))) {
        base = (base + altura) / 2;
        altura = x / base;
    }
    return base;
}
