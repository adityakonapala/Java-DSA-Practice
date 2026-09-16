class TwoSum_Sorted_Array{
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9};
        int target=10;

        int left=0,right=arr.length-1;

        while(left<right){
            int sum= arr[left]+arr[right];

            if(sum==target){
                System.out.println(left+" "+right);
                left++;
                right--;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
    }
}