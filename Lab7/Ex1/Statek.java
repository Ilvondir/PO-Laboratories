package Lekcja;

public class Statek implements Plywa {

    String rodzaj;

    public Statek(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void plyn() {
        System.out.println("Statek rodzaju " + this.rodzaj + " plywa po morzach i oceanach. Plusk. Plusk.");
    }
}
