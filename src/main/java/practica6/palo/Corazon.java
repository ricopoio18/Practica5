package practica6.palo;
import Figuras.*;

public class Corazon {
    private Circle circulo1;
    private Circle circulo2;
    private Square cuadrado;
    private Triangle triangulo1;
    private Triangle triangulo2;

    int xPosition;
    int yPosition;

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

    public int getYPosition(){
        return yPosition;
    }
    public int getXPosition(){
        return xPosition;
    }

    public void moveTo(int x, int y) {
        xPosition = x;
        yPosition = y;

        circulo1.moveTo(xPosition, yPosition);
        circulo2.moveTo(xPosition + 9, yPosition);
        cuadrado.moveTo(xPosition + 4, yPosition +8);
        triangulo1.moveTo(xPosition + 4, yPosition + 11);
        triangulo2.moveTo(xPosition + 15, yPosition + 11);
    }

    public void makeVisible(){
        circulo1.makeVisible();
        circulo2.makeVisible();
        cuadrado.makeVisible();
        triangulo1.makeVisible();
        triangulo2.makeVisible();
    }

    public void makeInvisible(){
        circulo1.makeInvisible();
        circulo2.makeInvisible();
        cuadrado.makeInvisible();
        triangulo1.makeInvisible();
        triangulo2.makeInvisible();
    }
}
