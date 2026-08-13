void main() {
    int[] miVector; // Una variable capaz de almacenar (?)
    boolean[] otroVectorPeroDeBooleans;

    int[] ejemplo = {1, 3, 0, 8, 2, 0, 2, 6};

    IO.println("En la coordenada 1 hay guardado un: " + ejemplo[1]);
    ejemplo[1] = 4; // Cambiamos el valor del elemento 1.
    IO.println("En la coordenada 1 ahora hay  un: " + ejemplo[1]);

    int[] vectorcito = new int[5]; // Creamos un vector de 5 elementos.

    vectorcito[0] = 6; // Guardamos un valor en el elemento 1.
    vectorcito[1] = 43; // Guardamos un valor en el elemento 2.
    vectorcito[2] = -5; // Guardamos un valor en el elemento 3.
    vectorcito[3] = 2; // Guardamos un valor en el elemento 1.
    vectorcito[4] = 2;

    IO.println("El vector que acabo de crear es:");
    IO.println(vectorcito[0]);
    IO.println(vectorcito[1]);
    IO.println(vectorcito[2]);
    IO.println(vectorcito[3]);
    IO.println(vectorcito[4]);



    // Ejercicio: Crear un vector de Strings de dos elementos. En la posición 0
    // almacene su nombre y en la posición 1 almacene su apellido.
    // Imprima los valores del vector.

}