import java.util.HashMap;

class TwoSum2{
    public static void main(String[] args) {
        
        int arr[]={3,8,9,2,1};
        int key=11;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int temp= key-arr[i];

            if(map.containsKey(temp)){
                System.out.println(map.get(temp)+" "+i);
            }
            map.put(arr[i],i);
        }

    }
}