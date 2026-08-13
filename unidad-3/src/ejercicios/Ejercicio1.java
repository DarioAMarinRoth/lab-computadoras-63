void main() {
    String[] nombreYApellido = {"Fulano", "De Tal"};
    IO.println(nombreYApellido[0]);
    IO.println(nombreYApellido[1]);

    // Otra forma
    IO.println(); // Salto de línea para separar
    String[] apellidoYNombre = new String[2];
    apellidoYNombre[0] = "De Tal";
    apellidoYNombre[1] = "Fulano";

    IO.println(apellidoYNombre[0]);
    IO.println(apellidoYNombre[1]);
}