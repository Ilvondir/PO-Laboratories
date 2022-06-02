package Lab10;

import java.util.ArrayDeque;
import java.util.Deque;

public class konsumowanieKolejki {
    Deque<Command> kolejka = new ArrayDeque<>();

    public konsumowanieKolejki(Deque<Command> kolejka) {
        this.kolejka = kolejka;
    }

    public void konsumowanie() {
        for (Command element : this.kolejka) {
            element.operation();
            kolejka.pop();
        }
    }
}
