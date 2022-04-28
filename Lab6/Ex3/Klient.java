package Ex3;

public class Klient extends Osoba {
    int wiek;

    public Klient(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko);
        this.wiek = wiek;
    }

    public void jestem() {
        super.jestem();
        System.out.println("Jestem klientem i mam " + this.wiek + " lat.");
    }
}
