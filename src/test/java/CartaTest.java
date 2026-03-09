import Practica5.Carta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartaTest {

    @Test
    public void testConstructorPorDefecto(){
        Carta carta = new Carta();
        assertEquals(10, carta.getValor());
        assertEquals(Carta.Tipo.TREBOL, carta.getTipo());
    }

    @Test
    public void testConstructorConParametros(){
        Carta carta = new Carta(13, Carta.Tipo.PICA);
        assertEquals(13, carta.getValor());
        assertEquals(Carta.Tipo.PICA, carta.getTipo());
    }

    @Test
    public void testSetTipo(){
        Carta carta = new Carta(5, Carta.Tipo.CORAZON);
        carta.setTipo(Carta.Tipo.DIAMANTE);
        assertEquals(Carta.Tipo.DIAMANTE, carta.getTipo());
    }

    @Test
    public void testToStringCartaNumerica(){
        Carta carta = new Carta(7, Carta.Tipo.CORAZON);
        String resultado = carta.toString();
        assertTrue(resultado.contains("7"));
    }

    @Test
    public void testToStringCartaEspecial(){
        Carta carta = new Carta(13, Carta.Tipo.PICA);
        String resultado = carta.toString();
        assertTrue(resultado.contains("K"));
    }

}