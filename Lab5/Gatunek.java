package Lab5;

public class Gatunek {

    String nazwaRodzaju, nazwaGatunkowa, opis;
    int liczbaChromosomow2n, liczbaChromosomowx;

    public Gatunek() {}

    public Gatunek(String nazwaRodzaju, String nazwaGatunkowa, int liczbaChromosomow2n, int liczbaChromosomowx, String opis) {
        this.nazwaRodzaju = nazwaRodzaju;
        this.nazwaGatunkowa = nazwaGatunkowa;
        this.opis = opis;
        this.liczbaChromosomow2n = liczbaChromosomow2n;
        this.liczbaChromosomowx = liczbaChromosomowx;
    }

    public void setNazwaRodzaju(String nazwaRodzaju) {
        this.nazwaRodzaju = nazwaRodzaju;
    }

    public void setNazwaGatunkowa(String nazwaGatunkowa) {
        this.nazwaGatunkowa = nazwaGatunkowa;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setLiczbaChromosomow2n(int liczbaChromosomow2n) {
        this.liczbaChromosomow2n = liczbaChromosomow2n;
    }

    public void setLiczbaChromosomowx(int liczbaChromosomowx) {
        this.liczbaChromosomowx = liczbaChromosomowx;
    }

    public void nazwa() {
        System.out.println(nazwaRodzaju + " " + nazwaGatunkowa);
    }

    public void haploidalneLiczbaChromosomow() {
        System.out.println("Haploidalna liczba chromosomow: " + liczbaChromosomow2n / 2);
    }

    public void resztaDanych() {
        System.out.println("Liczba x chromosomow: " + liczbaChromosomowx);
        System.out.println("Opis: " + opis);
    }

    public Gatunek klonowanie(Gatunek xyz) {
        return(xyz);
    }
}
