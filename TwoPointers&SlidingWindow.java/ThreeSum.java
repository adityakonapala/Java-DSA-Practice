import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {

        int arr[] = { -1, 0, 1, 2, -1, -4 };
        int target = 0;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {

            // Skip duplicate i
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i+1, right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);

                    left++;
                    right--;

                  
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
    }
}
