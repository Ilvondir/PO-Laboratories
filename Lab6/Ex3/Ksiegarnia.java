package Ex3;

public class Ksiegarnia {
    String adres;
    Osoba wlasciciel;
    Powiesc bestseller;

    public Ksiegarnia(Osoba wlasciciel, String adres, Powiesc bestseller) {
        this.adres = adres;
        this.wlasciciel = wlasciciel;
        this.bestseller = bestseller;
    }

    public void informacjeOgolne() {
        System.out.println("Wlasciciel ksiegarni: " + this.wlasciciel.imie + " " + this.wlasciciel.nazwisko);
        System.out.println("Nasz adres: " + adres);
        System.out.println("Nasz bestseller: " + this.bestseller.tytul);
    }

    public void reklama() {
        System.out.println("Oto nasz bestseller: " + this.bestseller.tytul);
        System.out.println("Autor: " + this.bestseller.autor.imie + " " + this.bestseller.autor.nazwisko);
        System.out.println("Szukajcie jej na regale: " + this.bestseller.gatunek);
        System.out.println("Tylko w ten weekend taniej o 20%: " + (0.8*this.bestseller.cena));

    }
}
