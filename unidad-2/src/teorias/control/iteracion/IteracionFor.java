


void main() {

    for(int i = 0; i < 10; i++){
        if (i == 7) {
//            break; Interrumpe el loop
            continue; // Saltea las instrucciones siguientes y vuelve a evaluar la condición del loop
        }
        IO.println("Una instrucción e i vale " + i);
        IO.println("Mas instrucciones");
        IO.println("Una tercera instrucción");
        IO.println();
    }

    IO.println("El for terminó");



}