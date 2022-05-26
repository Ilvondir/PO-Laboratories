package Lab9;

public class Rasa {
    String nazwa, pochodzenie;
    int sredniWzrost;

    public Rasa(String nazwa, String pochodzenie, int sredniWzrost) {
        this.nazwa = nazwa;
        this.pochodzenie = pochodzenie;
        this.sredniWzrost = sredniWzrost;
    }

    public void opis() {
        System.out.println(this.nazwa + "/" + this.pochodzenie + "/" + this.sredniWzrost);
    }
}
