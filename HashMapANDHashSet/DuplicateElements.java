import java.util.HashSet;

public class DuplicateElements {
    public static void main(String[] args) {
        
        int arr[]={2,9,0,2,3,5,9,0,4,4};

        HashSet<Integer> set =  new HashSet<>();

        for(int i: arr){
            if(set.contains(i)){
               
                System.out.println(i);
            }
            set.add(i);
        }
    }
}
