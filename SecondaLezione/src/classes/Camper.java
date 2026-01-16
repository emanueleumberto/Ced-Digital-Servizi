package classes;

public class Camper extends Veicolo {
    private int postiLetto;

    public Camper(String marca, String modello, String colore, int postiLetto) {
        super(marca, modello, colore);
        this.postiLetto = postiLetto;
    }

    public int getPostiLetto() {
        return postiLetto;
    }

    @Override
    public String info() {
        return "Camper: " + super.info() + " posti letto: " + this.postiLetto;
    }

    @Override
    public void start() {
        System.out.println("Start Camper!");
    }
}
