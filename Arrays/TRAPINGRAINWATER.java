import java.util.*;
class TRAPINGRAINWATER{
    public static void TrapingRainWater(int a[]){
        if(a.length<3){
            System.out.println("water traped is 0 units");
        }
        
        // left max array
        int leftmax[]=new int[a.length];
        leftmax[0]=a[0];
        for(int i=1;i<a.length;i++){
            leftmax[i]=Math.max(leftmax[i-1],a[i]);
        }
        //right max array
         int rightmax[]=new int[a.length];
         rightmax[a.length-1]=a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],a[i]);
        }
        // traped rain water calculation
        int width=1;
        int water=0;
        int trapedrainwater=0;
        
        for(int i=0;i<a.length;i++){
          water=Math.min(leftmax[i],rightmax[i]);
          trapedrainwater+= (water-a[i])*width;
        }
         System.out.println("rain water traped is "+trapedrainwater);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements into the array :");
        int a[] = new int[6];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        sc.close();
        TrapingRainWater(a);
    }
}