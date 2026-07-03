void main() {

    // 1. Toy story 5
    // 2. Backrooms
    // 3. Obsession
    // 4. The mandalorian
    // 5. Eternal return
    int codigo = Integer.parseInt(IO.readln("Ingrese la opción que le guste: "));

//    if (codigo == 1) {
//        IO.println("La pelicula es toy story");
//    } else if (codigo == 2) {
//        IO.println("La pelicula es backrooms");
//    } else if (codigo == 3) {
//        IO.println("La pelicula es obsession");
//    } else if (codigo == 4) {
//        IO.println("La pelicula es the mandalorian");
//    } else if (codigo == 5) {
//        IO.println("La pelicula es eternal return");
//    }

    switch (codigo) { // Admite enteros, char, String
        case 1:
            IO.println("La pelicula es toy story");
            break;
        case 2:
            IO.println("La pelicula es backrooms");
            break;
        case 3:
            IO.println("La pelicula es obsession");
            break;
        case 4:
            IO.println("La pelicula es the mandalorian");
            break;
        case 5:
            IO.println("La pelicula es eternal return");
            break;
        default:
            IO.println("No está esa película en cartelera");
    }


}