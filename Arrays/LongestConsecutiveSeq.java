import java.util.HashSet;

public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        int arr[]={100,4,200,2,1,3};

        int count=0;

        HashSet<Integer> set=new HashSet<>();

        for(int i :arr){
            set.add(i);
        }

        for(int i:arr){
            if(!set.contains(i-1)){
                int current=i;
                int length=1;

                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                count=Math.max(count,length);
            }
        }
        System.out.println(count);
    }
}
