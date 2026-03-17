package practica6;

import Figuras.Square;
import Practica5.*;

public class Visualizador {
    private Posicion posicion;
    private Carta carta;
    // figuras para el cuerpo de la carta
    private Square b1;
    private Square b2;
    private Square n1;
    private Square n2;

    String palo1;
    String palo2;
    String palo3;
    String palo4;
    String palo5;
    String palo6;
    String palo7;
    String palo8;
    String palo9;
    String palo10;

    public Visualizador(int valor, Carta.Tipo palo, int x, int y){
        posicion = new Posicion(x, y);
        carta = new Carta(valor,palo);

        b1 = new Square();
        b2 = new Square();
        n1 =  new Square();
        n2 = new Square();

        visualizarBaseCarta();
    }

    public void visualizarBaseCarta(){
        b1.makeVisible();
        b2.makeVisible();
        n1.makeVisible();
        n2.makeVisible();
    }

    public void moveTo(int x,int y){
        posicion.setXPosition(x);
        posicion.setYPosition(y);

        b1.moveTo(posicion.getXPosition(),posicion.getYPosition());
        b2.moveTo(posicion.getXPosition(),posicion.getYPosition() + 75);
        n1.moveTo(posicion.getXPosition() + 1,posicion.getYPosition() + 1);
        n2.moveTo(posicion.getXPosition() + 1,posicion.getYPosition() + 76);
    }

}
