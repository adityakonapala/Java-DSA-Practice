package Strings;

import java.util.Scanner;

public class ReverseWordsInString {
    public static String reverse(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();

        // reverse a Word in a string

        String words[] = str.split(" ");
        String rev = "";

        for (int i = 0; i < words.length; i++) {
            rev += reverse(words[i]);
            rev += " ";
        }

        System.out.println(rev);
        sc.close();
    }
}
