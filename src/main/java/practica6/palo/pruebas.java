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





        Trebol t1 = new Trebol(baseX+35, baseY+40);
        Trebol t2 = new Trebol(baseX+110, baseY+40);
        Trebol t3 = new Trebol(baseX+75, baseY+102);
        Trebol t4 = new Trebol(baseX+35, baseY+165);
        Trebol t5 = new Trebol(baseX+110, baseY+165);
    }
}
