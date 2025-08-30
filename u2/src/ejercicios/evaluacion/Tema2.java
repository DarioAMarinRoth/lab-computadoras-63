package ejercicios.evaluacion;

public class Tema2 {

    public static void main(String[] args) {
        System.out.println(personaConPelota(5,8));
    }


    public static int personaConPelota(int n, int t) {

        int p = 0;
        boolean subiendo = true;

        for (int i = 1; i <= t; i++) {
            if (subiendo) {
                p++;
                if (p == n) {
                    subiendo = false;
                }
            } else {
                p--;
                if (p == 1) {
                    subiendo = true;
                }
            }
        }
        return p;
    }
}
