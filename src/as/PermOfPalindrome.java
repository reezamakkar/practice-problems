package as;

import java.util.Arrays;

public class PermOfPalindrome {
    static boolean palindromePerm(String str) {

        int[] letter_count = new int[128];
        int countOdd=0;
        Arrays.fill(letter_count, 0);
        for (int i=0; i <str.length(); i++)  {
            int ch_count = (int)str.charAt(i);
            letter_count[ch_count]++;
        }
        for (int j=0; j < letter_count.length; j++) {
            if (letter_count[j]%2==1) {
                countOdd++;
            }
        }

        if (countOdd>1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean isPdCheck = palindromePerm("abel");
        System.out.println(isPdCheck);
    }
}
