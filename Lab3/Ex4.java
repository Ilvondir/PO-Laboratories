package Lab3;

import java.util.*;

public class Ex4 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Wprowadz n: ");
            n = input.nextInt();
        } while (n<0);
        if (n==0) System.out.println("Brak danych");
        else System.out.println("Suma liczb parzystych: " + random(n));
    }

    public static int random(int n) {
        Random rand = new Random();
        int num, sum = 0;
        while (n!=0) {
            num = rand.nextInt(56)-10;
            if (num%2==0) sum += num;
            n--;
        }
        return sum;
    }
}
