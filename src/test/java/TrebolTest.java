import practica6.palo.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrebolTest {

    @Test
    public void testPosicionInicial() {
        Trebol trebol = new Trebol(25, 35);
        assertEquals(25, trebol.getXPosition());
        assertEquals(35, trebol.getYPosition());
    }

    @Test
    public void testMoverTrebol() {
        Trebol trebol = new Trebol(0, 0);
        trebol.moveTo(90, 110);

        assertEquals(90, trebol.getXPosition());
        assertEquals(110, trebol.getYPosition());
    }

    @Test
    public void testMakeVisibleNoLanzaError() {
        Trebol trebol = new Trebol(10, 10);
        assertDoesNotThrow(() -> trebol.makeVisible());
    }

    @Test
    public void testMakeInvisibleNoLanzaError() {
        Trebol trebol = new Trebol(10, 10);
        assertDoesNotThrow(() -> trebol.makeInvisible());
    }

    @Test
    public void testMoverVariasVeces() {
        Trebol trebol = new Trebol(0, 0);

        trebol.moveTo(30, 40);
        trebol.moveTo(70, 85);

        assertEquals(70, trebol.getXPosition());
        assertEquals(85, trebol.getYPosition());
    }
}