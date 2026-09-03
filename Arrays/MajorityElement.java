import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 3, 3 };
        int n = arr.length / 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) > n) {
                System.out.println("majority " + i);
            }
        }

    }

}
