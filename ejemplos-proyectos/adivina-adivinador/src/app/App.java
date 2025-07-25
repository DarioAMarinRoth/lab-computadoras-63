package app;
import static validaciones.Validaciones.ingresarNumero;
import static utilidades.Utils.*;

public class App {
    public static void main(String[] args) {
        int numeroGanador;
        int intento = -1;
        int intentosGastados = 0;
        final int CANTIDAD_MAXIMA_DE_INTENTOS = 10;

        System.out.println("Jugador 1, ingrese un número: ");
        numeroGanador = ingresarNumero();

        System.out.println("Jugador 2, intente adivinar");
        while (intento != numeroGanador && intentosGastados < CANTIDAD_MAXIMA_DE_INTENTOS) {
            intento = ingresarNumero();
            intentosGastados++;
            int distancia = calcularDistancia(intento, intentosGastados);
            imprimirPista(distancia);   // TODO: evitar la impresión de una pista en el último intento.
        }

        if (intento == numeroGanador) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Perdiste");
        }
    }
}
