import Practica5.Carta;
import Practica5.Jugador;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class JugadorTest {

    @Test
    public void testCrearJugador(){
        ArrayList<Carta> mano = new ArrayList<>();
        Jugador jugador = new Jugador("Ana", mano);

        assertEquals("Ana", jugador.nombre);
    }

    @Test
    public void testRecibirCartas(){
        ArrayList<Carta> mano = new ArrayList<>();
        Jugador jugador = new Jugador("Luis", mano);

        Carta carta = new Carta(10, Carta.Tipo.PICA);
        jugador.recibirCartas(carta);

        assertEquals(1, mano.size());
    }

    @Test
    public void testDeshacerseDeCartas(){
        ArrayList<Carta> mano = new ArrayList<>();
        mano.add(new Carta(5, Carta.Tipo.CORAZON));
        mano.add(new Carta(8, Carta.Tipo.PICA));

        Jugador jugador = new Jugador("Carlos", mano);

        Carta carta = jugador.deshacerseDeCartas(1);

        assertNotNull(carta);
        assertEquals(1, mano.size());
    }

    @Test
    public void testDeshacerseDeCartaInvalida(){
        ArrayList<Carta> mano = new ArrayList<>();
        mano.add(new Carta(7, Carta.Tipo.DIAMANTE));

        Jugador jugador = new Jugador("Mario", mano);

        Carta carta = jugador.deshacerseDeCartas(5);

        assertNull(carta);
        assertEquals(1, mano.size());
    }
    @Test
    public void testToStringJugador(){
        ArrayList<Carta> mano = new ArrayList<>();
        mano.add(new Carta(1, Carta.Tipo.PICA));

        Jugador jugador = new Jugador("Ana", mano);

        String resultado = jugador.toString();

        assertTrue(resultado.contains("Ana"));
        assertTrue(resultado.contains("Mano"));
    }

}
