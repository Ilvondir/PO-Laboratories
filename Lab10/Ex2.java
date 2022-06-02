package Lab10;

public class Ex2 {
    public static void main() {
        kolejkiCommand zadanie2 = new kolejkiCommand();
        var kolejka = zadanie2.dodanie();

        konsumowanieKolejki konsumpcja = new konsumowanieKolejki(kolejka);
        konsumpcja.konsumowanie();
    }
}
