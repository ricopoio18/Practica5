package practica6.palo;

import Figuras.Circle;
import Figuras.Triangle;

public class Pica {

    private Circle circulo1;
    private Circle circulo2;
    private Triangle triangulo1;
    private Triangle triangulo2;
    int xPosition;
    int yPosition;

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
        circulo2.moveTo(xPosition + 6, yPosition);
        triangulo1.moveTo(xPosition + 8, yPosition - 8);
        triangulo2.moveTo(xPosition + 8, yPosition);
    }

    public void makeVisible(){
        circulo1.makeVisible();
        circulo2.makeVisible();
        triangulo1.makeVisible();
        triangulo2.makeVisible();
    }

    public void makeInvisible(){
        circulo1.makeInvisible();
        circulo2.makeInvisible();
        triangulo1.makeInvisible();
        triangulo2.makeInvisible();
    }

}
