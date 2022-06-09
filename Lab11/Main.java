package Lab11;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        //Zad. 1
        String path1 = "Zad1.txt";
        File plik1 = new File(path1);
        System.out.println("Moja sciezka: " + path1);

        PrintWriter zapis = new PrintWriter(path1);

        String tekst;
        System.out.println("Wprowadz swoj tekst(jesli chcesz zakonczyc strumien podaj '-'): ");
        do {
            tekst = input.nextLine();
            if (!tekst.equals("-")) {
                zapis.println(tekst);
            }
        } while (!tekst.equals("-"));

        zapis.close();


        //Zad. 2
        String path2 = "Zad2.txt";
        File plik2 = new File(path2);
        Scanner in2 = new Scanner(plik2);

        int counter = 0;
        while(in2.hasNextLine()) {
            String zdanie = in2.nextLine();
            System.out.println(zdanie);
            counter++;
        }

        System.out.println("Plik ma " + counter + " linii.");


        //Zad. 3
        String path3 = "Zad3.txt";
        int dzien, miesiac, rok;

        System.out.print("Podaj dzien urodzin: ");
        dzien = input.nextInt();
        System.out.print("Podaj miesiac urodzin: ");
        miesiac = input.nextInt();
        System.out.print("Podaj rok urodzin: ");
        rok = input.nextInt();

        DataOutputStream output = null;

        try {
            output = new DataOutputStream(new FileOutputStream(path3));
            output.writeInt(dzien);
            output.writeInt(miesiac);
            output.writeInt(rok);
        } catch (IOException e) {
            System.out.println("Pojawia sie wyjatek");
        } finally {
            if (output != null) {
                output.close();
            }
        }


        //Zad. 4
        String path4 = "";
        System.out.print("Podaj sciezke do pliku binarnego: ");
        path4 = input.next();

        int[] liczby = new int[3];
        DataInputStream czytanie = null;

        try {
            czytanie = new DataInputStream(new FileInputStream(path4));

            for (int i=0; i<3;i++) {
                liczby[i] = czytanie.readInt();
            }

            for (int element : liczby) {
                System.out.println(element);
            }

        } catch (IOException e) {
            System.out.println("Pojawia sie wyjatek.");
        } finally {
            if (czytanie != null) {
                czytanie.close();
            }
        }

    }
}
