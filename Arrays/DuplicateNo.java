/*
this program is to find the duplicate number in an array  for this i used hashset 

timecomplexity:o(n)
spacecomplexity:o(n)    

*/

import java.util.HashSet;
public class DuplicateNo {
    public static void duplicateno(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr){
            if(set.contains(i)){
                System.out.println("duplicate element is: " +i);
            }
            set.add(i);
        }

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
        duplicateno(arr);
    }
}
