
void main() {
    int resultado = 1 + 2;
    resultado = sumar(1, 2);
    IO.println(resultado);
}

// Void: no genera ningún valor.
// Otro tipo (int, boolean, double, String, etc..): genera un valor de ese tipo.
int sumar(int num1, int num2) {
    int resultado = num1 + num2;
    return resultado;
}