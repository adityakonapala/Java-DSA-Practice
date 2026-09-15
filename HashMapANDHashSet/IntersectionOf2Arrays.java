import java.util.HashMap;

public class IntersectionOf2Arrays {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,3};
        int brr[]={3,4,5,6,7,3};

        //inttersection common elements of both arrays 

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i: brr){
            if(map.containsKey(i)){
                System.out.println(i);
                map.put(i,map.get(i)-1);

                if(map.get(i)==0){
                map.remove(i);
            }
            }

            
        }
    }
}
