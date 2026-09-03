class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int arr[]={1,3,5,7};
        int brr[]={2,4,6,8};

        int crr[]=new int[arr.length+brr.length];

        int i=0,j=0,k=0;

        while(i<arr.length && j<brr.length){
            if(arr[i]<brr[j]){
                crr[k]=arr[i];
                i++;
                k++;
            }else{
                crr[k]=brr[j];
                j++;
                k++;
            }
        }
        while(i<arr.length){
            crr[k++]=arr[i++];
        }
        while(j<brr.length){
            crr[k++]=brr[j++];
        }
        System.out.println("Merged Array: ");
        for(int element :crr){
            System.out.print(element+" ");
        }
    }
}