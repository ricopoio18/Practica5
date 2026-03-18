import practica6.*;

import org.junit.jupiter.api.Test;
import Practica5.Carta;

import static org.junit.jupiter.api.Assertions.*;

public class VisualizadorTest {

    @Test
    public void testCrearVisualizadorNoLanzaError() {
        Carta carta = new Carta(5, Carta.Tipo.CORAZON);
        Posicion posicion = new Posicion(50, 50);

        assertDoesNotThrow(() -> new Visualizador(carta, posicion));
    }

    @Test
    public void testVisualizadorConTodosLosTipos() {
        Posicion pos = new Posicion(100, 100);

        assertDoesNotThrow(() -> new Visualizador(new Carta(3, Carta.Tipo.PICA), pos));
        assertDoesNotThrow(() -> new Visualizador(new Carta(7, Carta.Tipo.TREBOL), pos));
        assertDoesNotThrow(() -> new Visualizador(new Carta(10, Carta.Tipo.DIAMANTE), pos));
        assertDoesNotThrow(() -> new Visualizador(new Carta(1, Carta.Tipo.CORAZON), pos));
    }

    @Test
    public void testVisualizadorConValoresExtremos() {
        Posicion pos = new Posicion(0, 0);

        assertDoesNotThrow(() -> new Visualizador(new Carta(1, Carta.Tipo.PICA), pos));
        assertDoesNotThrow(() -> new Visualizador(new Carta(13, Carta.Tipo.CORAZON), pos));
    }

    @Test
    public void testVisualizadorConFiguras() {
        Posicion pos = new Posicion(30, 30);

        assertDoesNotThrow(() -> new Visualizador(new Carta(11, Carta.Tipo.PICA), pos)); // J
        assertDoesNotThrow(() -> new Visualizador(new Carta(12, Carta.Tipo.TREBOL), pos)); // Q
        assertDoesNotThrow(() -> new Visualizador(new Carta(13, Carta.Tipo.DIAMANTE), pos)); // K
    }
}
