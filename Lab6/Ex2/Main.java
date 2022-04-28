package Ex2;

public class Main {
    public static void main(String[] args) {
        Samochod auto1 = new Samochod();

        Samochod auto2 = new Samochod("Jelcz", "Tir", "Czerwony", 2004, 321331);

        SamochodOsobowy autoOsobowe = new SamochodOsobowy("Audi", "A6", "Srebrny", 1999, 122311, 2.1, 1.9, 6);

        auto1.opis();
        System.out.println();
        auto2.opis();
        System.out.println();
        autoOsobowe.opis();


    }
}
