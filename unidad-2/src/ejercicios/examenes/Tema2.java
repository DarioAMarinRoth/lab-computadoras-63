void main() {
    IO.println(quienTieneLaPelota(5, 24));
    IO.println(quienTieneLaPelotaV2(5, 24));
}

int quienTieneLaPelota(int n, int t) {
    boolean contandoAdelante = true;
    int personaConPelota = 1;
    for (int i = 2; i <= t; i++) {
        if (contandoAdelante) {
            personaConPelota++;
            if (personaConPelota == n) {
                contandoAdelante = false;
            }
        } else {
            personaConPelota--;
            if (personaConPelota == 1) {
                contandoAdelante = true;
            }
        }
    }
    return personaConPelota;
}

int quienTieneLaPelotaV2(int n, int t) {
    int periodo = (n - 1) * 2;
    t = t % periodo == 0 ? periodo : t % periodo;
    return t <= n ? n : 2 * n - t;
}