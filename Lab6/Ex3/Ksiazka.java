package Ex3;

public class Ksiazka {
    Osoba autor;
    String tytul;
    double cena;

    public Ksiazka(String tytul, Osoba autor, double cena) {
        this.autor = autor;
        this.tytul = tytul;
        this.cena = cena;
    }

    public void informacje() {
        System.out.println("Tytul: " + this.tytul);
        System.out.println("Autor: " + this.autor.imie + " " + this.autor.nazwisko);
        System.out.println("Cena: " + this.cena);
    }
}
