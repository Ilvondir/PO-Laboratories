package Lab2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n\nEfekt dzialania zad. 1:");

        double a, b, c;
        System.out.print("Wprowadz a: ");
        a = input.nextDouble();
        System.out.print("Wprowadz b: ");
        b = input.nextDouble();
        System.out.print("Wprowadz c: ");
        c = input.nextDouble();
        equation(a, b, c);


        System.out.println("\n\nEfekt dzialania zad. 2:");

        System.out.print("Wprowadz x: ");
        double x = input.nextDouble();
        System.out.println("Podpunkt a: " + a2(x));
        System.out.println("Podpunkt b: " + b2(x));
        System.out.println("Podpunkt c: " + c2(x));


        System.out.println("\n\nEfekt dzialania zad. 3:");

        System.out.print("Wprowadz x: ");
        x = input.nextDouble();
        System.out.print("Wprowadz y: ");
        double y = input.nextDouble();
        System.out.print("Wprowadz z: ");
        double z = input.nextDouble();
        sort(x,y,z);


        System.out.println("\n\nEfekt dzialania zad. 4:");

        System.out.print("Czy pada deszcz? ");
        boolean rain = input.nextBoolean();
        System.out.print("Czy jest autobus? ");
        boolean bus = input.nextBoolean();
        academy(rain, bus);


        System.out.println("\n\nEfekt dzialania zad. 5:");

        System.out.print("Czy jest znizka? ");
        boolean discount = input.nextBoolean();
        System.out.print("Czy otrzymales podwyzke? ");
        boolean raise = input.nextBoolean();
        auto(discount, raise);


        System.out.println("\n\nEfekt dzialania zad. 6:");

        System.out.print("Wprowadz pierwsza liczbe: ");
        double first = input.nextDouble();
        System.out.print("Wprowadz znak(+, -, *, /, %): ");
        char sign = input.next().charAt(0);
        System.out.print("Wprowadz druga liczbe: ");
        double second = input.nextDouble();
        System.out.println("Wynik to: " + calculator(first, sign, second));
    }

    public static void equation(double a, double b, double c) {
        if (a==0) System.out.println("To nie jest rownanie kwadratowe!");
        else {
            System.out.println("Rownanie: " + a + "x^2 + " + b + "x + " + c + " = 0");
            double delta = (b*b) - 4*a*c;

            if (delta<0) System.out.println("Rozwiazania tego rownania sa w zbiorze liczb zespolonych.");
            if (delta==0) System.out.println("Rownanie ma jedno rozwiazanie rzeczywiste: " + (-b/2*a));
            if (delta>0) {
                double square = Math.pow(delta, 0.5);
                System.out.println("Rownanie ma dwa rozwiazania rzeczywiste: " + ((-b+square)/(2*a)) + " oraz " + ((-b-square)/(2*a)));
            }
        }
    }

    public static double a2(double x) {
        if (x>0) return (2*x);
        if (x<0) return (-3*x);
        return 0;
    }

    public static double b2(double x) {
        if (x>=1) return (Math.pow(x,2));
        return x;
    }

    public static double c2(double x) {
        if (x>2) return (2+x);
        if (x<2) return (x-4);
        return 8;
    }

    public static void sort(double x, double y, double z) {

        double min, mean, max;

        if (x>=y && x>=z) {
            max = x;
            if (z>=y) {
                min = y; mean = z;
            } else {
                min = z; mean = y;
            }
        } else if (y>=x && y>=z) {
            max = y;
            if (x >= z) {
                min = z; mean = x;
            } else {
                min = x; mean = z;
            }
        } else {
            max = z;
            if (x >= y) {
                min = y; mean = x;
            } else {
                min = x; mean = y;
            }
        }
        System.out.println("Zmienne posortowane: " + min + ", " + mean + ", " + max);
    }

    public static void academy(boolean rain, boolean bus) {
        if (rain && bus) System.out.println("Wez parasol. Dostaniesz sie na uczelnie.");
        if (rain && !(bus)) System.out.println("Nie dostaniesz sie na uczelnie.");
        if (!(rain) && bus) System.out.println("Dostaniesz sie na uczelnie. Milego dnia i pieknej pogody.");
    }

    public static void auto(boolean discount, boolean raise) {
        if (!(discount)) {
            if (raise) System.out.println("Mozesz kupic samochod! Znizki na samochod nie ma.");
            else System.out.println("Zakup samochodu trzeba odlozyc na pozniej... Znizki na samochod nie ma.");
        } else {
            if (raise) System.out.println("Mozesz kupic samochod!");
        }
    }

    public static double calculator(double first, char sign, double second) {
        switch (sign) {
            case '+':
                return (first+second);
            case '-':
                return (first-second);
            case '*':
                return (first*second);
            case '/':
                return (first/second);
            case '%':
                return (first%second);
            default:
                return 0;
        }
    }
}