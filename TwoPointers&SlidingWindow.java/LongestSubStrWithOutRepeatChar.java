
import java.util.HashSet;

public class LongestSubStrWithOutRepeatChar {
    public static void main(String[] args) {
        //longest Sub String without repeating charachers

        String str ="abcdadca";

        int max=0;
        int left=0;

        HashSet<Character> set = new HashSet<>();

        for(int right=0;right<str.length();right++){

            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));
            max=Math.max(max,right-left+1);
        }

        System.out.println(max);

        
    }
}
