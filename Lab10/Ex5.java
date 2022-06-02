package Lab10;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Ex5 {
    public static void main() {
        var prywatnaKolekcja = new TreeMap<Integer, Film>();

        Komedia f1 = new Komedia("Dracula", 79, true);
        Horror f2 = new Horror("Zombie", 112, false);
        Film f3 = new Film("Titanic", 189, true);

        prywatnaKolekcja.put(1112,f1);
        prywatnaKolekcja.put(1211,f2);
        prywatnaKolekcja.put(1221,f3);

        Iterator<Map.Entry<Integer, Film>> iterator = prywatnaKolekcja.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer,Film> entry = iterator.next();
            System.out.println("Album: " + entry.getKey());
            entry.getValue().info();
        }

    }
}
