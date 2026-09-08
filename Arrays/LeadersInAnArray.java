public class LeadersInAnArray {
    public static void main(String[] args) {
        int arr[] = {26, 17, 4, 2, 5, 2};

        int max=arr[arr.length-1];
        System.out.println(max); //last element is always a leader
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                System.out.println(max);
            }
        }
    }
}
