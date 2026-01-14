package Ereditarieta;

public class Moto extends Veicolo {

    private boolean baule;

    public Moto(String marca, String modello, String colore, boolean baule) {
        super(marca, modello, colore);
        this.baule = baule;
    }

    public String info() {
        return "Moto: " + super.info() + " baule: " + this.baule;
    }
}
