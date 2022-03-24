package Lab3;

import java.util.Scanner;

public class Ex2 {
    public static void counter() {
        Scanner input = new Scanner(System.in);
        int positive = 0, negative = 0;
        double positive_sum = 0, negative_sum = 0, number;

        for (int i=0;i<10;i++) {
            System.out.print("Wprowadz " + (i+1) + ". liczbe: ");
            number = input.nextDouble();
            if (number>=0) {
                positive++;
                positive_sum += number;
            } else {
                negative++;
                negative_sum += number;
            }
        }
        System.out.println("Liczba dodatnich: " + positive + "; Suma dodatnich: " + positive_sum);
        System.out.println("Liczba ujemnych: " + negative + "; Suma ujemnych: " + negative_sum);
    }
}
