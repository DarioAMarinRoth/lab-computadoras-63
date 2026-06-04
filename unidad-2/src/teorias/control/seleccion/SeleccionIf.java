// Estructuras de control

// Secuencia, selección, iteración

import com.sun.security.jgss.GSSUtil;

void main() {
    boolean exp = false;

    // Selección simple

    if (exp) {
        IO.println("Estoy adentro del if");
        IO.println("Sigo en el if");
    }

    // Selección doble

    if (exp){
        IO.println("Estoy adentro del if");
        IO.println("Sigo en el if");
    } else {
        IO.println("El if resultó falso");
    }
//
//    IO.println("Estoy afuera del if");

    // Multiples ifs

    int unNumero = 2;

    if (unNumero < 3) {
        IO.println("El numero es menor que tres");
    } else if (unNumero < 5) {
        IO.println("El número es menor que 5");
    } else {
        IO.println("El número es mayor o igual a 5");
    }

}