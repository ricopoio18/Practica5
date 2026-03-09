package Practica5;

import java.util.ArrayList;

public class Jugador {
    public String nombre;
    private ArrayList<Carta> mano;

    public Jugador(String nombre, ArrayList<Carta> mano){
        this.nombre = nombre;
        this.mano = mano;
    }

    public void recibirCartas(Carta carta){
        mano.add(carta);
    }

    public Carta deshacerseDeCartas(int numero){
        int posicion = numero - 1;
        if(posicion >=0 && posicion < mano.size()){
            return mano.remove(posicion);
        }
        return null;
    }

    public String toString(){
        return "\n" + nombre + " tiene"+"\nMano: " + mano.toString();
    }

}
