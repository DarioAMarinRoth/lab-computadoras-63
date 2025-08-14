package ejercicios.propuestos;

/*
Desarrollar una función que reciba como argumento una cadena y un caracter y determine cuantas veces aparece ese caracter.
 */

public class ContarCaracteres {

    public static void main(String[] args) {
        System.out.println(contarCaracteres("Palabra", 'a'));
    }

    public static int contarCaracteres(String palabra, char caracter) {
        if (palabra.length() > 1) {
            return contarCaracteres(Character.toString(palabra.charAt(0)), caracter) + contarCaracteres(palabra.substring(1), caracter);
        } else {
            if (palabra.charAt(0) == caracter) {
                return 1;
            } else {
                return 0;
            }
        }
    }


}
