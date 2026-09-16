public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
        int target = 7;
        int arr[] = { 2, 3, 1, 2, 4, 3 };

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for(int right=0;right<arr.length;right++){
            sum+=arr[right];

            while(sum>=target){
                int len=right-left+1;
                minLength=Math.min(minLength,len);

                sum-=arr[left];
                left++;
            }
        }

        System.out.println(minLength);

    }
}
