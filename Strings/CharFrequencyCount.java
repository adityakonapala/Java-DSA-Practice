package Strings;
import java.util.*;
public class CharFrequencyCount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashMap<Character,Integer> map = new HashMap<>();
        System.out.println("Enter the String:");
        String str=sc.nextLine();

        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch: map.keySet()){
            System.out.println(ch+"->"+map.get(ch));
        }

        System.out.println(map);

        sc.close();
    }
}
