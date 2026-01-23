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
        // --> Collection
        //      Non memorizza l'ordine in cui sono stati inseriti i dati,
        //      non definisce se ci possono essere dei valori duplicati
        //      Non può contenere valori primitivi, ma solo oggetti.
        //      Se ho bisogno di utilizzare dati primitivi
        //      sono costretto ad utilizzare le classi Wrapper(Integer, Double, Char, Boolean)
        //      --> List
        //              Gli elementi sono indicizzati e può contenere duplicati
        //              I valori inseriti sono memorizzati in base all'ordine di inserimento
        //              Consente di leggere, aggiungere, rimuovere e modificare gli elementi in base ad un indice
        //              La classe principale che implementa List è ArrayList
        //      --> Set
        //              Non ammettono duplicati e gli elementi non sono indicizzati
        //              I valori inseriti NON sono memorizzati in base all'ordine di inserimento
        //              La classe principale che implementa Set è HashSet
        //          --> SortedSet
        //                  Non ammette duplicati ma ordina in un certo modo gli elementi
        //                  La classe principale che implementa SortedSet è TreeSet
        //      --> Queue
        //              Crea una coda che ha dei metodi per leggere, inserire o eliminare elementi
        //              da inizio e fine della coda. Può contenere duplicati
        //              La classe principale che implementa Queue è LinkedList
        // --> Map
        //      Definisce una funzione composta da chiave/valore. Non può contenere valori primitivi
        //      Se ho bisogno di utilizzare valori primitivi, sono costretto ad utilizzare le classi Wrapper(Integer, Double, Char, Boolean)
        //      Una chiave sarà un valore univoco nella mappa, che servirà per poter accedere al valore associato.
        //      I valori inseriti NON sono memorizzati in base all'ordine di inserimento
        //      La classe principale che implementa Map è HashMap
        //      --> SortedMap
        //              Fornisce un ordine sulle chiavi della mappa
        //              La classe principale che implementa SortedMap è TreeMap

        // testCollection();
        // testList();
        // testSet();
        // testQueue();
        // testMap();

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

        // Controllo per verificare i valori duplicati in una lista
        if(!l.contains("Elemento Univoco")) {
            l.add("Elemento Univoco");
        }

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
        // Set<String> s = new HashSet<>();
        SortedSet<String> s = new TreeSet<>();

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

        boolean cont = s.contains("Quinto Elemento");
        System.out.println("Contains element 'Secondo Elemento': " + cont);

        boolean isEmp = s.isEmpty();
        System.out.println("Set is Empty?: " + isEmp);

        // s.remove("Secondo Elemento");
        // System.out.println("Set size: " + s.size());

        for (String str: s) {
            System.out.println(str);
        }

        //s.clear();
        //isEmp = s.isEmpty();
        //System.out.println("Set is Empty?: " + isEmp);

        // Metodi di SortedSet
        String f1 = s.first();
        System.out.println("First Element : " + f1);
        String l1 = s.last();
        System.out.println("Last Element : " + l1);

        String gf1 = s.getFirst();
        System.out.println("Get First Element : " + gf1);
        String gl1 = s.getLast();
        System.out.println("Get Last Element : " + gl1);

        String rf1 = s.removeFirst();
        System.out.println("Remove First Element : " + rf1);
        String rl1 = s.removeLast();
        System.out.println("Remove Last Element : " + rl1);

        for (String str: s) {
            System.out.println(str);
        }

    }

    public static void testQueue() {
        Queue<String> q = new LinkedList<>();
        q.add("Primo Elemento");
        q.add("Secondo Elemento");
        q.add("Terzo Elemento");
        q.add("Quarto Elemento");
        q.add("Terzo Elemento");

        System.out.println("Queue size: " + q.size());

        boolean cont = q.contains("Secondo Elemento");
        System.out.println("Contains element 'Secondo Elemento': " + cont);

        boolean isEmp = q.isEmpty();
        System.out.println("Queue is Empty?: " + isEmp);

//        q.remove("Secondo Elemento");

//        for (String str : q) {
//            System.out.println(str);
//        }

        //q.clear();
        //isEmp = q.isEmpty();
        //System.out.println("Queue is Empty?: " + isEmp);
        //System.out.println("Queue size: " + q.size());

        // Metodi di Queue
        String getFirst = q.peek(); // Legge il primo elemento di una coda
        System.out.println("First element: " + getFirst);

        String first = q.poll(); // Legge e rimuove un elemento da una coda
        System.out.println("First element poll: " + first);

        q.remove();

        for (String str : q) {
            System.out.println(str);
        }

    }

    public static void testMap() {
        Map<String, String> m = new HashMap<>();
        m.put("A", "Primo Elemento");
        m.put("B", "Secondo Elemento");
        m.put("C", "Terzo Elemento");
        m.put("D", "Quarto Elemento");
        m.put("E", "Terzo Elemento");

        if(!m.containsKey("B")) {
            m.put("B", "Quinto Elemento");
        }

        System.out.println("Map size: " + m.size());

        boolean key = m.containsKey("B");
        System.out.println("Map contains Key 'B': " + key);

        boolean val = m.containsValue("Terzo Elemento");
        System.out.println("Map contains Value 'Terzo Elemento': " + val);

        String ele = m.get("C");
        System.out.println("Element key 'C': " + ele);

        System.out.println("Map isEmpty?: " + m.isEmpty());

        // m.clear();
        // System.out.println("Map size: " + m.size());
        // System.out.println("Map isEmpty?: " + m.isEmpty());

        Set<String> keys =  m.keySet();
        for (String k: keys) {
            System.out.println(k + " -> " + m.get(k));
        }

        System.out.println("****************************************");

        Collection<String> values =  m.values();
        for (String v : values) {
            System.out.println(v);
        }

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