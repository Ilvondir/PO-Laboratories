package Inne;

import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int target = rand.nextInt(100) + 1;

        int shoot, counter = 0;

        do {
            counter++;
            System.out.print("Wpisz strzal od 1 do 100: ");
            shoot = input.nextInt();

            if (shoot > target) System.out.println("Twoja liczba jest za duza.");
            else if (shoot < target) System.out.println("Twoja liczba jest za mala.");
        } while (shoot != target);

        if (counter == 1) System.out.println("Wspanialy strzal! Zgadles za pierwszym razem!");
        else if (counter < 7) System.out.println("Dobra robota! Zgadles za " + counter + " razem.");
        else System.out.println("Moglo byc lepiej. Zgadles za " + counter + " razem.");
    }
}