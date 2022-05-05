package Lekcja;

public class Samolot implements Lata {

    String typ;

    public Samolot(String typ) {
        this.typ = typ;
    }

    public String getTyp() {
        return typ;
    }

    public void lec() {
        System.out.println("Samolot typu " + this.typ + " lata po Niebie. Fru. Fru.");
    }
}
