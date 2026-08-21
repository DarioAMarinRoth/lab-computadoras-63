import static funciones.Funciones.*;

void main() {

    int[] numeritos = new int[7];

    int indice = 0;
    while (indice < numeritos.length) {
        numeritos[indice] = leerEntero();
        indice++;
    }


    IO.println("El vector ingresado es: ");
    int otroIndice = 0;
    while (otroIndice < numeritos.length) {
        IO.println(numeritos[otroIndice]);
        otroIndice++;
    }

    // Cambiamos el while por un for:

    for (int i = 0; i < numeritos.length; i++) {
        numeritos[i] = leerEntero();
    }


    for (int numerito : numeritos) {
        IO.println(numerito);
    }






    for (int i = 0; i < numeritos.length; i++) {
        int elemento = numeritos[i];
    }



    for (int elemento : numeritos) { // for each
        IO.println(elemento);
        elemento = 0;
    }





}