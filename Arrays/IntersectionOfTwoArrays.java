import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int brr[] = { 2, 2, 4, 6, 8, 10 };

        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {
            set.add(i);
        }

        for (int i : brr) {
            if (set.contains(i)) {
                System.out.print(i + " ");
                set.remove(i); // to avoid duplicates
            }
        }
    }
}
