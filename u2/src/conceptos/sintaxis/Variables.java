package conceptos;

public class Variables {
    public static void main(String[] args) {
        // Para declarar una variable vamos a usar la siguiente sintaxis:
        // <tipo de dato> <identificador>;
        // Las variables se escriben en camelCase.

        int miEntero;               // Declaramos una variable entera.
        double miFlotante;          // Declaramos una variable flotante.
        boolean miBooleano;         // Declaramos una variable booleana.
        char miCaracter;            // Declaramos una variable del tipo caracter.

        String miTexto;             // Declaramos un objeto String.

        // Asignamos las variables.

        miEntero = 15;
        miFlotante = 1.5;
        miBooleano = false;
        miCaracter = '@';

        miTexto = "Hola mundo";

        // Se puede declarar y asignar en la misma instrucción:

        char otroChar = 71;

        System.out.println(otroChar);


    }
}
