/*
    * Java Program to Reverse an Array
    * 
    * In this program, we will reverse an array using a while loop. 
    * 
    * We will swap the first and last elements of the array, then move towards the center of the array until we reach the middle.
    * 
    * The time complexity of this algorithm is O(n),
    * 
    * 
    * The space complexity is O(1) 
    *

*/

public class ReverseArray {
    public static void main(String[] args) {

        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            end--;
            st++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }

    }
}
