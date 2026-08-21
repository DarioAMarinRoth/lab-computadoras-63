package funciones;

public class Funciones {
    public static int leerEntero() {
        return Integer.parseInt(IO.readln());
    }

    public static int leerEntero(String prompt) {
        return Integer.parseInt(IO.readln(prompt));
    }

    public static void imprimirVector(int[] vector) {
        for (int elemento : vector) {
            IO.println(elemento);
        }
        IO.println();
    }
}
