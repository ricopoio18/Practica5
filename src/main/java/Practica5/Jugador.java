package Practica5;

import java.util.ArrayList;

/**
 * Representa a un jugador dentro del juego de cartas.
 * Cada jugador tiene un nombre y una mano de cartas.
 * Permite recibir cartas, deshacerse de ellas y mostrar
 * la información del jugador y sus cartas.
 */
public class Jugador {

    /** Nombre del jugador. Puede ser modificado directamente por otras clases. */
    public String nombre;

    /** Lista de cartas que el jugador tiene en su mano. */
    private ArrayList<Carta> mano;

    /**
     * Constructor que crea un jugador con un nombre y una mano inicial de cartas.
     *
     * @param nombre nombre del jugador
     * @param mano lista de cartas inicial del jugador
     */
    public Jugador(String nombre, ArrayList<Carta> mano){
        this.nombre = nombre;
        this.mano = mano;
    }

    /**
     * Agrega una carta a la mano del jugador.
     *
     * @param carta carta que recibirá el jugador
     */
    public void recibirCartas(Carta carta){
        mano.add(carta);
    }

    /**
     * Permite al jugador deshacerse de una carta de su mano.
     * La posición se basa en un número comenzando desde 1.
     *
     * @param numero posición de la carta que se desea eliminar
     * @return la carta eliminada o null si la posición no es válida
     */
    public Carta deshacerseDeCartas(int numero){
        int posicion = numero - 1;

        if(posicion >=0 && posicion < mano.size()){
            return mano.remove(posicion);
        }

        return null;
    }

    /**
     * Devuelve una representación en texto del jugador
     * incluyendo su nombre y las cartas que tiene en su mano.
     *
     * @return cadena con la información del jugador
     */
    public String toString(){
        return "\n" + nombre + " tiene" + "\nMano: " + mano.toString();
    }

}