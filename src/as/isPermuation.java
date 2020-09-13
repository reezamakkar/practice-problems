package as;

import java.util.Arrays;

public class isPermuation {

    static String sort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    //nlogn
    static boolean isPermutationSort(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        return (sort(s1).equals(sort(s2)));
    }

    static boolean isPermutationCount(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[128];

        for (int i=0; i <s1.length(); i++) {
            int ch = (int) s1.charAt(i);
            count[ch]++;
        }

        System.out.println(count);
        for (int j=0; j <s2.length(); j++) {
            int ch1 = (int) s2.charAt(j);
            count[ch1]--;
            if (count[ch1] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean perm = isPermutationCount("apple", "plepa");
        System.out.println(perm);
    }
}
