package Strings;

import java.util.*;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(char ch : str.toCharArray()){
            set.add(ch);
        }

        System.out.println(set);

    

        sc.close();

    }
}
