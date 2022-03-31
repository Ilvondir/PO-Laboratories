package Lab4;

public class Ex3 {
    public static void main() {
        int l;
        do {
            System.out.print("Wprowadz dlugosc tabeli: ");
            l = Inputs.input(1);
        } while (l<=0);

        double[] tab = new double[l];

        for (int i=0;i<l;i++) {
            System.out.print("Wprowadz kolejny rekord tabeli: ");
            tab[i] = Inputs.input(1.1);
        }

        System.out.println("Wariancja z podanych liczb: " + variance(tab, l));
    }

    public static double variance(double[] tab, int l) {
        double sum = 0, mean, variance = 0;
        for (double elem : tab) sum += elem;

        mean = sum/l;

        for (double elem : tab) variance += Math.pow(elem - mean,2);

        return (variance/(l-1));
    }
}
