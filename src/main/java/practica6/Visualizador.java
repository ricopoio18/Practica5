package practica6;

import Figuras.Square;
import Practica5.*;
import practica6.palo.*;

/**
 * La clase Visualizador se encarga de representar gráficamente
 * una carta en pantalla utilizando figuras geométricas.
 *
 * Dibuja la base de la carta (bordes y fondo) y el contenido
 * correspondiente según el valor y tipo de la carta.
 *
 * Soporta valores del 1 al 13, donde:
 * 1–10 representan cartas numéricas
 * 11–13 representan J, Q y K (figuras)
 */

public class Visualizador {

    private Carta carta;
    private Posicion posicion;

    private Square b1, b2, n1, n2;

    /**
     * Constructor de la clase Visualizador.
     * Inicializa la carta y su posición, crea la base gráfica
     * y dibuja automáticamente su contenido.
     *
     * @param carta Carta que se desea visualizar
     * @param posicion Posición donde se dibujará la carta
     */
    public Visualizador(Carta carta, Posicion posicion){
        this.carta = carta;
        this.posicion = posicion;

        b1 = new Square();
        b1.changeColor("white");
        b1.changeSize(148);
        b2 = new Square();
        b2.changeColor("white");
        b2.changeSize(148);
        n1 = new Square();
        n1.changeColor("black");
        n1.changeSize(150);
        n2 = new Square();
        n2.changeColor("black");
        n2.changeSize(150);

        dibujarBase();
        dibujarContenido();
    }
    /**
     * Dibuja la base de la carta, incluyendo bordes negros
     * y fondo blanco.
     */
    private void dibujarBase(){
        int x = posicion.getXPosition();
        int y = posicion.getYPosition();

        n1.moveTo(x, y);
        n2.moveTo(x, y + 76);
        b1.moveTo(x + 1, y + 1);
        b2.moveTo(x+1, y + 77);

        n1.makeVisible();
        n2.makeVisible();
        b1.makeVisible();
        b2.makeVisible();

    }
    /**
     * Determina qué contenido debe dibujarse según el tipo
     * y valor de la carta.
     */
    private void dibujarContenido(){
        int valor = carta.getValor();

        switch(carta.getTipo()){
            case DIAMANTE:
                dibujarSimbolos(valor, "diamante");
                break;

            case CORAZON:
                dibujarSimbolos(valor, "corazon");
                break;

            case TREBOL:
                dibujarSimbolos(valor, "trebol");
                break;

            case PICA:
                dibujarSimbolos(valor, "pica");
                break;
        }
    }
    /**
     * Dibuja los símbolos de la carta dependiendo de su valor.
     * Cada caso posiciona los símbolos en coordenadas específicas
     * para representar visualmente la carta.
     *
     * @param cantidad Número de símbolos a dibujar (1–13)
     * @param tipo Tipo de símbolo (diamante, corazon, trebol, pica)
     */
    private void dibujarSimbolos(int cantidad, String tipo){
        int baseX = posicion.getXPosition();
        int baseY = posicion.getYPosition();

        switch(cantidad){
            case 1:
                crearSimbolo(tipo, baseX + 65, baseY + 108);
                break;

            case 2:
                crearSimbolo(tipo, baseX + 65, baseY + 46);
                crearSimbolo(tipo, baseX + 65, baseY + 171);
                break;

            case 3:
                crearSimbolo(tipo, baseX + 65, baseY + 46);
                crearSimbolo(tipo, baseX + 65, baseY + 171);
                crearSimbolo(tipo, baseX + 65, baseY + 108);
                break;

            case 4:
                crearSimbolo(tipo, baseX + 27, baseY + 46);
                crearSimbolo(tipo, baseX + 102, baseY + 46);
                crearSimbolo(tipo, baseX + 102, baseY + 171);
                crearSimbolo(tipo, baseX + 27, baseY + 171);
                break;
            case 5:
                crearSimbolo(tipo, baseX + 27, baseY + 46);
                crearSimbolo(tipo, baseX + 102, baseY + 46);
                crearSimbolo(tipo, baseX + 102, baseY + 171);
                crearSimbolo(tipo, baseX + 27, baseY + 171);
                crearSimbolo(tipo, baseX + 65, baseY + 108);
                break;
            case 6:
                crearSimbolo(tipo, baseX + 27, baseY + 46);
                crearSimbolo(tipo, baseX + 102, baseY + 46);
                crearSimbolo(tipo, baseX + 102, baseY + 171);
                crearSimbolo(tipo, baseX + 27, baseY + 171);
                crearSimbolo(tipo, baseX + 27,baseY + 108);
                crearSimbolo(tipo, baseX + 102,baseY + 108);
                break;
            case 7:
                crearSimbolo(tipo, baseX + 27, baseY + 46);
                crearSimbolo(tipo, baseX + 102, baseY + 46);
                crearSimbolo(tipo, baseX + 102, baseY + 171);
                crearSimbolo(tipo, baseX + 27, baseY + 171);
                crearSimbolo(tipo, baseX + 27,baseY + 108);
                crearSimbolo(tipo, baseX + 102,baseY + 108);
                crearSimbolo(tipo, baseX + 27,baseY + 46);
                break;
            case 8:
                crearSimbolo(tipo, baseX + 65, baseY + 76);
                crearSimbolo(tipo, baseX + 65, baseY + 139);
                crearSimbolo(tipo, baseX + 102, baseY + 171);
                crearSimbolo(tipo, baseX + 27, baseY + 171);
                crearSimbolo(tipo, baseX + 27,baseY + 108);
                crearSimbolo(tipo, baseX + 102,baseY + 108);
                crearSimbolo(tipo, baseX + 27,baseY + 46);
                crearSimbolo(tipo, baseX + 65,baseY + 139);
                break;
            case 9:
                crearSimbolo(tipo, baseX + 27, baseY + 46);
                crearSimbolo(tipo, baseX + 102, baseY + 46);
                crearSimbolo(tipo, baseX + 102, baseY + 171);
                crearSimbolo(tipo, baseX + 27, baseY + 171);
                crearSimbolo(tipo, baseX + 27,baseY + 85);
                crearSimbolo(tipo, baseX + 102,baseY + 85);
                crearSimbolo(tipo, baseX + 27,baseY + 130);
                crearSimbolo(tipo, baseX + 102,baseY + 130);
                crearSimbolo(tipo, baseX + 65, baseY + 108);
                break;
            case 10:
                crearSimbolo(tipo, baseX + 27, baseY + 46);
                crearSimbolo(tipo, baseX + 102, baseY + 46);
                crearSimbolo(tipo, baseX + 102, baseY + 171);
                crearSimbolo(tipo, baseX + 27, baseY + 171);
                crearSimbolo(tipo, baseX + 27,baseY + 85);
                crearSimbolo(tipo, baseX + 102,baseY + 85);
                crearSimbolo(tipo, baseX + 27,baseY + 130);
                crearSimbolo(tipo, baseX + 102,baseY + 130);
                crearSimbolo(tipo, baseX + 65, baseY + 76);
                crearSimbolo(tipo, baseX + 65, baseY + 139);
                break;
            case 11:
                crearSimbolo(tipo, baseX + 65, baseY + 46);
                crearSimbolo(tipo, baseX + 65, baseY + 108);
                crearSimbolo(tipo, baseX + 65,baseY + 171);
                crearSimbolo(tipo, baseX + 65,baseY + 76);
                crearSimbolo(tipo, baseX + 65,baseY + 141);
                crearSimbolo(tipo, baseX + 45, baseY + 171);
                crearSimbolo(tipo, baseX + 25,baseY + 151);
                crearSimbolo(tipo, baseX + 25,baseY + 121);
                break;
            case 12:
                crearSimbolo(tipo, baseX + 85, baseY + 46);
                crearSimbolo(tipo, baseX + 65, baseY + 46);
                crearSimbolo(tipo, baseX + 45,baseY + 46);
                crearSimbolo(tipo, baseX + 25, baseY + 66);
                crearSimbolo(tipo, baseX + 25, baseY + 96);
                crearSimbolo(tipo, baseX + 25,baseY + 126);
                crearSimbolo(tipo, baseX + 25, baseY + 156);
                crearSimbolo(tipo, baseX + 45, baseY + 174);
                crearSimbolo(tipo, baseX + 65,baseY + 174);
                crearSimbolo(tipo, baseX + 85,baseY + 174);
                crearSimbolo(tipo, baseX + 105, baseY + 66);
                crearSimbolo(tipo, baseX + 105, baseY + 96);
                crearSimbolo(tipo, baseX + 105,baseY + 126);
                crearSimbolo(tipo, baseX + 105, baseY + 156);
                crearSimbolo(tipo, baseX + 110, baseY + 190);


                break;
            case 13:
                crearSimbolo(tipo, baseX + 25, baseY + 36);
                crearSimbolo(tipo, baseX + 25, baseY + 66);
                crearSimbolo(tipo, baseX + 25, baseY + 96);
                crearSimbolo(tipo, baseX + 25,baseY + 126);
                crearSimbolo(tipo, baseX + 25, baseY + 156);
                crearSimbolo(tipo, baseX + 25, baseY + 186);
                crearSimbolo(tipo, baseX + 50, baseY + 96);
                crearSimbolo(tipo, baseX + 65, baseY + 66);
                crearSimbolo(tipo, baseX + 80, baseY + 36);
                crearSimbolo(tipo, baseX + 50, baseY + 126);
                crearSimbolo(tipo, baseX + 65, baseY + 156);
                crearSimbolo(tipo, baseX + 80, baseY + 186);
                break;



        }

    }
    /**
     * Crea un símbolo gráfico del tipo especificado en la posición indicada.
     *
     * @param tipo Tipo de símbolo
     * @param x Coordenada X
     * @param y Coordenada Y
     */
    private void crearSimbolo(String tipo, int x, int y){
        switch(tipo){
            case "diamante":
                new Diamante(x, y);
                break;

            case "corazon":
                new Corazon(x, y);
                break;

            case "trebol":
                new Trebol(x, y);
                break;

            case "pica":
                new Pica(x, y);
                break;
        }
    }
}
