package Lab10;

public class Horror extends Film {
    final String typ = "Horror";

    public Horror(String tytul, int czasTrwania, boolean czyObejrzany) {
        super(tytul, czasTrwania, czyObejrzany);
    }

    public void info() {
        System.out.println("Typ: " + this.typ);
        super.info();
    }
}
