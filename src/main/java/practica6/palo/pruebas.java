package practica6.palo;
import Figuras.Square;
import Practica5.*;

public class pruebas {
    public static void main(String[] args) {
        int baseX = 0;
        int baseY = 0;

        Square n1 = new Square();
        n1.changeColor("black");
        n1.changeSize(150);
        n1.moveTo(baseX, baseY);
        n1.makeVisible();
        Square n2 = new Square();
        n2.changeColor("black");
        n2.changeSize(150);
        n2.moveTo(baseX, baseY+75);
        n2.makeVisible();

        Square b1 = new Square();
        b1.changeColor("white");
        b1.changeSize(148);
        b1.moveTo(baseX+1, baseY+1);
        b1.makeVisible();
        Square b2 = new Square();
        b2.changeColor("white");
        b2.changeSize(148);
        b2.moveTo(baseX+1, baseY+76);
        b2.makeVisible();





        Diamante t4 = new Diamante(baseX+27, baseY+46);
        Diamante t5 = new Diamante(baseX+102, baseY+46);
        Diamante t2 = new Diamante(baseX+65,baseY+46);
        Diamante t1 = new Diamante(baseX+65, baseY+108);
        Diamante t3 = new Diamante(baseX+65, baseY+171);
        Diamante t6 = new Diamante(baseX+27, baseY+171);
        Diamante t7 = new Diamante(baseX+102, baseY+171);
        Diamante t8 = new Diamante(baseX+27,baseY+108);
        Diamante t9 = new Diamante(baseX+102, baseY+108);
    }
}
