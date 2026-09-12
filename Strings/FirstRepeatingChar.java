package Strings;

import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatingChar {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        

        //First repeating characters 

        HashSet<Character> set = new HashSet<>();

        for(char ch : str.toCharArray()){
          if(set.contains(ch)){
            System.out.println(ch);
            break;
          }
          set.add(ch);
        }

        sc.close();
    }
}
