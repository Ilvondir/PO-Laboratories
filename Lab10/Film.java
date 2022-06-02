package Lab10;

public class Film {
    int czasTrwania;
    String tytul;
    boolean czyObejrzany;

    public Film(String tytul, int czasTrwania, boolean czyObejrzany) {
        this.czasTrwania = czasTrwania;
        this.tytul = tytul;
        this.czyObejrzany = czyObejrzany;
    }

    public int getCzasTrwania() {
        return czasTrwania;
    }

    public void setCzasTrwania(int czasTrwania) {
        this.czasTrwania = czasTrwania;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public boolean isCzyObejrzany() {
        return czyObejrzany;
    }

    public void setCzyObejrzany(boolean czyObejrzany) {
        this.czyObejrzany = czyObejrzany;
    }

    public void info() {
        System.out.println("Tytul: " + this.tytul);
        System.out.println("Czas trwania: " + this.czasTrwania + " min");
        System.out.println("Czy obejrzany?: " + this.czyObejrzany);

    }
}
