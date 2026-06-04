

// Sumar 7 numeros ingresados

void main() {

    // UnaVariable += unValor => unaVariable = unaVariable + unValor
    // UnaVariable -= unValor => unaVariable = unaVariable - unValor
    // UnaVariable *= unValor => unaVariable = unaVariable * unValor
    // UnaVariable /= unValor => unaVariable = unaVariable / unValor
    // UnaVariable %= unValor => unaVariable = unaVariable % unValor

    int numeroIngresado;
    int acumulador = 0;
    int contador = 0;
    final int CANTIDAD_DE_NUMEROS_ESPERADOS = 10; // Las constantes se escriben en UPPER_SNAKE_CASE


    while (contador < CANTIDAD_DE_NUMEROS_ESPERADOS) {
        numeroIngresado = Integer.parseInt(IO.readln("Ingrese un entero: ")); // leemos un entero
        acumulador += numeroIngresado; // Acumulamos el número ingresado
        contador++; // Incrementamos el contador
    }
    IO.println("El resultado de la suma es " + acumulador);

}