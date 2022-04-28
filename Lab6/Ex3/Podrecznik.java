package Ex3;

public class Podrecznik extends Ksiazka {
    String dziedzina;

    public Podrecznik(String tytul, Osoba autor, double cena, String dziedzina) {
        super(tytul, autor, cena);
        this.dziedzina = dziedzina;
    }

    public void informacje() {
        super.informacje();
        System.out.println("Dziedzina: " + this.dziedzina);
    }
}
