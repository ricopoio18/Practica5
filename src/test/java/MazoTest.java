import Practica5.Carta;
import Practica5.Mazo;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MazoTest {

    @Test
    public void testMazoInicialTiene52Cartas(){
        Mazo mazo = new Mazo();
        assertEquals(52, mazo.tamañoMazo());
    }

    @Test
    public void testTomarCartaReduceElMazo(){
        Mazo mazo = new Mazo();
        Carta carta = mazo.tomarCarta();
        assertNotNull(carta);
        assertEquals(51, mazo.tamañoMazo());
    }

    @Test
    public void testRepartirCartas(){
        Mazo mazo = new Mazo();
        ArrayList<Carta> mano = mazo.repartirCartas(5);
        assertEquals(5, mano.size());
        assertEquals(47, mazo.tamañoMazo());
    }

    @Test
    public void testRepartirMasCartasDeLasQueHay(){
        Mazo mazo = new Mazo();
        ArrayList<Carta> mano = mazo.repartirCartas(60);
        assertEquals(52, mano.size());
        assertEquals(0, mazo.tamañoMazo());
    }

    @Test
    public void testMostrarMazoNoEliminaCartas(){
        Mazo mazo = new Mazo();
        ArrayList<Carta> cartas = mazo.mostrarMazo(5);
        assertEquals(5, cartas.size());
        assertEquals(52, mazo.tamañoMazo());
    }

    @Test
    public void testAgregarCarta(){
        Mazo mazo = new Mazo();
        mazo.tomarCarta();
        mazo.agregarCarta(new Carta(1, Carta.Tipo.PICA));
        assertEquals(52, mazo.tamañoMazo());
    }

    @Test
    public void testRestablecerMazo(){
        Mazo mazo = new Mazo();
        mazo.tomarCarta();
        mazo.tomarCarta();
        mazo.restablecerMazo();
        assertEquals(52, mazo.tamañoMazo());
    }

    @Test
    public void testBarajarNoCambiaElTamano(){
        Mazo mazo = new Mazo();
        mazo.barajar();
        assertEquals(52, mazo.tamañoMazo());
    }
}