/*
This is basic array problem to find the largest element in the array.

time complexity: O(n)
space complexity: O(1)

*/


public class LargestElement {
    public static void main(String[] args) {
        
        int arr[]={10, 20, 30, 40, 50};
        int max=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }

            // max=Math.max(max,i);  // This is another way to find the largest element in the array
        }
        System.out.println("The largest element in the array is: " + max);  
    }
}
