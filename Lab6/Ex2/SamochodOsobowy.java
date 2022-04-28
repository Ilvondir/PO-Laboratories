package Ex2;

public class SamochodOsobowy extends Samochod {
    double waga, pojemnoscSilnika;
    int iloscOsob;

    public SamochodOsobowy(String marka, String model, String kolor, int rokProdukcji, int przebieg, double waga, double pojemnoscSilnika, int iloscOsob) {
        super(marka, model, kolor, rokProdukcji, przebieg);
        this.waga = waga;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.iloscOsob = iloscOsob;
    }

    public void opis() {
        super.opis();
        System.out.println("Waga: " + this.waga);
        System.out.println("Pojemnosc silnika: " + this.pojemnoscSilnika);
        System.out.println("Ilosc osob: " + this.iloscOsob);
    }
}
