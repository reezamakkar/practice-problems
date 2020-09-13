package adhoc;

/*NOTE: You are not allowed to use split, reverse or substring methods
        i/p: I am a Robot!
        o/p: I ma a Tobor!

        i/p: I am a lEuc3ine
        o/p: I ma a eNic3uel
*/


public class ques {

    static String reverseWord(String s, int start_index, int end_index) {

        String sub_str = "";
        String reversed = sub_str;
        for (int i = start_index; i < end_index; i++) {
            sub_str += s.charAt(i);
        }
//        Robot -> Tobor
        int index = 0;
        for (int i = sub_str.length() - 1; i >= 0; i--) {
            char ch = sub_str.charAt(i);

            if (Character.isUpperCase(ch)) {
                index = start_index + i; // 4
            }
            reversed += sub_str.charAt(i);

        }
        //tobor
        String reversedCaseWise = "";
        for (int i = 0; i < reversed.length(); i++) {
            if (i == start_index+index) {
                reversedCaseWise += Character.toUpperCase(reversed.charAt(i));
            } else {
                reversedCaseWise += reversed.charAt(i);
            }

        }
            return reversedCaseWise;

//        }
    }

    public static String reverseString(String s) {
        int beg= 0;
        String finalReversed = "";
        for (int i=0; i<s.length(); i++) {

            if (s.charAt(i) == ' ') {
                finalReversed += reverseWord(s, beg, i) + " ";
                beg = i+1;
            }
        }
        finalReversed += reverseWord(s, beg, s.length());
        return finalReversed;
    }

    public static void main(String[] args) {
        String stt = "I am a Robot";
        String rev = reverseString(stt);
        System.out.print(rev);
    }

}
