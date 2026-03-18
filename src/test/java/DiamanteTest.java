import practica6.palo.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiamanteTest {

    @Test
    public void testPosicionInicial() {
        Diamante diamante = new Diamante(30, 40);
        assertEquals(30, diamante.getXPosition());
        assertEquals(40, diamante.getYPosition());
    }

    @Test
    public void testMoverDiamante() {
        Diamante diamante = new Diamante(0, 0);
        diamante.moveTo(100, 120);

        assertEquals(100, diamante.getXPosition());
        assertEquals(120, diamante.getYPosition());
    }

    @Test
    public void testMakeVisibleNoLanzaError() {
        Diamante diamante = new Diamante(10, 10);
        assertDoesNotThrow(() -> diamante.makeVisible());
    }

    @Test
    public void testMakeInvisibleNoLanzaError() {
        Diamante diamante = new Diamante(10, 10);
        assertDoesNotThrow(() -> diamante.makeInvisible());
    }

    @Test
    public void testMoverVariasVeces() {
        Diamante diamante = new Diamante(0, 0);

        diamante.moveTo(20, 30);
        diamante.moveTo(50, 70);

        assertEquals(50, diamante.getXPosition());
        assertEquals(70, diamante.getYPosition());
    }
}