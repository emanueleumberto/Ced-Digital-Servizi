package Ereditarieta;

public class Automobile extends Veicolo {

    private int numPorte;

    public Automobile(String marca, String modello, String colore, int numPorte) {
        super(marca, modello, colore);
        this.numPorte = numPorte;
    }

    public String info() {
        return "Automobile: " + super.info() + " num.porte: " + this.numPorte;
    }

}
