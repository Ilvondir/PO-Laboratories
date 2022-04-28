package Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Wpisz swoje imie: ");
        String imie = input.nextLine();
        System.out.print("Wpisz swoje nazwisko: ");
        String nazwisko = input.nextLine();
        System.out.print("Wpisz swoj wiek: ");
        int wiek = input.nextInt();

        Klient ty = new Klient(imie, nazwisko, wiek);
        ty.jestem();

        System.out.println("\nWprowadź dane ulubionego autora!");
        System.out.print("Wpisz imie autora: ");
        String imieAutora = input.next();
        System.out.print("i jego nazwisko: ");
        String nazwiskoAutora = input.next();

        Osoba autor = new Osoba(imieAutora, nazwiskoAutora);
        Powiesc pow1 = new Powiesc("7 Wonders", autor, 99.22, "Historyczne");
        pow1.informacje();

        Ksiegarnia ks1 = new Ksiegarnia((Osoba) ty, "Aleje Kasprowe 5", pow1);

        System.out.println("\nDane ogolne ksiegarni:");
        ks1.informacjeOgolne();

        System.out.println("\nReklama Twojej ksiegarni:");
        ks1.reklama();
    }
}
