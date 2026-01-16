import classes.*;
import com.github.javafaker.Faker;
import enumerations.CategoriaAutomobile;
import interfaces.Navigatore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Modificatori di accesso (Incapsulamento)
        // public | protected | private | package
        // public -> tutti possono accedere in lettura/scrittura su un membro
        // protected -> permette l'accesso ad elementi definiti nello stesso package in cui è definito il membro
        //              sia in oggetti definiti in altri package purchè siano estensioni della classe di riferimento
        // private -> nessuno dall'esterno della classe in cui è stato definito il membro può accedere
        // default o package -> permette l'accesso ad elementi definiti nello stesso package in cui è definito il membro


        // I 4 pilastri fondamentali dei linguaggi OOP
        // -> Incapsulamento
        //      Ci permette di nasconere dettagli implementativi (membri definiti private) da una classe.
        // -> Ereditarietà
        //      Ci permette di ereditare in una classe figlia tutti i mebri della classe padre
        // -> Astrazione
        //      Ci permette di astrarre oggetti troppo generici
        // -> Polimorfismo
        //      Ci permette di definire classe e oggetti che possono avere molteplici tipi

        // Veicolo v = new Veicolo("Fiat", "Panda", "Nero");
        // v.marca = "Ford"; // public
        // v.colore = "Blue"; // protected
        // v.modello = "abc"; // private
        // v.targa = "AB123CD"; // default o package

        Automobile a1 = new Automobile("Fiat", "Panda", "Bianca", 3, CategoriaAutomobile.UTILITARIA);
        Automobile a2 = new Automobile("Renault", "Clio", "Nero", 3, CategoriaAutomobile.BERLINA);
        Moto m1 = new Moto("Honda", "Hornet", "Nera", false);
        Camper c1 = new Camper("Laika", "Camping", "Bianco", 5);
        Veicolo v = new Moto("Ducati", "Monster", "Rosso", false);
        Camion cc = new Camion("Iveco", "Driver", "Verde", 2000);
        Smartphone s1 = new Smartphone("Apple", "Iphone", "Nero", 64);


        //v.setBaule(true); ERRORE
        Moto m2 = (Moto) v;
        m2.setBaule(true);

        Veicolo[] arrVeicoli = new Veicolo[6];
        arrVeicoli[0] = a1;
        arrVeicoli[1] = m1;
        arrVeicoli[2] = c1;
        arrVeicoli[3] = a2;
        arrVeicoli[4] = v;
        arrVeicoli[5] = cc;

        for (int i = 0; i < arrVeicoli.length; i++) {
            // System.out.println(arrVeicoli[i]);
//            if(arrVeicoli[i] instanceof Automobile) {
//                System.out.println("Sono una Automobile");
//                Automobile a = (Automobile) arrVeicoli[i];
//                System.out.println(a.info());
//            } else if(arrVeicoli[i] instanceof Moto) {
//                System.out.println("Sono una Moto");
//                Moto m = (Moto) arrVeicoli[i];
//                System.out.println(m.info());
//            } else if(arrVeicoli[i] instanceof Camper) {
//                System.out.println("Sono un Camper");
//                Camper c = (Camper) arrVeicoli[i];
//                System.out.println(c.info());
//            }

            // System.out.println(arrVeicoli[i].info());
            // arrVeicoli[i].start();

        }

        Navigatore[] arrNavigatore = new Navigatore[3];
        arrNavigatore[0] = a1;
        arrNavigatore[1] = cc;
        arrNavigatore[2] = s1;

        for (int i = 0; i < arrNavigatore.length; i++) {
            arrNavigatore[i].aggiornaNavigatore();
        }

        Faker faker = new Faker(new Locale("it-IT"));

        String name = faker.name().fullName();
        System.out.println(name);

        Logger log = LoggerFactory.getLogger(Main.class);
        log.info("Sono la dipendenza Logger");

    }
}