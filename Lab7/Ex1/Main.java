package Lekcja;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj typ samolotu: ");
        String samo = input.nextLine();

        Samolot boeing = new Samolot(samo);
        boeing.lec();
        System.out.println(boeing.getTyp());

        Statek jacht = new Statek("Jacht");
        jacht.plyn();
        System.out.println(jacht.getRodzaj());


    }
}
