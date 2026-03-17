package practica6.palo;

import Figuras.Square;
import Figuras.Triangle;

public class Diamante {
    private Triangle triangulo1;
    private Triangle triangulo2;
    private Triangle triangulo3;
    private Square cuadrado;
    int xPosition;
    int yPosition;

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

    public int getYPosition(){
        return yPosition;
    }
    public int getXPosition(){
        return xPosition;
    }

    public void moveTo(int x, int y) {
        xPosition = x;
        yPosition = y;

        triangulo1.moveTo(xPosition, yPosition);
        cuadrado.moveTo(xPosition - 9, yPosition + 14);
        triangulo2.moveTo(xPosition - 9, yPosition + 18);
        triangulo3.moveTo(xPosition + 9, yPosition + 18);

    }

    public void makeVisible(){
        triangulo1.makeVisible();
        cuadrado.makeVisible();
        triangulo2.makeVisible();
        triangulo3.makeVisible();
    }

    public void makeInvisble(){
        triangulo1.makeInvisible();
        triangulo2.makeInvisible();
        triangulo3.makeInvisible();
        cuadrado.makeInvisible();
    }

}
