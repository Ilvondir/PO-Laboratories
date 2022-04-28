package Ex1;

public class Kwadrat extends Prostokat {

    double wys, szer;
    String kolor;

    public Kwadrat(double bok, String kolor) {
        super(kolor);
        this.szer = bok;
        this.wys = this.szer;
    }

    public double getWys() {
        return wys;
    }

    public void setWys(double wys) {
        this.wys = wys;
    }

    public double getSzer() {
        return szer;
    }

    public void setSzer(double szer) {
        this.szer = szer;
    }

    public String opis() {
        return "Klasa Kwadrat. Kolor obiektu: " + kolor;
    }
}
