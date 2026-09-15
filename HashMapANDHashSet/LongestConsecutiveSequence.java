
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        
        int arr[]={100,99,4,88,1,2,3,5};

        HashSet<Integer> set = new HashSet<>();
        int max=0;

        for(int i: arr){
            set.add(i);
        }

        for(int i: arr){
           // current element is starting element 
            if(!set.contains(i-1)){
                
                int current =i;
                int count=1;

                while(set.contains(current+1)){
                    count++;
                    current++;
                }
                  max=Math.max(max,count);
            }

        }
        System.out.println(max);
    }
}
