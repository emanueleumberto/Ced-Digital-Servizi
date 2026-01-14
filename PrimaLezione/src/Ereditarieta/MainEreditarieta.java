package Ereditarieta;

public class MainEreditarieta {

    public static void main(String[] args) {
        Automobile a1 = new Automobile("Fiat", "Panda", "Bianca", 3);
        Automobile a2 = new Automobile("Renault", "Clio", "Nero", 3);

        Moto m1 = new Moto("Honda", "Hornet", "Nera", false);

        Camper c1 = new Camper("Laika", "Camping", "Bianco", 5);

        Veicolo v1 = new Veicolo("---", "---", "---");

        Smartphone s1 = new Smartphone("Apple", "Iphone", "Nero", 64);

        Veicolo[] arrVeicoli = new Veicolo[4];
        arrVeicoli[0] = a1;
        arrVeicoli[1] = m1;
        arrVeicoli[2] = c1;
        arrVeicoli[3] = a2;
        // arrVeicoli[3] = s1;

        for (int i = 0; i < arrVeicoli.length; i++) {
            System.out.println(arrVeicoli[i].info());
            //System.out.println(arrVeicoli[i]);
        }

    }

}
