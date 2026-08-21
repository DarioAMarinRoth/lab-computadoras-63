void main() {


    int[] cambio = cantidadBilletes(1000);


    IO.println(Arrays.toString(cambio));


//    IO.println(cambio[0]); // Espero ver 3
//    IO.println(cambio[1]); // Espero ver 1
//    IO.println(cambio[2]); // Espero ver 6
}

int[] cantidadBilletes(int monto) {

    int[] billetes = new int[3];

    billetes[0] = monto / 100;
    monto %= 100;
    billetes[1] = monto / 20;
    monto %= 20;
    billetes[2] = monto;

    return billetes;
}


// Escriba un programa donde se declare un vector de 8 elementos y permita que el usuario cargue
// en cada elemento un dígito de su dni. Imprima el vector completo.

// Ejercicio: escriba una función que reciba como argumento un vector y que lo imprima;
