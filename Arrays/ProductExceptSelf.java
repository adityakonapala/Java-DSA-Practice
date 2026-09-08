class ProductExceptSelf{
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int res[]=new int [arr.length];

        res[0]=1;

        for(int i=1;i<arr.length;i++){
            res[i]=res[i-1]*arr[i-1];
        }

        int right=1;

        for(int i=arr.length-1;i>=0;i--){
            res[i]=res[i]*right;
            right=right*arr[i];
        }
        //display the result
        System.out.println("Result:");
        for(int i: res){
            System.out.print(i+" ");
        }
    }
}   