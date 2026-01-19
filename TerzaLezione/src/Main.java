import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class Main {

    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("it-IT"));
//        String name = faker.name().fullName();
//        System.out.println(name);

        // Logback per log

//        log.info("Sono INFO la dipendenza Logger");
//        log.debug("Sono DEBUG la dipendenza Logger");
//        log.warn("Sono WARN la dipendenza Logger");
//        log.error("Sono ERROR la dipendenza Logger");

        // Gestione delle eccezioni in Java

//        try {
//            calcolaDivisione();
//        } catch (CustomException e) {
//            log.error(e.getMessage());
//        }

        // Array in Java

        int[] arr = new int[5];
//        arr[0] = 25;
//        arr[1] = 10;
//        arr[2] = 5;
//        arr[3] = 80;
//        arr[4] = 3;

//        System.out.println(arr.length);

//        for (int i = 0; i <= 4; i++) {
//            System.out.println(arr[i]);
//        }

        // Collections Java
        // Collection in java sono dei contenitori dinamici di elementi.
        // A differenza degli array non hanno una dimensione fissa
        // Una collection può essere, ordinata o non ordinata, può ammettere duplicati o no.
        // L'interfaccia Collection non specifica nulla di quanto detto sopra (valori ordinati e/o duplicati)
        // Collection
        //  Non memorizza l'ordine in cui sono stati inseriti i dati,
        //  non definisce se ci possono essere dei valori duplicati
        //  Non può contenere valori primitivi, ma solo oggetti. Se ho bisogno di utilizzare dati primitivi
        //  sono costretto ad utilizzare le classi Wrapper(Integer, Double, Char, Boolean)
        //      --> List
        //              Gli elementi sono indicizzati e può contenere duplicati
        //              I valori inseriti sono memorizzati in base all'ordine di inserimento
        //              Consente di leggere, aggiungere, rimuovere e modificare gli elementi in base ad un indice
        //              La classe principale che implementa List è ArrayList
        //      --> Set
        //              Non ammettono duplicati e gli elementi non sono indicizzati
        //              I valori inseriti NON sono memorizzati in base all'ordine di inserimento
        //              La classe principale che implementa Set è HashSet
        //      --> Queue


        // testCollection();
        // testList();
        testSet();

    }

    public static void testCollection() {
        Collection<String> c = new ArrayList<>();
        c.add("Primo Elemento");
        c.add("Secondo Elemento");
        c.add("Terzo Elemento");
        c.add("Quarto Elemento");
        c.add("Terzo Elemento");

        System.out.println("Collection size: " + c.size());

        boolean cont = c.contains("Secondo Elemento");
        System.out.println("Contains element 'Secondo Elemento': " + cont);

        boolean isEmp = c.isEmpty();
        System.out.println("Collection is Empty?: " + isEmp);

        c.remove("Secondo Elemento");
        System.out.println("Collection size: " + c.size());

        for (String str : c) {
            System.out.println(str);
        }

        c.clear();
        isEmp = c.isEmpty();
        System.out.println("Collection is Empty?: " + isEmp);
        System.out.println("Collection size: " + c.size());

    }

    public static void testList() {
        List<String> l = new ArrayList<>();
        l.add("Primo Elemento");
        l.add("Secondo Elemento");
        l.add("Terzo Elemento");
        l.add("Quarto Elemento");
        l.add("Terzo Elemento");

        System.out.println("List size: " + l.size());

        boolean cont = l.contains("Secondo Elemento");
        System.out.println("Contains element 'Secondo Elemento': " + cont);

        boolean isEmp = l.isEmpty();
        System.out.println("List is Empty?: " + isEmp);

        // Metodi di List
        String ele = l.get(3);
        System.out.println("Element index 3: " + ele);

        // l.set(1, "Nuovo Elemento");
        // l.add(1, "Nuovo Elemento");

        int index = l.indexOf("Terzo Elemento");
        System.out.println("Index Element 'Terzo Elemento': " + index);

        int lastIndex = l.lastIndexOf("Terzo Elemento");
        System.out.println("Last Index Element 'Terzo Elemento': " + lastIndex);

        // l.remove(index);

        for (String str : l) {
            System.out.println(str);
        }

        l.clear();
        isEmp = l.isEmpty();
        System.out.println("List is Empty?: " + isEmp);
        System.out.println("List size: " + l.size());
    }

    public static void testSet() {
        Set<String> s = new HashSet<>();
        s.add("Primo Elemento");
        s.add("Secondo Elemento");
        s.add("Terzo Elemento");
        s.add("Quarto Elemento");
        s.add("Terzo Elemento"); // Valore duplicato | Non è stato inserito

        // add() -> restituisce true se il valore è stato inserito correttamente nel set
        //          restituisce false se il valore è duplicato e NON è stato inserito nel set

        if(s.add("Secondo Elemento")) {
            System.out.println("Valore inserito correttamente nel set");
        } else {
            System.out.println("Valore già presente nel set!!!");
        }

        System.out.println("Set size: " + s.size());
    }

    public static void calcolaDivisione() throws CustomException {

        int c = 0;
        Integer[] arr = new Integer[3];

        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Inserisci un numero: ");
                int x = Integer.parseInt(sc.nextLine());
                System.out.print("Inserisci un secondo numero: ");
                int y = Integer.parseInt(sc.nextLine());
                int div = x / y;
                // System.out.println("Il risultato della divisione tra " + x + " e " + y + " è: " + div);
                arr[c] = div;
            } catch (NumberFormatException e) {
                //System.out.println("Number format: " + e.getMessage());
                log.error("Number format: " + e.getMessage());
                c--;
            } catch (ArithmeticException e) {
                //System.out.println("Division " + e.getMessage());
                log.error("Division " + e.getMessage());
                c--;
            } catch (Exception e) {
                //System.out.println(e.getMessage());
                log.error(e.getMessage());
                c--;
            }
            c++;
        } while (c<3);

        if(c == 3) {
            throw new CustomException("Sono Custom Exception!");
        }
    }
}