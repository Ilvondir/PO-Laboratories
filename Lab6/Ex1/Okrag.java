package Ex1;

public class Okrag extends Figura {
    Punkt srodek;
    double promien;

    public Okrag() {
        this.srodek.setX(0);
        this.srodek.setY(0);
        this.promien = 0;
    }

    public Okrag(Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }

    public double getPowierzchnia() {
        return (Math.PI * Math.pow(this.promien, 2));
    }

    public double getSrednica() {
        return (2 * this.promien);
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    public boolean wSrodku(Punkt punkt) {
        boolean stan = Math.pow(this.srodek.x - punkt.x,2) + Math.pow(this.srodek.y - punkt.y,2) <= Math.pow(this.promien,2);
        return stan;
    }

    public String opis() {
        return "Klasa Okrag. Kolor obiektu: " + kolor;
    }
}
