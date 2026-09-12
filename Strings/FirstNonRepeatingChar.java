package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        

        //First repeating characters 

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()){
          map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch : str.toCharArray()){
          if(map.get(ch)==1){
            System.out.println("First non repeating cha is "+ch);
            break;
          }
        }

        sc.close();
    }
}
