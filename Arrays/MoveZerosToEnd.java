/*
this is a Java program that moves all zeros in an array to the end while maintaining the order of non-zero elements.


 The `moveZerosToEnd` method iterates through the array, and whenever it encounters a non-zero element

 it swaps it with the element at index `j`, which keeps track of the position for the next non-zero element. 

 After processing the entire array, all zeros will be moved to the end.

 timecomplexity:o(n)
 spacecomplexity:o(1)
*/
public class MoveZerosToEnd {
    public static void moveZerosToEnd(int arr[]){
         int j=0;
         for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
         }
         
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        moveZerosToEnd(arr);
        System.out.println("Array after moving zeros to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
