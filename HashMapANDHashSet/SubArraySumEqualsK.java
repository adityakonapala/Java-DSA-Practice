import java.util.HashMap;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,2};
        int key=3;
         
        int sum=0;
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        for(int i: arr){
           sum+=i;

           if(map.containsKey(sum-key)){
            count+=map.get(sum-key);    // we can use count++; but in some conditions it didn't work 
           }

           map.put(sum,map.getOrDefault(sum,0)+1);
        }

        System.out.println(count);
    }
}
