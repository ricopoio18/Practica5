package practica6.palo;
import Figuras.*;

/**
 * La clase Corazon representa la figura de un corazón utilizando
 * diferentes figuras geométricas (círculos, un cuadrado y triángulos).
 *
 * Permite crear el corazón en una posición específica, moverlo
 * y controlar su visibilidad.
 */
public class Corazon {
    private Circle circulo1;
    private Circle circulo2;
    private Square cuadrado;
    private Triangle triangulo1;
    private Triangle triangulo2;

    int xPosition;
    int yPosition;

    /**
     * Constructor de la clase Corazon.
     * Inicializa las figuras que componen el corazón, les asigna color
     * y tamaño, y lo posiciona en las coordenadas dadas.
     *
     * @param x Coordenada inicial en el eje X
     * @param y Coordenada inicial en el eje Y
     */
    public Corazon(int x, int y){
        circulo1 = new Circle();
        circulo1.changeColor("red");
        circulo1.changeSize(10);

        circulo2 = new Circle();
        circulo2.changeColor("red");
        circulo2.changeSize(10);

        cuadrado = new Square();
        cuadrado.changeColor("red");
        cuadrado.changeSize(12);

        triangulo1 = new Triangle();
        triangulo1.changeColor("white");
        triangulo1.changeSize(10,14);

        triangulo2 = new Triangle();
        triangulo2.changeColor("white");
        triangulo2.changeSize(10,14);

        moveTo(x, y);
        makeVisible();
    }

    /**
     * Obtiene la posición actual en el eje Y del corazón.
     *
     * @return posición en Y
     */
    public int getYPosition(){
        return yPosition;
    }

    /**
     * Obtiene la posición actual en el eje X del corazón.
     *
     * @return posición en X
     */
    public int getXPosition(){
        return xPosition;
    }

    /**
     * Mueve el corazón completo a una nueva posición.
     * Todas las figuras que lo componen se reposicionan
     * manteniendo su forma.
     *
     * @param x Nueva coordenada en X
     * @param y Nueva coordenada en Y
     */
    public void moveTo(int x, int y) {
        xPosition = x;
        yPosition = y;

        circulo1.moveTo(xPosition, yPosition);
        circulo2.moveTo(xPosition + 9, yPosition);
        cuadrado.moveTo(xPosition + 4, yPosition +8);
        triangulo1.moveTo(xPosition + 4, yPosition + 11);
        triangulo2.moveTo(xPosition + 15, yPosition + 11);
    }

    /**
     * Hace visible el corazón en pantalla.
     * Todas las figuras que lo componen se muestran.
     */
    public void makeVisible(){
        circulo1.makeVisible();
        circulo2.makeVisible();
        cuadrado.makeVisible();
        triangulo1.makeVisible();
        triangulo2.makeVisible();
    }

    /**
     * Hace invisible el corazón en pantalla.
     * Todas las figuras que lo componen se ocultan.
     */
    public void makeInvisible(){
        circulo1.makeInvisible();
        circulo2.makeInvisible();
        cuadrado.makeInvisible();
        triangulo1.makeInvisible();
        triangulo2.makeInvisible();
    }
}