package classes;

public class Moto extends Veicolo {
    private boolean baule;

    public Moto(String marca, String modello, String colore, boolean baule) {
        super(marca, modello, colore);
        this.baule = baule;
    }

    public boolean isBaule() {
        return baule;
    }
    public void setBaule(boolean baule) {
        this.baule = baule;
    }

    @Override
    public String info() {
        return "Moto: " + super.info() + " baule: " + this.baule;
    }

    @Override
    public void start() {
        System.out.println("Start Moto!");
    }

}
