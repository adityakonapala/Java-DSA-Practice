import java.util.HashMap;
public class TwoSum {
    public static void twoSum(int arr[],int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int temp = target-arr[i];
            if(map.containsKey(temp)){
                System.out.println(map.get(temp)+" " + i);
            }
            map.put(arr[i],i);
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {2, 7, 11, 15};
        int target = 18;
        twoSum(arr, target);
    }
}
