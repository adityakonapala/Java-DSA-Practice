public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        int key=9;

        int left=0,sum=0;

        for(int right=0;right<arr.length;right++){
            sum+=arr[right];

            while(sum>key && left<=right){
                sum-=arr[left];
                left++; 

            }

            if(sum==key){
                for(int i=left;i<=right;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
}
