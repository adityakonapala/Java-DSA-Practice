package Strings;
import java.util.*;
public class LongestSubStringWithOutRepeatChar {
    public static void main(String[] args) {
        String str ="abcdadcsa";

        HashSet<Character> set = new HashSet<>();

        int left=0;int max=0;

        for(int right=0;right<str.length();right++){

            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }
            max= Math.max(max,right-left+1);

            set.add(str.charAt(right));

        }
        System.out.println(max);

    }
}
