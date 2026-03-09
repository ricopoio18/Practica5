package Practica5;

public class Carta {
    private int valor;
    private Tipo tipo;

    public Carta(){
        valor = 10;
        tipo = Tipo.TREBOL;
    }
    public Carta(int valor, Tipo tipo){
        this.valor = valor;
        this.tipo = tipo;
    }

    public enum Tipo{
        TREBOL("♣\uFE0E"),
        DIAMANTE("♦\uFE0F"),
        CORAZON("❤\uFE0F"),
        PICA("♠\uFE0F");

        private String palo;
        Tipo(String palo) {
            this.palo = palo;
        }

        public String getPalo() {
            return palo;
        }
    }
    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }

    public int getValor(){
        return valor;
    }

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
        return carta = carta + " de "+ tipo.getPalo();
    }

}
