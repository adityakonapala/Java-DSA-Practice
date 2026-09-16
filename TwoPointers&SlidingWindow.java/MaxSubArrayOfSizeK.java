public class MaxSubArrayOfSizeK {
    public static void main(String[] args) {
        int arr[]={2,1,8,8,0,7,2,9};

        int k=3; //window lenght=3

        int windowsum=0;

        for(int i=0;i<k;i++){
            windowsum+=arr[i];
        }

        int max= windowsum;

        for(int j=k;j<arr.length;j++){
           windowsum= windowsum+ arr[j]-arr[j-k];

           max=Math.max(max,windowsum);
        }

        System.out.println(max);


    }
}
