package test;
import java.util.*;

public class BigBinaryNo {

//    static int getBinary(int n) {
//        int bin[] = new int[100];
//        int i = 0;
//
//        while (n>0) {
//            bin[i++] = n%2;
//            n=n/2;
//        }


    public static void main(String[] args) {

        long n = 3;
        List<Integer> str = new ArrayList<>();

        for(long i=1; i<=n ; i++) {
            String a = Long.toBinaryString(i);
//            System.out.print(a);
            for(int j=0; j<a.length(); j++) {
                str.add(a.charAt(j) - '0');
            }
        }

        long len = str.size();
        long soln = 0;
        for(int i=0; i<len; i++) {
            soln = soln + (str.get(i) << len-i-1);
        }

        System.out.print(soln);
    }
}
