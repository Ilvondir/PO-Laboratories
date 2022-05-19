package Lab8;

import java.util.InputMismatchException;
import java.util.Scanner;

class BlednaWartoscDlaSilniException extends Exception {
    public BlednaWartoscDlaSilniException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) throws BlednaWartoscDlaSilniException, NieprawidlowyAdresException {
	    Scanner input = new Scanner(System.in);
        System.out.print("Wprowadz liczbe: ");
        double liczba;

        while(true) {
            try {
                liczba = input.nextDouble();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Podaj poprawna liczbe: ");
                input.next();
            }
        }

        if (liczba < 0) {
            throw new IllegalArgumentException(String.format("Pierwiastek kwadratowy z liczby rzeczywistej %.4f nie istnieje", liczba));
        }

        System.out.println(String.format("Pierwiastek z %.4f to %.4f", liczba, Math.sqrt(liczba)));

        //Zad. 2
        System.out.print("Podaj liczbe: ");
        int n;
        n = input.nextInt();
        System.out.println("Silnia tej liczby: " + silnia(n));

        //Zad. 3
        Adres domek = new Adres(null, null, null, -9);
    }

    public static int silnia(int n) throws BlednaWartoscDlaSilniException {

        if (n < 0) throw new BlednaWartoscDlaSilniException("Nie ma tradycyjnej silnii z " + n);

        int silnia = 1;

        for(int i=1;i<=n;i++) {
            silnia *= i;
        }

        return silnia;
    }

}
