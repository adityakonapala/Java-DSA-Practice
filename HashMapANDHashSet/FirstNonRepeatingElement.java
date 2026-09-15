import java.util.HashMap;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        //For numbers 

        int arr[]={1,2,3,4,1,4};

        HashMap <Integer,Integer> map1 = new HashMap<>();

        for(int i:arr){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }

        for(int i:arr){
            if(map1.get(i)==1){
                System.out.println(i);
                break;
            }
        }


        //for string 

        String str ="swiss";

        HashMap <Character,Integer> map2 = new HashMap<>();

        for(char ch : str.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        for(char ch : str.toCharArray()){
            if(map2.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }


    }
}
