import java.util.HashMap;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {

        int[] arr = { 1,2,3,4 };
        int target = 5;

        HashMap<Integer,Integer> map = new HashMap<>();

        int count=0;
       
        for(int i: arr){
            int temp=target-i;

            if(map.containsKey(temp)){
                count+=map.get(temp);    // we can also write count++ but this work for all conditions 
            }

            map.put(i,map.getOrDefault(i, 0)+1);
        }

        System.out.println(count);

    }
}
