public class ContainerWithMostWater2 {
    public static void main(String[] args) {
        // container with most water

        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        int left = 0, right = arr.length - 1;
        int max = 0;

        while (left < right) {
            int h = Math.min(arr[left], arr[right]);

            int width = right - left;

            int area = h * width;

            max = Math.max(max, area);
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(max);

    }
}
