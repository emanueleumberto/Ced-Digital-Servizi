import com.github.javafaker.Faker;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private static Faker fake = new Faker(new Locale("it-IT"));

    public static void main(String[] args) {

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

        // Posso operare su uno Stream in due modi:
        //  -> Tramite operazioni intermedie
        //  -> Tramite operazioni finali

        // Operazioni intermedie
        // Sono tutte quelle operazioni che effettuano delle trasformazioni dello Stream
        // e restituiscono uno Stream modificato
        // Lo operazioni intermedie possono essere concatenate e la concatenazione delle
        // operazioni intermedie viene chiamata pipeline

        // Operazioni intermedie si dividono in:
        //  -> iteration
        //  -> filtering
        //  -> mapping

        Stream<String> myStream = Stream.of("Java", "Javascript", "Python", "C#", "Java", "NodeJS", "Php");
        //myStream.forEach(str -> System.out.println(str));

//        Stream<String> myStreamDistinct = myStream.distinct();
//        Stream<String> myStreamFilter = myStreamDistinct.filter(str -> str.length() > 3);
//        Stream<String> myStreamSorted = myStreamFilter.sorted();
//        myStreamSorted.forEach(System.out::println);

//        myStream.distinct()
//                .filter(str -> str.length() > 3)
//                .map(str -> str + "!!!")
//                .sorted()
//                .limit(3)
//                .forEach(System.out::println);


        List<User> users = createUserFake(5);
        users.get(0).getHobby().add("Calcio");
        users.get(0).getHobby().add("Padel");
        users.get(2).getHobby().add("Calcio");
        users.get(3).getHobby().add("Golf");
        users.get(3).getHobby().add("Calcio");
        users.get(1).getHobby().add("Padel");
        users.get(1).getHobby().add("Calcio");
        users.get(4).getHobby().add("Calcio");

        users.get(0).setRole("Admin");
        users.get(3).setRole("Admin");

        users.forEach(System.out::println);

        // Filtro senza utilizzare gli Stream
//        List<User> usersOver30 = new ArrayList<>();
//        for (int j = 0; j < users.size(); j++) {
//            if(users.get(j).getAge() > 30) {
//                usersOver30.add(users.get(j));
//            }
//        }

        // Filtro CON gli Stream
        // users.stream().filter(u -> u.getAge() > 30).forEach(System.out::println);

        // Mapping
        // .mapToInt(Oggetto::ProprietaInt) -> Trasforma uno Stream di oggetti in uno Stream di interi
        // .mapToLong(Oggetto::ProprietaLong) -> Trasforma uno Stream di oggetti in uno Stream di Long
        // .mapToDouble(Oggetto::ProprietaDouble) -> Trasforma uno Stream di oggetti in uno Stream di Double
        // .flatMap(obj -> obj.prop.stream()) -> Trasforma uno Stream di oggetti in uno Stream di valori
        //              letti da una collection contenuta in una proprietà di ogni singolo oggetto dello Stream

        // Estraggo l'età da una lista di Utenti
        OptionalDouble age = users.stream()
                .mapToInt(User::getAge)
                //.sum();
                //.min();
                //.max();
                .average();
                //.forEach(System.out::println);
        System.out.println("L'età media degli utenti nella lista è: " + age.getAsDouble());

        // Estraggo una lista di hobby degli utenti
        users.stream()
                .flatMap(u -> u.getHobby().stream())
                .distinct()
                .forEach(System.out::println);


        // Operazioni finali
        // Le operazioni finali sono tutte quelle operazioni che mi restituiscono un valore finale
        // Terminando la manipolazione dello Stream

        // Matching
        // Reduction
        // Collection

        // Reduction
        int num1 = Stream.iterate(0, n -> n+2).limit(10)
                         .reduce(0, (acc, val) -> acc + val);
        int num2 = Stream.iterate(0, n -> n+2).limit(10)
                         .reduce(0, Integer::sum);
        System.out.println(num1);
        System.out.println(num2);

        // Matching
        Stream<Integer> myStreamNum =  Stream.iterate(0, n -> n+2).limit(10); // 0 -> 18
        boolean b = myStreamNum.anyMatch(e -> e > 5);
        System.out.println("AnyMatch > 5: " + b);
        b = Stream.iterate(0, n -> n+2).limit(10).allMatch(e -> e > 5);
        System.out.println("AllMatch > 5: " + b);
        b = Stream.iterate(0, n -> n+2).limit(10).noneMatch(e -> e > 5);
        System.out.println("NoneMatch > 5: " + b);

        boolean calcio = users.stream().allMatch(u -> u.getHobby().contains("Calcio"));
        System.out.println("AllMatch 'Calcio': " + calcio);


        // Collection
        // .collect(Collectors.toList()) -> toList() -> List<E>
        // .collect(Collectors.toSet()) -> toSet() -> Set<E>
        // .collect(Collectors.toMap()) -> toMap() -> Map<K,E>

        Stream<String> myStreamLanguage = Stream.of("Java", "Javascript", "Python", "C#", "Java", "NodeJS", "Php");
        List<String> listaLinguaggiDiProgrammazione = myStreamLanguage.distinct()
                .filter(str -> str.length() > 3)
                .map(str -> str + "!!!")
                .sorted()
                .limit(3)
                .toList();
        listaLinguaggiDiProgrammazione.forEach(System.out::println);

        // Collectors
        // Collectors.toList() -> Raccoglie i dati manipolati da uno Stream in una lista
        // Collectors.toSet() -> Raccoglie i dati manipolati da uno Stream in un Set
        // Collectors.toMap() -> Raccoglie i dati manipolati da uno Stream in una mappa specificando Chiave e Valore

        // Collectors.groupingBy() -> Raggruppo gli elementi di uno Stream in una mappa in cui la chiave sarà la
        //                              proprietà per il quale voglio raggruppare, il valore sarà una lista di elementi raggruppati
        // Collectors.summingInt() -> Calcolo la somma di valori interi contenuti in uno Stream
        // Collectors.summingLong() -> Calcolo la somma di valori Long contenuti in uno Stream
        // Collectors.summingDouble() -> Calcolo la somma di valori double contenuti in uno Stream
        // Collectors.averagingInt() -> Calcolo la media di valori interi contenuti in uno Stream
        // Collectors.averagingLong() -> Calcolo la media di valori Long contenuti in uno Stream
        // Collectors.averagingDouble() -> Calcolo la media di valori Double contenuti in uno Stream

        Map<String, List<User>> usersRole =  users.stream().collect(Collectors.groupingBy(User::getRole));
        usersRole.forEach((key, val) -> System.out.println(key + " -> " + val));

        // Comparators
        // Comparator è metodo per la gestione avanzata degli ordinamenti di uno Stream
        // .sorted(Comparator.comparing(Oggetto::Proprieta))
        // .sorted(Comparator.comparingInt(Oggetto::ProprietaInt))
        // .sorted(Comparator.comparingLong(Oggetto::ProprietaLong))
        // .sorted(Comparator.comparingDouble(Oggetto::ProprietaDouble))

        users.stream().sorted(Comparator.comparingInt(User::getAge)).forEach(System.out::println);



    }

    public static List<User> createUserFake(int num) {
        List<User> users= new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String name = fake.name().firstName();
            String lastname = fake.name().lastName();
            int age = fake.number().numberBetween(18, 80);
            String city = fake.address().cityName();
            User u = new User(name, lastname, city, age);
            users.add(u);
        }
        return users;
    }


}