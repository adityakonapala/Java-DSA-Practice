/*

This is a basic array problem to find the second largest element in the array.

time complexity: O(n)
space complexity: O(1)
  
but what i found intersting is the else if condition it is very inmortent to pass all the test cases 

else if(i>seclargest && i!=largest) // i felt this is importent 

*/

public class SecondLargestElement {
    public static void main(String[] args) {
        
        int arr[]={10, 20, 4, 45, 99};
        int largest=arr[0];
        int seclargest=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>largest){
                seclargest=largest;
                largest=i;
            }
            else if(i>seclargest && i!=largest){
                seclargest=i;
            }
        }
        System.out.println("The second largest element in the array is: " + seclargest);
    }
}
