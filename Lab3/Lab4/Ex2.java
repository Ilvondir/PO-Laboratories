package Lab4;

public class Ex2 {
    public static void booleanTable() {
        boolean[] tab = new boolean[20];

        for (int i=0;i<tab.length;i++) {
            if (i%2==0) tab[i] = true;
            else tab[i] = false;
        }

        for(boolean element : tab) System.out.println(element);
    }
}
