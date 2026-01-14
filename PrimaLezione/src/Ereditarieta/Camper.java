package Ereditarieta;

public class Camper extends Veicolo {

    private int postiLetto;

    public Camper(String marca, String modello, String colore, int postiLetto) {
        super(marca, modello, colore);
        this.postiLetto = postiLetto;
    }

    public String info() {
        return "Camper: " + super.info() + " posti letto: " + this.postiLetto;
    }
}
