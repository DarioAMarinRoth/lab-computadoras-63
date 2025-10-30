package ejercicios;

public class Date {
    int dia;
    int mes;
    Year year;


    // Hipótesis:
    // date > this
    // Todos los meses tienen 30 días.
    // No hay años bisiestos.
    // Los años tiene 12 * 30 = 360 días.


    @Override
    public String toString() {
        return String.format("%2d/%2d/%4d", dia, mes, year.value);
    }

    public int diasHasta(Date date) {
        int totalDeDias = 0;
        totalDeDias = (date.year.value - this.year.value - 1) * 360;
        totalDeDias = (12 - this.mes + date.mes - 1) * 30;
        totalDeDias = 30 - this.dia + date.dia;
        return totalDeDias;
    }

    public Date(int dia, int mes, Year year) {
        this.dia = dia;
        this.mes = mes;
        this.year = year;
    }

    public static void main(String[] args) {
        Date miFecha = new Date(5, 5, new Year(2025));
        System.out.println(miFecha);
    }
}
