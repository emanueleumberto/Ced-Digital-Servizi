package classes;

import interfaces.Navigatore;

public class Camion extends Veicolo implements Navigatore {

    private double carico;

    public Camion(String marca, String modello, String colore, double carico) {
        super(marca, modello, colore);
        this.carico = carico;
    }

    public double getCarico() {
        return carico;
    }

    public void setCarico(double carico) {
        this.carico = carico;
    }

    @Override
    public void start() {
        System.out.println("Start Camion!");
    }

    @Override
    public String info() {
        return "Camion: " + super.info() + " carico: " + this.carico;
    }

    @Override
    public void startNavigatore() {
        System.out.println("Start Navigatore su Camion");
    }

    @Override
    public void stopNavigatore() {
        System.out.println("Stop Navigatore su Camion");
    }

    @Override
    public void aggiornaNavigatore() {
        System.out.println("Aggiorna Navigatore su Camion");
    }
}
