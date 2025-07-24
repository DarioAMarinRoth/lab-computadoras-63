package pruebas;

public class Pistas {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 100;
        int distancia;
        // Calcular la distancia

        if (num1 > num2) {
            distancia = num1 - num2;
        } else {
            distancia = num2 - num1;
        }

        // Imprimir la pista

        int muyCerca = 5;
        int cerca = 10;
        int medianamenteCerca = 20;

        if (distancia < muyCerca) {
            System.out.println("Te estás quemando");
        } else if (distancia < cerca) {
            System.out.println("Caliente");
        } else if (distancia < medianamenteCerca) {
            System.out.println("Tibio");
        } else {
            System.out.println("Frio");
        }

    }
}
