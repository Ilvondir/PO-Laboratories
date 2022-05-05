package Lekcja;

public class Wieloryb extends Ryba implements Plywanie {

    String imie;

    public Wieloryb(String imie) {
        this.imie = imie;
    }

    @Override
    public void zanurz() {
        System.out.println(this.imie + " zanurza sie pod Helem.");
    }

    @Override
    public void plyn() {
        System.out.println(this.imie + " plywa po morzach i oceanach");
    }

    @Override
    public void wynurz() {
        System.out.println(this.imie + " wynurza sie.");
    }

    @Override
    void jedz() {
        System.out.println(this.imie + " je male rybki.");
    }

    @Override
    void wydalaj() {
        System.out.println(this.imie + " wydala sie do oceanu.");
    }
}
