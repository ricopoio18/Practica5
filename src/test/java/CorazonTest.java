import practica6.palo.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CorazonTest {

    @Test
    public void testPosicionInicial() {
        Corazon corazon = new Corazon(50, 50);
        assertEquals(50, corazon.getXPosition());
        assertEquals(50, corazon.getYPosition());
    }

    @Test
    public void testMoverCorazon() {
        Corazon corazon = new Corazon(0, 0);
        corazon.moveTo(100, 80);

        assertEquals(100, corazon.getXPosition());
        assertEquals(80, corazon.getYPosition());
    }

    @Test
    public void testMakeVisibleNoLanzaError() {
        Corazon corazon = new Corazon(10, 10);
        assertDoesNotThrow(() -> corazon.makeVisible());
    }

    @Test
    public void testMakeInvisibleNoLanzaError() {
        Corazon corazon = new Corazon(10, 10);
        assertDoesNotThrow(() -> corazon.makeInvisible());
    }

    @Test
    public void testMoverVariasVeces() {
        Corazon corazon = new Corazon(0, 0);

        corazon.moveTo(20, 30);
        corazon.moveTo(40, 60);

        assertEquals(40, corazon.getXPosition());
        assertEquals(60, corazon.getYPosition());
    }
}