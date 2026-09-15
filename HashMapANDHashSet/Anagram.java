import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch:str1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }

        for(char ch : str2.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
            }

            if(map.get(ch)==0){
                map.remove(ch);
            }
        }

        if(map.isEmpty()){
            System.out.println("Strings are anagrams ");
        }else{
            System.out.println("Strings are not anagrams");
        }
    }
}
