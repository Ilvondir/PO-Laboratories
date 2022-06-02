package Lab10;

public class Komedia extends Film {
    final String typ = "Komedia";

    public Komedia(String tytul, int czasTrwania, boolean czyObejrzany) {
        super(tytul, czasTrwania, czyObejrzany);
    }

    public void info() {
        System.out.println("Typ: " + this.typ);
        super.info();
    }
}
