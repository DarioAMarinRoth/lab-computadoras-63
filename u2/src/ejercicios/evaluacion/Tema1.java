package ejercicios.evaluacion;

public class Tema1 {

    public static void main(String[] args) {
        System.out.printf("Horas: %d", sumaHoras(2359,2));
    }


    public static int sumaHoras(int horario1, int horario2) {

        int horas1 = horario1 / 100;
        int minutos1 = horario1 % 100;
        int horas2 = horario2 / 100;
        int minutos2 = horario2 % 100;

        int sumaMinutos = minutos1 + minutos2;
        if (sumaMinutos >= 60) {
            horas1++;
            sumaMinutos -= 60;
        }

        int sumaHoras = horas1 + horas2;
        if (sumaHoras >= 24) {
            sumaHoras -= 24;
        }

        return sumaHoras * 100 + sumaMinutos;

    }

}
