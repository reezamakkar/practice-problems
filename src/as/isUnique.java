package as;

import java.util.Arrays;

public class isUnique {

    private static int charSet = 128;

    //o(n2) solution brute force
    static Boolean isUnique(String str) {
        if (str.length() > charSet) { return false;}

        for (int i=0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    //on(n) solution using an array and assuming charset
    static boolean optimalIsUnique(String str) {
        if (str.length() > charSet) { return false;}

        Boolean[] arr =  new Boolean[charSet];
        Arrays.fill(arr, false);

        for (int i=0; i < str.length(); i++) {
            int ch = (int)str.charAt(i);
            if (arr[ch] == true) {
                return false;
            }
            arr[ch] = true;
        }
        return true;
    }

    //o(nlogn) by sorting the string
    static boolean isUniqueSort(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (int i=0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    //o(n) solution using bitwise XOR
    static boolean isUniqueBitwise(String str) {

        //To Do
        //get index relative to 'a'
        //Bitwise AND Of checker & leftshift 1 by index bits >0 : return False
        // checker = checker | ( 1 << index)
        return true;
    }

    public static void main(String[] args) {
        boolean unique = isUniqueSort("rmlinq");
        if (unique) {
            System.out.println("String has all unique characters");
        }
        else {
            System.out.println("String does not comprise all unique characters");
        }

    }
}

