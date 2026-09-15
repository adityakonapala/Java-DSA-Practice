import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        int arr[]={2,8,1,2,4,3,9,0,4,0};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        System.out.println(map);
    }
}
