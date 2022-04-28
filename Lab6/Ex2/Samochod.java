package Ex2;

public class Samochod {
    String marka, model, kolor;
    int rokProdukcji, przebieg;

    public Samochod() {
        this.marka = " ";
        this.model = " ";
        this.kolor = " ";
        this.rokProdukcji = 2000;
        this.przebieg = 0;
    }

    public Samochod(String marka, String model, String kolor, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public void opis() {
        System.out.println("Marka: " + this.marka);
        System.out.println("Model: " + this.model);
        System.out.println("Kolor: " + this.kolor);
        System.out.println("Rok produkcji: " + this.rokProdukcji);
        System.out.println("Przebieg: " + this.przebieg);
    }
}
