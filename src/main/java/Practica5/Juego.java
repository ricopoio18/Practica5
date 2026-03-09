package Practica5;

public class Juego {

    public static void main(String[] args) {

        System.out.println("Creando mazo");
        Mazo mazo = new Mazo();
        System.out.println("\nMostrando 5 primeras cartas del mazo");
        System.out.println(mazo.mostrarMazo(5));
        System.out.println("\nBarajando mazo");
        mazo.barajar();
        System.out.println("\nMontrando 5 primeras cartas después de barajar el mazo");
        System.out.println(mazo.mostrarMazo(5));

        System.out.println("\nCreando 3 jugadores");
        Jugador jugador1 = new Jugador("Johab", mazo.repartirCartas(5));
        Jugador jugador2 = new Jugador("Juan", mazo.repartirCartas(5));
        Jugador jugador3 = new Jugador("Luis", mazo.repartirCartas(5));

        System.out.println("Jugador 1: " + jugador1.nombre+
                "\nJugador 2: " + jugador2.nombre +
                "\nJugador 3: " + jugador3.nombre);

        System.out.println("\nRepartiendo cartas a cada jugador");
        System.out.println(jugador1);
        System.out.println(jugador2);
        System.out.println(jugador3);

        System.out.println("\nCartas restantes después de repartir: " + mazo.tamañoMazo());
        System.out.println("\nMostrando 5 primeras cartas después de repartir a cada jugador:");
        System.out.println(mazo.mostrarMazo(5));

        System.out.println("\nJuan devolvió la carta 1 y 2");
        mazo.agregarCarta(jugador2.deshacerseDeCartas(1));
        mazo.agregarCarta(jugador2.deshacerseDeCartas(1));
        System.out.println("\nCartas de Juan después de devolver");
        System.out.println(jugador2);

        System.out.println("Mazo después de recibir cartas devueltas");
        System.out.println("Mazo con " + mazo.tamañoMazo() + " cartas");




    }
}