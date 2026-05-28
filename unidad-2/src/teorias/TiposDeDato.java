
/*
* En la unidad 1:
*
* - Entero
* - Racional
* - Cadena
* - Lógico
*
* ------------------------------------------------------------
*
* En java:
*
* Tipos Enteros:
*
* - byte: 8 bits
* - short: 16 bits
* - int: 32 bits -> vamos a usar este para números enteros
* - long: 64 bits
*
* Tipos Racionales
*
* - float: 32 bits
* - double: 64 bits -> este vamos a usar nosotros
*
* Tipo lógico: boolean
*
* Tipo Cadena: String (para almacenar texto) (¡No es un tipo de dato!)
*
*
* Tipo caracter: char (sirve para almacenar caracteres ascii)
*
* */

void main() { // Shortcut: psvm + TAB

    // Declaración de variables:
    // <tipo> <identificador>;

    int cantidadDeSillasDelAula;    // Declaración de una variable entera
    String nombreEscuela;           // Declaración de una variable String
    double dineroEnCuentaBancaria;  // Declaración de una variable double

    cantidadDeSillasDelAula = 30;
    nombreEscuela = "EPET 14";
    dineroEnCuentaBancaria = 1.2;

    IO.println(cantidadDeSillasDelAula);
    IO.println(nombreEscuela);
    IO.println(dineroEnCuentaBancaria);

    IO.println();

    IO.println("En la escuela " + nombreEscuela + " hay " + cantidadDeSillasDelAula + " sillas");
}
