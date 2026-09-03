public class ReverseAnArray {
    public static void main(String[] args) {
          int arr[]={1,2,3,4,5,6,7,8,9};

     int st=0;
     int end=arr.length-1;
     while(st<end){
      int temp=arr[st];
      arr[st]=arr[end];
      arr[end]=temp;
      st++;
      end--;
     }

      //print 

      for(int f: arr){
        System.out.print(f+" ");
      }
    }
}
