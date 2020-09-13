package as;

import java.util.HashSet;

public class pairsSum {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 1, 7};
        printPairs(arr, 3);
//        printPairsEff(arr, 5);

    }

    private static void printPairsEff(int[] arr, int sum) {
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0; i<n-1; i++) {
            hs.add(arr[i]);
        }

        for (int i=0; i<n-1; i++) {
           if (hs.contains(sum+arr[i])){
               System.out.println( "Pair is (" + arr[i] + ", " + (sum+arr[i]) + ")" );
           }
           else if (hs.contains(arr[i]-sum)) {
               System.out.println( "Pair is (" + arr[i] + ", " + (arr[i]-sum) + ")" );
           }
           else continue;
        }
    }

    private static void printPairs(int[] arr, int sum) {
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (Math.abs(arr[i] - arr[j]) == sum) {
                    System.out.println( "Pair is (" + arr[i] + ", " + arr[j] + ")" );
                }
            }
        }
    }
}
