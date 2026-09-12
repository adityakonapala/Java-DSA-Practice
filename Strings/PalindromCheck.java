package Strings;

import java.util.Scanner;

public class PalindromCheck {
    public static void main(String[] args) {
        // palindrom

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String=");
        String str = sc.nextLine();

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (rev.equals(str)) {
            System.out.println("palindroms");
        } else {
            System.out.println("not a palindrom ");
        }

        sc.close();
    }
}
