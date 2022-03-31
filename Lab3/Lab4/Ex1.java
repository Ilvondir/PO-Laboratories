package Lab4;

public class Ex1 {
    public static void main() {
        int n;
        do {
            System.out.print("Podaj wielkosc tablicy: ");
            n = Inputs.input(1);
        } while (n<=0);

        double[] tab = new double[n];

        for(int i=0;i<n;i++) {
            System.out.print("Wprowadz " + (i+1) + ". rekord tabeli: ");
            tab[i] = Inputs.input(1.1);
        }

        meanFor(tab, n);
        meanForEach(tab, n);
    }

    public static void meanFor(double[] tab, int n) {
        double sum = 0;
        for (int i=0;i<n;i++) {
            sum += tab[i];
        }
        double mean = sum/n;

        System.out.println("Suma z petli for: " + sum);
        System.out.println("Srednia z petli for: " + mean);
    }

    public static void meanForEach(double[] tab, int n) {
        double sum = 0;

        for (double number : tab) {
            sum += number;
        }

        double mean = sum/n;

        System.out.println("Suma z petli for each: " + sum);
        System.out.println("Srednia z petli for each: " + mean);
    }
}