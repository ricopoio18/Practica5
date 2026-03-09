package Practica5;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Representa un mazo de cartas de una baraja estándar.
 * El mazo contiene 52 cartas (13 valores por cada uno de los 4 palos).
 * Permite crear el mazo, barajarlo, repartir cartas, tomar cartas
 * y restablecer el mazo a su estado original.
 */
public class Mazo {

    /** Lista que almacena todas las cartas del mazo. */
    private ArrayList<Carta> mazo;

    /**
     * Constructor que crea un mazo completo de 52 cartas.
     * Genera cartas con valores del 1 al 13 para cada palo.
     */
    public Mazo(){
        mazo = new ArrayList<>();

        for (Carta.Tipo palo: Carta.Tipo.values()){
            for (int i = 1; i <= 13; i++) {
                mazo.add(new Carta(i, palo));
            }
        }
    }

    /**
     * Obtiene el número de cartas actualmente en el mazo.
     *
     * @return cantidad de cartas en el mazo
     */
    public int tamañoMazo(){
        return mazo.size();
    }

    /**
     * Restablece el mazo a su estado original de 52 cartas.
     * Elimina todas las cartas actuales y vuelve a generarlas.
     */
    public void restablecerMazo(){
        mazo.clear();
        for (Carta.Tipo palo: Carta.Tipo.values()){
            for (int i = 1; i <= 13; i++) {
                mazo.add(new Carta(i, palo));
            }
        }
    }

    /**
     * Baraja las cartas del mazo en un orden aleatorio.
     */
    public void barajar(){
        Collections.shuffle(mazo);
    }

    /**
     * Devuelve una lista con una cantidad específica de cartas
     * del mazo sin retirarlas del mismo.
     *
     * @param cantidadCartas número de cartas que se desean mostrar
     * @return lista de cartas solicitadas
     */
    public ArrayList<Carta> mostrarMazo(int cantidadCartas){
        ArrayList<Carta> mano = new ArrayList<>();

        if (cantidadCartas > mazo.size()){
            cantidadCartas = mazo.size();
        }

        for (int i = 0; i < cantidadCartas; i++) {
            mano.add(mazo.get(i));
        }

        return mano;
    }

    /**
     * Reparte una cantidad específica de cartas retirándolas del mazo.
     *
     * @param cantidadCartas número de cartas a repartir
     * @return lista de cartas repartidas
     */
    public ArrayList<Carta> repartirCartas(int cantidadCartas){
        ArrayList<Carta> mano = new ArrayList<>();

        if (cantidadCartas > mazo.size()){
            cantidadCartas = mazo.size();
        }

        for (int i = 0; i < cantidadCartas; i++) {
            mano.add(mazo.remove(0));
        }

        return mano;
    }

    /**
     * Agrega una carta al mazo.
     *
     * @param carta carta que se agregará al mazo
     */
    public void agregarCarta(Carta carta){
        mazo.add(carta);
    }

    /**
     * Toma la primera carta del mazo y la elimina del mismo.
     *
     * @return la carta tomada o null si el mazo está vacío
     */
    public Carta tomarCarta(){
        if(!mazo.isEmpty()){
            return mazo.remove(0);
        }
        return null;
    }

}