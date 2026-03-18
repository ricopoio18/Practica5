package practica6.palo;

import Figuras.Circle;
import Figuras.Triangle;

/**
 * La clase Pica representa la figura de una pica (♠)
 * utilizando círculos y triángulos.
 *
 * Permite crear la figura en una posición específica,
 * moverla y controlar su visibilidad.
 */
public class Pica {

    private Circle circulo1;
    private Circle circulo2;
    private Triangle triangulo1;
    private Triangle triangulo2;

    int xPosition;
    int yPosition;

    /**
     * Constructor de la clase Pica.
     * Inicializa las figuras que componen la pica,
     * asigna colores y tamaños, y la posiciona en
     * las coordenadas dadas.
     *
     * @param x Coordenada inicial en el eje X
     * @param y Coordenada inicial en el eje Y
     */
    public Pica(int x, int y){

        circulo1 = new Circle();
        circulo1.changeColor("black");
        circulo1.changeSize(10);

        circulo2 = new Circle();
        circulo2.changeColor("black");
        circulo2.changeSize(10);

        triangulo1 = new Triangle();
        triangulo1.changeColor("black");
        triangulo1.changeSize(10,14);

        triangulo2 = new Triangle();
        triangulo2.changeColor("black");
        triangulo2.changeSize(15,8);

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
     * Mueve la pica a una nueva posición.
     * Reubica todas las figuras manteniendo su forma.
     *
     * @param x Nueva coordenada en X
     * @param y Nueva coordenada en Y
     */
    public void moveTo(int x, int y) {
        xPosition = x;
        yPosition = y;

        circulo1.moveTo(xPosition, yPosition);
        circulo2.moveTo(xPosition + 6, yPosition);
        triangulo1.moveTo(xPosition + 8, yPosition - 8);
        triangulo2.moveTo(xPosition + 8, yPosition);
    }

    /**
     * Hace visible la pica en pantalla.
     */
    public void makeVisible(){
        circulo1.makeVisible();
        circulo2.makeVisible();
        triangulo1.makeVisible();
        triangulo2.makeVisible();
    }

    /**
     * Hace invisible la pica en pantalla.
     */
    public void makeInvisible(){
        circulo1.makeInvisible();
        circulo2.makeInvisible();
        triangulo1.makeInvisible();
        triangulo2.makeInvisible();
    }
}