package utiles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static utiles.Funciones.abs;
import static utiles.Funciones.sonIguales;

class FuncionesTest {

    @Test
    public void absTest() {
        assertEquals(1, abs(1));
        assertEquals(1, abs(-1));
        assertEquals(0, abs(0));
    }

    @Test
    public void sonIgualesTest() {
        assertTrue(sonIguales(1.0, 1.01, 0.02));
        assertTrue(sonIguales(1.01, 1.00, 0.02));
        assertFalse(sonIguales(1.00, 1.02, 0.01));
        assertFalse(sonIguales(1.02, 1.00, 0.01));
    }

}