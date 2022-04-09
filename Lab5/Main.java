package Lab5;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("\n\nEfekt dzialania zad. 1:");

        double x, y;
        do {
            System.out.print("Wprowadz dlugosc prostokatu: ");
            x = input.nextDouble();
            System.out.print("Wprowadz szerokosc prostokatu: ");
            y = input.nextDouble();

            if (x<=0 || y<=0) System.out.println("Wprowadzono bledne dane.");
        } while (x<=0 || y<=0);

        Prostokat figura1 = new Prostokat(x,y);

        System.out.println("Obwod tego prostokatu: " + figura1.obwod());
        System.out.println("Pole tego prostokatu: " + figura1.pole());
        System.out.println("Przekatna tego prostokatu: " + figura1.przekatna());


        System.out.println("\n\nEfekt dzialania zad. 2:");

        Budynek BudynekUzytkownika = new Budynek();

        System.out.print("Wprowadz nazwe swego budynku: ");
        String nazwa = input.nextLine();
        BudynekUzytkownika.setNazwa(nazwa);

        System.out.print("Wprowadz date budowy swego budynku(YYYY-MM-DD): ");
        LocalDate data = LocalDate.parse(input.nextLine());
        BudynekUzytkownika.setRokBudowy(data);

        System.out.print("Wprowadz ilosc pieter swego budynku: ");
        int lp = input.nextInt();
        BudynekUzytkownika.setLiczbaPieter(lp);

        Budynek UR = new Budynek("Uniwersytet Rzeszowski", LocalDate.parse("2012-03-05"), 3);
        Budynek ZST = new Budynek("Zespol Szkol Technicznych", LocalDate.parse("1945-09-01"), 2);
        Budynek Wiezowiec = new Budynek("World Trade Center", LocalDate.parse("1999-12-11"), 30);

        UR.dane();
        System.out.println();
        ZST.dane();
        System.out.println();
        Wiezowiec.dane();
        System.out.println();
        BudynekUzytkownika.dane();
        System.out.print("Twoj budynek ma " + BudynekUzytkownika.zakresCzasu() + " lat.");


        System.out.println("\n\nEfekt dzialania zad. 3:");

        Gatunek gatunekUzytkownika = new Gatunek();

        System.out.print("Wprowadz nazwe rodzaju swego gatunku: ");
        String nazwaRodzaju = input.nextLine();
        gatunekUzytkownika.setNazwaRodzaju(nazwaRodzaju);

        System.out.print("Wprowadz nazwe gatunkowa swego gatunku: ");
        String nazwaGatunku = input.nextLine();
        gatunekUzytkownika.setNazwaGatunkowa(nazwaGatunku);

        System.out.print("Wprowadz diploidalna liczbe chromosomow(zawsze parzysta): ");
        int lc2n = input.nextInt();
        gatunekUzytkownika.setLiczbaChromosomow2n(lc2n);

        System.out.print("Wprowadz liczbe x chromosomow: ");
        int lcx = input.nextInt();
        gatunekUzytkownika.setLiczbaChromosomowx(lcx);

        System.out.println("Wprowadz opis swego gatunku: ");
        input.nextLine(); String opis = input.nextLine();
        gatunekUzytkownika.setOpis(opis);

        gatunekUzytkownika.nazwa();
        gatunekUzytkownika.haploidalneLiczbaChromosomow();
        gatunekUzytkownika.resztaDanych();

        System.out.println();

        Gatunek truskawka = new Gatunek("Truskawa", "Truskawkowe", 122, 4, "Owoc, ktory wielu z nas ma w swoich sadach.");
        truskawka.nazwa();
        truskawka.haploidalneLiczbaChromosomow();
        truskawka.resztaDanych();

        System.out.println();

        Gatunek gruszka = new Gatunek("Gruszka", "Gruszkowe", 12, 1, "Smaczny owoc, ktory rosnie na niskch krzewach.");
        gruszka.nazwa();
        gruszka.haploidalneLiczbaChromosomow();
        gruszka.resztaDanych();

        System.out.println();

        Gatunek nowyGatunek = gatunekUzytkownika.klonowanie(gatunekUzytkownika);
        nowyGatunek.nazwa();
        nowyGatunek.haploidalneLiczbaChromosomow();
        nowyGatunek.resztaDanych();
    }
}
