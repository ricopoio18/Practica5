package practica6.palo;
import Figuras.*;

public class Trebol {
    private Circle circulo1;
    private Circle circulo2;
    private Circle circulo3;
    private Triangle triangulo;
    private int xPosition;
    private int yPosition;

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
        circulo2.moveTo(xPosition + 8, yPosition);
        circulo3.moveTo(xPosition + 4, yPosition - 7);
        triangulo.moveTo(xPosition + 9, yPosition + 6);
    }

    public void makeVisible(){
        circulo1.makeVisible();
        circulo2.makeVisible();
        circulo3.makeVisible();
        triangulo.makeVisible();
    }

    public void makeInvisble(){
        circulo1.makeInvisible();
        circulo2.makeInvisible();
        circulo3.makeInvisible();
        triangulo.makeInvisible();
    }

}
