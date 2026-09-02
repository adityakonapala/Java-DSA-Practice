
/* This is a Java program to find the missing number in an array of integers from 1 to n. 
   
timecomplexity:o(n)
spacecomplexity:o(1)

*/
public class MissingNo {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 7, 8 };

        int n = arr.length + 1;

        int actualSum = n * (n + 1) / 2;
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        System.out.println("missing number is:" + (actualSum - sum));
    }
}
