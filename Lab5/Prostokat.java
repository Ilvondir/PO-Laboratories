package Lab5;

public class Prostokat {
    double dlugosc, szerokosc;

    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public double obwod() {
        return (2*this.dlugosc + 2*this.szerokosc);
    }

    public double pole() {
        return (this.dlugosc * this.szerokosc);
    }

    public double przekatna() {
        return (Math.sqrt(Math.pow(this.dlugosc,2) + Math.pow(this.szerokosc,2)));
    }
}
