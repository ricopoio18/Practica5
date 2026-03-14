package practica6;

public class Posicion {
    private int xPosition;
    private int yPosition;

    public Posicion(){
        xPosition = 150;
        yPosition = 150;
    }

    public Posicion(int xPosition, int yPosition){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public int getXPosition() {
        return xPosition;
    }
    public void setXPosition(int xPosition){
        this.xPosition = xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }
    public void setYPosition(int yPosition){
        this.yPosition = yPosition;
    }
}
