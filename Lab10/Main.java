package Lab10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class Main {

    static int iteratorKangurow = 0;

    public static void main(String[] args) {
        //Podpunkt 1
        System.out.println("\n\n");
        var kangury = new ArrayList<Kangur>(10);

        for(int i=0;i<10;i++) {
            kangury.add(nowyKangur());
            System.out.println("Kangur numer " + kangury.get(i).skok() + " robi hop");
        }

        //Podpunkt 2
        System.out.println("\n\n");
        int i=0;
        while (kangury.iterator().hasNext()) {
            if (i<10) {
                System.out.println("Kangur numer " + kangury.get(i).skok() + " robi hop");
                i++;
            } else break;
        }
        //Podpunkt 3
        System.out.println("\n\n");
        HashMap<String, Kangur> kangurzaMapa = new HashMap<>(10);
        kangurzaMapa.put("Ola", kangury.get(0));
        kangurzaMapa.put("Jacek", kangury.get(1));
        kangurzaMapa.put("Bartosz", kangury.get(2));
        kangurzaMapa.put("Zofia", kangury.get(3));
        kangurzaMapa.put("Gerard", kangury.get(4));
        kangurzaMapa.put("Garry", kangury.get(5));
        kangurzaMapa.put("Anna", kangury.get(6));
        kangurzaMapa.put("Azor", kangury.get(7));
        kangurzaMapa.put("Mruczek", kangury.get(8));
        kangurzaMapa.put("Tomasz", kangury.get(9));

        Iterator<String> iter = kangurzaMapa.keySet().iterator();
        while (iter.hasNext()) {
            String klucz = iter.next();
            Kangur wartosc = kangurzaMapa.get(klucz);

            System.out.println(klucz + " o numerze " + wartosc.skok());
        }

        //Podpunkt 4
        System.out.println("\n\n");
        var treeKangurzaMapa = new TreeMap<String, Kangur>();

        for (var element : kangurzaMapa.entrySet()) {
            treeKangurzaMapa.put(element.getKey(), kangurzaMapa.get(element.getKey()));
        }

        for (var element : treeKangurzaMapa.entrySet()) {
            System.out.println(element.getKey() + " o numerze " + treeKangurzaMapa.get(element.getKey()).skok());
        }

        //Zad. 2
        Ex2.main();

        //Zad. 3
        Ex3.main();

        //Zad. 4
        Ex4.main();

        //Zad. 5
        Ex5.main();
    }

    static Kangur nowyKangur() {

        Kangur kanagur = new Kangur(iteratorKangurow+1);
        iteratorKangurow++;

        return kanagur;
    }
}
