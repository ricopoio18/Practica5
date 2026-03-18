package practica6;

/**
 * La clase Posicion representa un punto en un plano bidimensional
 * mediante coordenadas X y Y.
 *
 * Permite obtener y modificar dichas coordenadas.
 */
public class Posicion {
    private int xPosition;
    private int yPosition;

    /**
     * Constructor por defecto.
     * Inicializa la posición en (150, 150).
     */
    public Posicion(){
        xPosition = 150;
        yPosition = 150;
    }

    /**
     * Constructor con parámetros.
     * Permite definir una posición específica.
     *
     * @param xPosition Coordenada en el eje X
     * @param yPosition Coordenada en el eje Y
     */
    public Posicion(int xPosition, int yPosition){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    /**
     * Obtiene la coordenada X.
     *
     * @return valor de X
     */
    public int getXPosition() {
        return xPosition;
    }

    /**
     * Establece la coordenada X.
     *
     * @param xPosition nuevo valor de X
     */
    public void setXPosition(int xPosition){
        this.xPosition = xPosition;
    }

    /**
     * Obtiene la coordenada Y.
     *
     * @return valor de Y
     */
    public int getYPosition() {
        return yPosition;
    }

    /**
     * Establece la coordenada Y.
     *
     * @param yPosition nuevo valor de Y
     */
    public void setYPosition(int yPosition){
        this.yPosition = yPosition;
    }
}