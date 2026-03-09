package Practica5;

/**
 * Representa una carta de una baraja estándar.
 * Cada carta tiene un valor numérico y un tipo o palo.
 * El valor puede ir del 1 al 13, donde:
 * 1 = As, 11 = J, 12 = Q y 13 = K.
 */
public class Carta {

    /** Valor numérico de la carta. */
    private int valor;

    /** Tipo o palo de la carta. */
    private Tipo tipo;

    /**
     * Constructor por defecto.
     * Crea una carta con valor 10 y palo trébol.
     */
    public Carta(){
        valor = 10;
        tipo = Tipo.TREBOL;
    }

    /**
     * Constructor que permite crear una carta con un valor y un tipo específico.
     *
     * @param valor valor numérico de la carta (1–13)
     * @param tipo palo o tipo de la carta
     */
    public Carta(int valor, Tipo tipo){
        this.valor = valor;
        this.tipo = tipo;
    }

    /**
     * Enumeración que representa los diferentes palos de una carta.
     * Cada tipo contiene el símbolo correspondiente del palo.
     */
    public enum Tipo{

        TREBOL("♣\uFE0E"),
        DIAMANTE("♦\uFE0F"),
        CORAZON("❤\uFE0F"),
        PICA("♠\uFE0F");

        /** Símbolo visual del palo. */
        private String palo;

        /**
         * Constructor de la enumeración.
         *
         * @param palo símbolo del palo de la carta
         */
        Tipo(String palo) {
            this.palo = palo;
        }

        /**
         * Obtiene el símbolo del palo.
         *
         * @return símbolo del palo
         */
        public String getPalo() {
            return palo;
        }
    }

    /**
     * Obtiene el tipo o palo de la carta.
     *
     * @return tipo de la carta
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Modifica el tipo o palo de la carta.
     *
     * @param tipo nuevo tipo de la carta
     */
    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }

    /**
     * Obtiene el valor numérico de la carta.
     *
     * @return valor de la carta
     */
    public int getValor(){
        return valor;
    }

    /**
     * Devuelve una representación en texto de la carta.
     * Convierte algunos valores especiales:
     * 1 = A (As), 11 = J (Jack), 12 = Q (Queen), 13 = K (King).
     *
     * @return cadena con el valor y el símbolo del palo de la carta
     */
    public String toString(){
        String carta;

        switch (valor){
            case 1:
                carta = "A";
                break;
            case 11:
                carta = "J";
                break;
            case 12:
                carta = "Q";
                break;
            case 13:
                carta = "K";
                break;
            default:
                carta = "" + valor;
        }

        return carta + " de " + tipo.getPalo();
    }

}
