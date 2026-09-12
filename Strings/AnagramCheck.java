package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1:");
        String str1 = sc.nextLine();
        System.out.println("Enter the String 2:");
        String str2=sc.nextLine();

        if(str1.length()!= str2.length()){
          System.out.println("not anagrams");
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : str1.toCharArray()){
          map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch :str2.toCharArray()){
            if(!map.containsKey(ch)){
                System.out.println("Not an Anagram ");
                break;
            }

            map.put(ch,map.get(ch)-1);

           if(map.get(ch)==0){
            map.remove(ch);
           }
        }

        if(map.isEmpty()){
            System.out.println("Anagrams");
        }else{
            System.out.println("not an anagram");
        }
        sc.close();
    }
}
