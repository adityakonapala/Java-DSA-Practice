package Strings;

class LongestCommonPrefix {

    public static String longestCommonprefix(String arr[]) {
        if (arr == null || arr.length == 0) {
            return "";
        }

        String first = arr[0];
        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);

            for (int j = 1; j < arr.length; j++) {
                if (i >= arr[j].length() || ch != arr[j].charAt(i)) {
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }

    public static void main(String[] args) {
        String arr[] = { "interspecies", "interstellar", "interstate" };

        System.out.println(longestCommonprefix(arr));
    }
}