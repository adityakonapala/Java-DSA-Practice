public class SortArraywith012 {
    public static void main(String[] args) {
     int arr[]={1,0,2,1,2,0,1,2,0};
    
    //but this approach take O(n2) time complexity

        // for(int i=0;i<arr.length-1;i++){ 
        //  for(int j=i+1;j<arr.length;j++){
        //    if(arr[i]>arr[j]){
        //     int temp=arr[i];
        //     arr[i]=arr[j];
        //     arr[j]=temp;
        //   }
        //  }
        // }

    //  in this the timecomplexity is O(n)
    int st=0;
    int mid=0;
    int end=arr.length-1;

    while(mid<=end){

      if(arr[mid]==0){
        int temp = arr[st];
        arr[st]=arr[mid];
        arr[mid]=temp;
        st++;
        mid++;
      }

      else if(arr[mid]==1){
        mid++;
      }
      else{
        int temp=arr[end];
        arr[end]=arr[mid];
        arr[mid]=temp;
        end--;
      }
    }

        for(int i:arr){
          System.out.print(i+" ");
        }
    }
}
