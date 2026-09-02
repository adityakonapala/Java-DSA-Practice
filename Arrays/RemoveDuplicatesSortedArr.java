/*
Remove Duplicates from Sorted Array
In this program, we will remove duplicates from a sorted array in place.

We will use two pointers to keep track of the current element and the next unique element in the array.

time complexity of this algorithm is O(n)

space complexity is O(1) 
*/

public class RemoveDuplicatesSortedArr {

    public static int removeduplicates(int arr[]){
        int j=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[j]=arr[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int arr[] = { 0,0,1,1,3,3,6,6,9,9 };

       int len = removeduplicates(arr);

       for(int i=0;i<len;i++){
        System.out.print(arr[i]+" , ");
       }
    }
}
