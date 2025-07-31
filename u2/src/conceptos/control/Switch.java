package conceptos.control;



public class Switch {

    public static void main(String[] args) {
        int dia = 7;
        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Dia hábil");
                break;
            case 6:
            case 7:
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("El número no se corresponde con ningún día de la semana");
        }
    }

    public static String diaDeLaSemana(int dia) {
        switch (dia) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miercoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                System.out.println("El número no se corresponde con ningún día de la semana");
                return "Out of range";
        }
    }

}
