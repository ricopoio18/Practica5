import practica6.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PosicionTest {

    @Test
    public void testConstructorPorDefecto() {
        Posicion pos = new Posicion();
        assertEquals(150, pos.getXPosition());
        assertEquals(150, pos.getYPosition());
    }

    @Test
    public void testConstructorConParametros() {
        Posicion pos = new Posicion(20, 30);
        assertEquals(20, pos.getXPosition());
        assertEquals(30, pos.getYPosition());
    }

    @Test
    public void testSetXPosition() {
        Posicion pos = new Posicion();
        pos.setXPosition(80);
        assertEquals(80, pos.getXPosition());
    }

    @Test
    public void testSetYPosition() {
        Posicion pos = new Posicion();
        pos.setYPosition(90);
        assertEquals(90, pos.getYPosition());
    }

    @Test
    public void testModificarAmbasCoordenadas() {
        Posicion pos = new Posicion(10, 10);
        pos.setXPosition(50);
        pos.setYPosition(60);

        assertEquals(50, pos.getXPosition());
        assertEquals(60, pos.getYPosition());
    }
}