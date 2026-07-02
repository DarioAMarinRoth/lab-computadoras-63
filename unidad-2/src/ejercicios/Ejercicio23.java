void main() {
    int num = 1;
    double a = 0.2;
    if (esPrimo(num)) {
        IO.println("cierta lógica");
    } else {
        IO.println("otra lógica");
    }
}

boolean sonIguales(double num1, double num2, double tolerancia) {
    double diferencia = valorAbsoluto(num2 - num1);
    boolean resultado = diferencia <= tolerancia;
    return resultado;
}

double valorAbsoluto(double num) {
    double resultado = num; // Asumiendo que es positivo
    if (resultado < 0) {
        resultado = resultado * -1;
    }
    return resultado;
}

boolean esPrimo(int val) {
    return false;
}