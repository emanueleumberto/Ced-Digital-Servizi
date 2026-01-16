package classes;

public abstract class Veicolo {

    public String marca;
    private String modello;
    protected String colore;
    String targa; // default o package

    public Veicolo(String marca, String modello, String colore) {
        this.marca = marca;
        this.modello = modello;
        this.colore = colore;
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
    public void setColore(String colore) {
        this.colore = colore;
    }
    public String getTarga() {
        return targa;
    }
    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String info() {
        return this.getMarca() + " " + this.getModello() +
                " colore: " + this.getColore() + " targa: " + this.getTarga();
    }

    public abstract void start();

}
