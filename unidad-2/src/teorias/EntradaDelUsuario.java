

void main() {
    String miVariable = IO.readln("Ingrese una oración: ");
    IO.println("La oración ingresada fue: " + miVariable);

    String miNumeroEnTexto = IO.readln("Ingrese un número");
    // Tengo para PARSEAR el texto en un numero entero.

    int miNumero = Integer.parseInt(miNumeroEnTexto); // Esta función parsea de texto (String) a entero (int)
    IO.println("El número ingresado fue: " + miNumero);
    int numeroSiguiente = miNumero + 1;
    IO.println("Y el número que le sigue es " + numeroSiguiente);

    // Para parsear a otros tipos de dato:
    // double: Double.parseDouble(...);
    // boolean: Boolean.parseBoolean(...);
}