package Lab9;

import java.util.*;

public class Main {

    public static List<Uczestnik> uczestnicy = new LinkedList<>();
    public static List<Uczestnik> uczestnicy2 = new ArrayList<>();

    public static void main(String[] args) {
        //Zad. 1
        Uczestnik adam = new Uczestnik(111, "Adam", 13);
        Uczestnik bartek = new Uczestnik(121, "Bartosz", 22);
        Uczestnik zofia = new Uczestnik(112, "Zofia", 19);

        filtr(adam);
        filtr(bartek);
        filtr(zofia);

        System.out.println("\nUczestnicy wydarzenia:");
        for (Uczestnik element : uczestnicy) {
            System.out.println(element.toString());
        }
        System.out.println("ArrayList: ");
        for (Uczestnik element : uczestnicy2) {
            System.out.println(element.toString());
        }

        //Zad. 2
        System.out.println();
        Rasa[] tablicaRas = new Rasa[5];
        List<Rasa> listaRas = new LinkedList<>();

        tablicaRas[0] = new Rasa("Troll", "Azeroth", 211);
        tablicaRas[1] = new Rasa("Orc", "Draenor", 176);
        tablicaRas[2] = new Rasa("Human", "Azeroth", 180);
        tablicaRas[3] = new Rasa("Blood Elf", "Quel'Thalas", 171);
        tablicaRas[4] = new Rasa("Pandaren", "Pandaria", 169);

        for (Rasa element : tablicaRas) {
            listaRas.add(element);
        }

        for (Rasa element : listaRas) {
            element.opis();
        }

        listaRas.subList(1,3).clear();

        System.out.println("\nPo usunieciu: ");
        for (Rasa element : listaRas) {
            element.opis();
        }

        //Zad. 3
        List<Integer> liczby = List.of(0,1,2,3,4,5,6,7,8,9);
        List<Integer> drugaLista = new ArrayList<>(10);

        int i = 9;
        while (i>=0) {
            drugaLista.add(liczby.get(i));
            i--;
        }

        System.out.println("\nPierwsza lista: ");
        for (int element : liczby) {
            System.out.println(element);
        }

        System.out.println("\nDruga lista: ");
        for (int element : drugaLista) {
            System.out.println(element);
        }
    }

    public static void filtr(Uczestnik uczestnik) {
        if (uczestnik.wiek >= 18) {
            uczestnicy.add(uczestnik);
            uczestnicy2.add(uczestnik);
            System.out.println(uczestnik.imie + " zostal/a dodany!");
        } else System.out.println(uczestnik.imie + " nie zostal/a dodany!");
    }

}
