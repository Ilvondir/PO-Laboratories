package Lab3;

import java.util.Scanner;

public class Ex1 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadz liczbe studentow: ");
        int students = input.nextInt();
         if (students != 0) System.out.println("Srednia studentow to: " + exam(students));
         else System.out.println("Brak danych");
    }

    public static double exam(int students) {
        Scanner input = new Scanner(System.in);
        int i = 0, sum = 0, temp;

        while (i<students) {
            System.out.print("Wpisz wynik " + (i+1) + ". studenta: ");
            temp = input.nextInt();
            if (temp>=0 && temp<=50) {
                sum += temp;
            } else continue;
            i++;
        }
        return (sum/(double)students);
    }
}
