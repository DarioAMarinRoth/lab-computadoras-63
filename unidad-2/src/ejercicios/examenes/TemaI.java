void main() {
    IO.println(cantidadDeBilletes(99));;
}

// Declaración de una función

// <Tipo de retorno> <identificador>(<param1>, <param2>, ...) {...}

int cantidadDeBilletes(int monto) {
    // Billetes de 100, de 20 y de 1
    int cantidadDeBilletes = monto / 100;
    monto %= 100;
    cantidadDeBilletes += monto / 20;
    monto %= 20;
    return cantidadDeBilletes + monto;
}