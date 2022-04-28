package Ex3;

public class Osoba {
    String imie, nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void jestem() {
        System.out.print("Jestem " + this.imie + " " + this.nazwisko + ". ");
    }
}
