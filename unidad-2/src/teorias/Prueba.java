void main() {
    if (sonIguales(4, 4, 100)) {
        IO.println("Son iguales"); // 2.01 1.997
    }
}


boolean sonIguales(int valor1, int valor2, int tolerancia) {
    boolean resultado =  valor1 == valor2; // Resulta en un boolean
    return resultado;
}