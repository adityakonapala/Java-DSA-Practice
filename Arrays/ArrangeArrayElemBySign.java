public class ArrangeArrayElemBySign {
     public static void main(String[] args) {

     // re arrange array elements by sign

        int arr[]={-1,3,4,-2,0,-5};

        int positiveIndex=0;
        int negindex=1;

        int res[]=new int[arr.length];

        for(int i =0;i<arr.length;i++){
           if(arr[i]>=0){
            res[positiveIndex]=arr[i];
            positiveIndex+=2;
           }else{
            res[negindex]=arr[i];
            negindex+=2;
           }
        }

        for(int i:res){
          System.out.print(i+" ");
        }
     
    }
}
