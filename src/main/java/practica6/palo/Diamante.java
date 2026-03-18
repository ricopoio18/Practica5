package practica6.palo;

import Figuras.Square;
import Figuras.Triangle;

/**
 * La clase Diamante representa la figura de un diamante (♦)
 * utilizando triángulos y un cuadrado.
 *
 * Permite crear el diamante en una posición específica,
 * moverlo y controlar su visibilidad.
 */
public class Diamante {
    private Triangle triangulo1;
    private Triangle triangulo2;
    private Triangle triangulo3;
    private Square cuadrado;

    int xPosition;
    int yPosition;

    /**
     * Constructor de la clase Diamante.
     * Inicializa las figuras que componen el diamante,
     * asigna colores y tamaños, y lo posiciona en las
     * coordenadas dadas.
     *
     * @param x Coordenada inicial en el eje X
     * @param y Coordenada inicial en el eje Y
     */
    public Diamante(int x, int y){

        triangulo1 = new Triangle();
        triangulo1.changeColor("red");
        triangulo1.changeSize(14,18);

        triangulo2 = new Triangle();
        triangulo2.changeColor("white");
        triangulo2.changeSize(14,18);

        triangulo3 = new Triangle();
        triangulo3.changeColor("white");
        triangulo3.changeSize(14,18);

        cuadrado = new Square();
        cuadrado.changeColor("red");
        cuadrado.changeSize(18);

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
     * Mueve el diamante completo a una nueva posición.
     * Reubica todas las figuras manteniendo su forma.
     *
     * @param x Nueva coordenada en X
     * @param y Nueva coordenada en Y
     */
    public void moveTo(int x, int y) {
        xPosition = x;
        yPosition = y;

        triangulo1.moveTo(xPosition, yPosition);
        cuadrado.moveTo(xPosition - 9, yPosition + 14);
        triangulo2.moveTo(xPosition - 9, yPosition + 18);
        triangulo3.moveTo(xPosition + 9, yPosition + 18);
    }

    /**
     * Hace visible el diamante en pantalla.
     */
    public void makeVisible(){
        triangulo1.makeVisible();
        cuadrado.makeVisible();
        triangulo2.makeVisible();
        triangulo3.makeVisible();
    }

    /**
     * Hace invisible el diamante en pantalla.
     */
    public void makeInvisible(){
        triangulo1.makeInvisible();
        triangulo2.makeInvisible();
        triangulo3.makeInvisible();
        cuadrado.makeInvisible();
    }
}