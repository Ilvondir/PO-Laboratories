package Lab10;

import java.util.ArrayDeque;
import java.util.Random;

public class Ex4 {
    public static void main() {
        String[] towary = {"Woda", "Piwo", "Banan", "Karma", "Garnek", "Kubek", "Monitor", "Bumerang", "But", "Chleb"};

        Stos<String> koszyk = new Stos<String>();

        for(int i=9;i>=0;i--) {
            koszyk.push(towary[i]);
        }
        koszyk.push(towary[8]);
        koszyk.push(towary[3]);
        koszyk.push(towary[1]);

        var kolejkaDoKasy = new ArrayDeque<String>(10);
        Random rand = new Random();
        int numer = rand.nextInt(1,10);

        for (int i=0; i<10;i++) {
            if (i==numer) kolejkaDoKasy.add("Ja");
            else kolejkaDoKasy.add("Ktos");
        }

        boolean status = false;
        for (String osoba : kolejkaDoKasy) {
            if (status) break;
            if (osoba == "Ktos") System.out.println("Czekam w kolejce.");
            if (osoba == "Ja") {
                System.out.println("Moje zakupy:");
                System.out.println(koszyk.toString());
                status = true;
            }
        }
    }
}
