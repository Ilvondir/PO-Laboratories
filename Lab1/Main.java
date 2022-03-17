package Lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n\nEfekt dzialania zad. 1:");
        ja();


        System.out.println("\n\nEfekt dzialania zad. 2:");

        System.out.print("Podaj 1. liczbe: ");
        double liczba1 = input.nextDouble();
        System.out.print("Podaj 2. liczbe: ");
        double liczba2 = input.nextDouble();
        wyniki(liczba1, liczba2);


        System.out.println("\n\nEfekt dzialania zad. 3:");

        System.out.print("Podaj liczbe: ");
        int liczba = input.nextInt();
        System.out.println("Czy liczba " + liczba + " jest parzysta?");
        System.out.println(parzystosc(liczba));


        System.out.println("\n\nEfekt dzialania zad. 4:");

        System.out.print("Podaj liczbe: ");
        liczba = input.nextInt();
        System.out.println("Czy liczba " + liczba + " jest podzielna przez 3 i 5?");
        System.out.println(podzielnosc(liczba));


        System.out.println("\n\nEfekt dzialania zad. 5:");

        System.out.print("Podaj liczbe: ");
        liczba1 = input.nextDouble();
        System.out.println(liczba1 + "^3 = " + potega(liczba1));


        System.out.println("\n\nEfekt dzialania zad. 6:");

        System.out.print("Podaj liczbe: ");
        liczba1 = input.nextDouble();
        System.out.println(liczba1 + "^(1/2) = " + pierwiastek(liczba1));


        System.out.println("\n\nEfekt dzialania zad. 7:");

        System.out.print("Wprowadz 1. bok: ");
        double a = input.nextDouble();
        System.out.print("Wprowadz 2. bok: ");
        double b = input.nextDouble();
        System.out.print("Wprowadz 3. bok: ");
        double c = input.nextDouble();
        System.out.println("Czy z bokow " + a + ", " + b + " oraz " + c + " mozna zbudowac trojkat prostokatny?");
        System.out.println(trojkat(a,b,c));
    }

    public static void ja() {
        Scanner input1 = new Scanner(System.in);

        System.out.print("Podaj swoje imie: ");
        String imie = input1.nextLine();
        System.out.print("Podaj swoj wiek: ");
        int wiek = input1.nextInt();
        System.out.println("Imie: " + imie + "\nWiek: " + wiek);
    }

    public static void wyniki(double liczba1, double liczba2) {
        System.out.println("Suma: " + (liczba1 + liczba2));
        System.out.println("Roznica: " + (liczba1 - liczba2));
        System.out.println("Iloczyn: " + (liczba1 * liczba2));
    }

    public static boolean parzystosc(int liczba) {
        return (liczba % 2 == 0);
    }

    public static boolean podzielnosc(int liczba) {
        return (liczba % 5 == 0 && liczba % 3 == 0);
    }

    public static double potega(double liczba1) {
        return Math.pow(liczba1, 3);
    }

    public static double pierwiastek(double liczba1) {
        return Math.sqrt(liczba1);
    }

    public static boolean trojkat(double a, double b, double c) {

        double max, a1, b1;

        if (a > b) {
            if (a > c) {
                a1 = b; b1 = c; max = a;
            } else {
                a1 = a; b1 = b; max = c;
            }
        } else {
            if (b > c) {
                a1 = a; b1 = c; max = b;
            } else {
                a1 = a; b1 = b; max = c;
            }
        }

        return (Math.pow(a1,2) + Math.pow(b1,2) == Math.pow(max,2));
    }
}
