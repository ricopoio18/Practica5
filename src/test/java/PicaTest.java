import practica6.palo.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PicaTest {

    @Test
    public void testPosicionInicial() {
        Pica pica = new Pica(20, 30);
        assertEquals(20, pica.getXPosition());
        assertEquals(30, pica.getYPosition());
    }

    @Test
    public void testMoverPica() {
        Pica pica = new Pica(0, 0);
        pica.moveTo(80, 90);

        assertEquals(80, pica.getXPosition());
        assertEquals(90, pica.getYPosition());
    }

    @Test
    public void testMakeVisibleNoLanzaError() {
        Pica pica = new Pica(10, 10);
        assertDoesNotThrow(() -> pica.makeVisible());
    }

    @Test
    public void testMakeInvisibleNoLanzaError() {
        Pica pica = new Pica(10, 10);
        assertDoesNotThrow(() -> pica.makeInvisible());
    }

    @Test
    public void testMoverVariasVeces() {
        Pica pica = new Pica(0, 0);

        pica.moveTo(15, 25);
        pica.moveTo(60, 75);

        assertEquals(60, pica.getXPosition());
        assertEquals(75, pica.getYPosition());
    }
}