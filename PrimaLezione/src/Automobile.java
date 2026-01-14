public class Automobile {
    // Membri di una classe

    // Modificatori di accesso (Incapsulamento)
    // public | protected | private | package
    // public -> tutti possono accedere in lettura/scrittura su un membro
    // protectd -> permette l'accesso ad elementi definiti nello stesso package in cui è definito il membro
    //              sia in oggetti definiti in altri package purchè siano estensioni della classe di riferimento
    // private -> nessuno dall'esterno della classe in cui è stato definito il membro può accedere
    // package -> permette l'accesso ad elementi definiti nello stesso package in cui è definito il membro

    // Attributi o proprietà di istanza
    private String marca;
    private String modello;
    private int cilindrata;
    private String colore;
    private String targa;
    private CategoriaAutomobile categoria;
    private boolean motoreAcceso = false;

    public Automobile(String marca, String modello, int cilindrata, String colore, CategoriaAutomobile categoria) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.colore = colore;
        this.categoria = categoria;
    }

    public Automobile(String marca, String modello, int cilindrata, String colore, CategoriaAutomobile categoria, String targa) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.colore = colore;
        this.categoria = categoria;
        this.targa = targa;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getTarga() {
        // controlli
        return this.targa;
    }

    public void setTarga(String targa) {
        // controlli
        this.targa = targa;
    }

    // Metodi di istanza
    public void start() {
        this.motoreAcceso = true;
        System.out.println("Start " + this.modello + "!");
    }

    public void stop() {
        this.motoreAcceso = false;
        System.out.println("Stop auto!");
    }

    public void info() {
        System.out.println(this.marca + " " + this.modello + " " + this.categoria + " colore: "  +
                            this.colore + " cc." + this.cilindrata + " targa: " +
                            this.targa + " auto: " + this.motoreAcceso);
    }
}
