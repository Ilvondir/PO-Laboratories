package Lab10;

import java.util.ArrayDeque;
import java.util.Deque;

public class kolejkiCommand {
    Deque<Command> kolejka = new ArrayDeque<>();

    public Deque<Command> dodanie() {
        kolejka.add(new Command("insert into"));
        kolejka.add(new Command("drop database"));
        kolejka.add(new Command("create database"));
        return kolejka;
    }
}
