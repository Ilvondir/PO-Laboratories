package Ex3;

public class Powiesc extends Ksiazka{
    String gatunek;

    public Powiesc(String tytul, Osoba autor, double cena, String gatunek) {
        super(tytul, autor, cena);
        this.gatunek = gatunek;
    }

    public void informacje() {
        super.informacje();
        System.out.println("Gatunek: " + this.gatunek);
    }
}
