package classes;

import enumerations.CategoriaAutomobile;
import interfaces.Navigatore;

public class Automobile extends Veicolo implements Navigatore {
    private int numPorte;
    private CategoriaAutomobile categoria;

    public Automobile(String marca, String modello, String colore, int numPorte, CategoriaAutomobile categoria) {
        super(marca, modello, colore);
        this.numPorte = numPorte;
        this.categoria = categoria;
    }

    public int getNumPorte() {
        return numPorte;
    }

    public void test() {
        this.marca = "Ferrari"; // public
        this.colore = "Blue"; // protected
        this.targa = "AB123CD"; // default o package
        // this.modello = "abc"; // private
    }

    @Override
    public String info() {
        return "Automobile ("+categoria+"): " + super.info() + " num.porte: " + this.numPorte;
    }

    @Override
    public void start() {
        System.out.println("Start Auto!");
    }

    @Override
    public void startNavigatore() {
        System.out.println("Start Navigatore su Automobile");
    }

    @Override
    public void stopNavigatore() {
        System.out.println("Stop Navigatore su Automobile");
    }

    @Override
    public void aggiornaNavigatore() {
        System.out.println("Aggiorna Navigatore su Automobile");
    }
}
