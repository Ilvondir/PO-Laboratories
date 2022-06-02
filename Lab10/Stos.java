package Lab10;

import java.util.LinkedList;

public class Stos<T> {
    private LinkedList stos = new LinkedList<T>();

    void push(T v) {
        this.stos.add(v);
    }

    T peek() {
        return (T)stos.get(0);
    }

    T pop() {
        T temp = (T)stos.get(0);
        stos.remove(0);
        return temp;
    }

    boolean empty() {
        int i = 0;
        for (Object elem : stos) {
            i++;
        }
        if (i==0) return true;
        else return false;
    }

    public String toString() {
        String zwrot = "{";
        for (Object elem : this.stos) {
            zwrot += (String)elem;
            zwrot += ", ";
        }
        zwrot += "}";
        return zwrot;
    }

}
