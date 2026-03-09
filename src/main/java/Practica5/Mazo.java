package Practica5;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta> mazo;

    public Mazo(){
        mazo = new ArrayList<>();

            for (Carta.Tipo palo: Carta.Tipo.values()){
                for (int i = 1; i <= 13; i++) {
                    mazo.add(new Carta(i, palo));
                }
            }
    }

    public int tamañoMazo(){
        return mazo.size();
    }
    public void restablecerMazo(){
        mazo.clear();
        for (Carta.Tipo palo: Carta.Tipo.values()){
            for (int i = 1; i <= 13; i++) {
                mazo.add(new Carta(i, palo));
            }
        }
    }
    public void barajar(){
        Collections.shuffle(mazo);
    }

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
    public void agregarCarta(Carta carta){
        mazo.add(carta);
    }

    public Carta tomarCarta(){
        if(!mazo.isEmpty()){
            return mazo.remove(0);
        }
        return null;
    }

}
