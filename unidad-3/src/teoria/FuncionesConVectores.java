void main() {
    int[] unVector = {1, 3, 6};
    int[] otroVector = {1, 1, 1, 1};
    int[] masVectores = {10, 100, 1000, 10000};

    // Código
    imprimirVector(unVector);


    // Más código
    imprimirVector(otroVector);

    // Mucho más código
    imprimirVector(masVectores);
}

// Imprime un vector de enteros
void imprimirVector(int[] vector) {
    for (int elemento : vector) {
        IO.print(elemento + " ");
    }
    IO.println();
}