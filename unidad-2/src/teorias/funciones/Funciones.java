// teorias.funciones.Funciones -> Métodos

// teorias.funciones.Funciones que ya usaron:
// - println()
// - parseInt()
// - parseDouble()
// - readln()

void main() {
    IO.println("Adentro del main");
//    IO.readln(); // Estamos llamando a la función readln()
    saludarADosPersonas("Fulano", "Mengano"); // Quiero saludar a fulano
    IO.println("Terminó el main");
}

// Declarar una función

// <tipo de retorno> <identificador>(){}

void saludarADosPersonas(String nombreUno, String nombreDos) {
    IO.println("Hola " + nombreUno + " y hola " + nombreDos);
}