package Lab9;

import java.util.Objects;

public class Uczestnik {
    int ID, wiek;
    String imie;

    public Uczestnik(int ID, String imie, int wiek) {
        this.ID = ID;
        this.wiek = wiek;
        this.imie = imie;
    }

    public String toString() {
        return ("Imie: " + this.imie + "\nWiek: " + this.wiek + "\nID: " + this.ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczestnik uczestnik = (Uczestnik) o;
        return ID == uczestnik.ID && wiek == uczestnik.wiek && imie.equals(uczestnik.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, wiek, imie);
    }
}
