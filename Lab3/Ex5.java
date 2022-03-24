package Lab3;

import java.util.Scanner;

public class Ex5 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadz swoj wyraz: ");
        String word = input.nextLine();

        System.out.println("Czy wyraz \"" + word + "\" jest palindromem?");
        System.out.println(palindrome(word));
    }

    public static boolean palindrome(String word) {
        for (int i=0;i<word.length()/2;i++) {
            if (word.charAt(i) != word.charAt(word.length()-1-i)) return false;
        }
        return true;
    }

    public static boolean palindrome(long word) {
        return palindrome(Long.toString(word));
    }
}
