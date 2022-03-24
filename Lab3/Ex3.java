package Lab3;

import java.util.Scanner;

public class Ex3 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Wprowadz n: ");
            n = input.nextInt();
        } while (n<0);

        if (n==0) System.out.println("Brak danych");
        else System.out.println("Suma liczb parzystych: " + sequence(n));
    }

    public static double sequence(int n) {
        Scanner input = new Scanner(System.in);
        double sum = 0, num;
        while (n!=0) {
            System.out.print("Wprowadz kolejny wyraz ciagu: ");
            num = input.nextDouble();

            if (num % 2 == 0) {
                sum += num;
            }

            n--;
        }
        return sum;
    }
}
