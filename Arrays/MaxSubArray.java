/* This program is to find the maximum sum of a contiguous subarray in an array 
   
   In this program, we will implement the Kadane's algorithm to find the maximum sum of a contiguous subarray in an array. 

   The algorithm works by iterating through the array and keeping track of the maximum sum found so far and the current sum of the subarray.

   If the current sum becomes negative, we reset it to zero, as a negative sum would not contribute to a maximum sum in future iterations.
    
   timecomplexity is o(n) and space complexity is o(1)

*/
public class MaxSubArray {
    public static void maxsubarray(int arr[]) {
        int max = arr[0];
        int currentsum = arr[0];
        for (int i = 0; i < arr.length; i++) {

            currentsum += arr[i];
            if (currentsum < 0) {
                currentsum = 0;
            }
            max = Math.max(max, currentsum);
        }
        System.out.println("The maximum sum of the contiguous subarray is: " + max);
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        maxsubarray(arr);
    }

}
