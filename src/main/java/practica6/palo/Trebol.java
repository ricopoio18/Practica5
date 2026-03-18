package practica6.palo;
import Figuras.*;

/**
 * La clase Trebol representa la figura de un trébol (♣)
 * utilizando tres círculos y un triángulo.
 *
 * Permite crear el trébol en una posición específica,
 * moverlo y controlar su visibilidad.
 */
public class Trebol {
    private Circle circulo1;
    private Circle circulo2;
    private Circle circulo3;
    private Triangle triangulo;

    private int xPosition;
    private int yPosition;

    /**
     * Constructor de la clase Trebol.
     * Inicializa las figuras que lo componen,
     * asigna color y tamaño, y lo posiciona
     * en las coordenadas indicadas.
     *
     * @param x Coordenada inicial en el eje X
     * @param y Coordenada inicial en el eje Y
     */
    public Trebol(int x, int y) {

        circulo1 = new Circle();
        circulo1.changeColor("black");
        circulo1.changeSize(10);

        circulo2 = new Circle();
        circulo2.changeColor("black");
        circulo2.changeSize(10);

        circulo3 = new Circle();
        circulo3.changeColor("black");
        circulo3.changeSize(10);

        triangulo = new Triangle();
        triangulo.changeColor("black");
        triangulo.changeSize(8,8);

        moveTo(x, y);
        makeVisible();
    }

    /**
     * Obtiene la posición actual en el eje Y.
     *
     * @return posición en Y
     */
    public int getYPosition(){
        return yPosition;
    }

    /**
     * Obtiene la posición actual en el eje X.
     *
     * @return posición en X
     */
    public int getXPosition(){
        return xPosition;
    }

    /**
     * Mueve el trébol a una nueva posición.
     * Reubica todas las figuras manteniendo su forma.
     *
     * @param x Nueva coordenada en X
     * @param y Nueva coordenada en Y
     */
    public void moveTo(int x, int y) {
        xPosition = x;
        yPosition = y;

        circulo1.moveTo(xPosition, yPosition);
        circulo2.moveTo(xPosition + 8, yPosition);
        circulo3.moveTo(xPosition + 4, yPosition - 7);
        triangulo.moveTo(xPosition + 9, yPosition + 6);
    }

    /**
     * Hace visible el trébol en pantalla.
     */
    public void makeVisible(){
        circulo1.makeVisible();
        circulo2.makeVisible();
        circulo3.makeVisible();
        triangulo.makeVisible();
    }

    /**
     * Hace invisible el trébol en pantalla.
     */
    public void makeInvisible(){
        circulo1.makeInvisible();
        circulo2.makeInvisible();
        circulo3.makeInvisible();
        triangulo.makeInvisible();
    }
}
