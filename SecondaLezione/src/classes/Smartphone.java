package classes;

import interfaces.Navigatore;

public class Smartphone implements Navigatore {

    private String marca;
    private String modello;
    private String colore;
    private float memoria;

    public Smartphone(String marca, String modello, String colore, float memoria) {
        this.marca = marca;
        this.modello = modello;
        this.colore = colore;
        this.memoria = memoria;
    }

    public String getMarca() {
        return marca;
    }
    public String getModello() {
        return modello;
    }
    public String getColore() {
        return colore;
    }
    public float getMemoria() {
        return memoria;
    }

    public String info() {
        return this.getMarca() + " " + this.getModello() +
                " colore: " + this.getColore();
    }

    @Override
    public void startNavigatore() {
        System.out.println("Start Navigatore su Smartphone");
    }

    @Override
    public void stopNavigatore() {
        System.out.println("Stop Navigatore su Smartphone");
    }

    @Override
    public void aggiornaNavigatore() {
        System.out.println("Aggiorna Navigatore su Smartphone");
    }
}
