import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Generics Java
        String var;
        String[] arrg;
        Collection<String> coll;

//        GenericsClass gs = new GenericsClass<String>("Ciao");
//        gs.setValue("Stringa modificata");
//        System.out.println(gs.getValue());
//
//        GenericsClass gi = new GenericsClass<Integer>(25);
//        gi.setValue(50);
//        System.out.println(gi.getValue());
//
//        Utente u = new Utente("Mario", "Rossi", 25);
//        Utente v = new Utente("Giuseppe", "Verdi", 49);
//        GenericsClass gu = new GenericsClass<Utente>(u);
//        gu.setValue(v);
//        System.out.println(gu.getValue());
//
//        GenericsClassMulti gm = new GenericsClassMulti<String, Utente>("MR", u);


        testLambdaFuncion();


        // Intro Stream
        // Gli Stream sono un interfaccia che mi restituisce un flusso di dati
        // su cui è possibile fare delle operazioni

        // La sorgente di uno Stream è l'elemento che lo genera
        // Collection, Array, Stream

        Collection<String> c = new ArrayList<>();
        c.add("Java");
        c.add("Javascript");
        c.add("Python");
        c.add("C#");
        c.add("NodeJS");
        c.add("Php");

        String[] arr = {"Java", "Javascript", "Python", "C#", "NodeJS", "Php"};

        List<String> l1 = Arrays.asList(arr);
        List<String> l2 = Arrays.asList("Java", "Javascript", "Python", "C#", "NodeJS", "Php");

        Random rand = new Random();
        int i = rand.nextInt();
        double d = rand.nextDouble();
        System.out.println(d);


        // Creare uno stream da una sorgente di dati
        Stream<String> myStream1 = c.stream();
        Stream<String> myStream2 = l2.stream();
        Stream<String> myStream3 = Stream.of("Java", "Javascript", "Python", "C#", "NodeJS", "Php");
        Stream<Integer> myStream4 = Stream.iterate(0, n -> n+2).limit(10);
//        Stream<Double> myStream5 = Stream.generate(() -> {
//            Random r = new Random();
//            return r.nextDouble();
//        }).limit(10);
        Stream<Double> myStream5 = Stream.generate(new Random()::nextDouble).limit(10);


    }

    public static void testLambdaFuncion() {
        // Lambda Function
        // () -> { // blocco di istruzioni }
        // (param) -> { // blocco di istruzioni }
        // (param1, param2, ..., paramN) ->
        //{ // blocco di istruzioni }

//        String nome = "Mario";
//        String c = () -> { return "Ciao " + nome; };

        List<String> lista = new ArrayList<>();
        lista.add("Mario Rossi");
        lista.add("Giuseppe Verdi");
        lista.add("Francesca Neri");

//        for (String name : lista) {
//            String ele;
//            if(name.length() > 12) { ele = name + "!!!"; } else { ele = name; }
//            System.out.println(ele);
//        }

        lista.forEach(e -> {
            String ele;
            if(e.length() > 12) { ele = e + "!!!"; } else { ele = e; }
            System.out.println(ele);
        });

        lista.forEach(e -> System.out.println(e));
        lista.forEach(System.out::println);

    }
}