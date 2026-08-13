package funciones;

public class Funciones {
    public static int leerEntero() {
        return Integer.parseInt(IO.readln());
    }

    public static int leerEntero(String prompt) {
        return Integer.parseInt(IO.readln(prompt));
    }
}
