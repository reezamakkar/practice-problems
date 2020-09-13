package as;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int numberOfDays = in.nextInt();
        String[] ings = new String[numberOfDays];
        String[] collect = new String[numberOfDays];
        for (int i = 0; i < numberOfDays; i++) {
            String ingredient = in.next();
            ings[i] = ingredient;
        }
        String[] arr = {"FIBER", "FAT", "CARB"};
        int xcount=0;
        int ycount=0;
        for (int j=0; j< numberOfDays; j++) {
            for (String x: arr) {
                if (ings[j].contains(x)) {
                    collect[j] = x;
                }
            }
            if (Arrays.asList(collect).contains("FAT")) {
                xcount++;
            }
            if (Arrays.asList(collect).contains("FIBER") && Arrays.asList(collect).contains("CARB")) {
                ycount++;
            }
            if (j==0 || j%4!=0) {
                System.out.print("-");
            }
            else{
//                System.out.print("H " + xcount);

                if(xcount>=2) {
                    System.out.print("X");
                    collect = new String[]{};
                    xcount=0;
                }
//                else if (xcount==0 && ycount>=2){
                else {
                    System.out.print("Y");
                    Arrays.asList(collect).remove("FIBER");
                    Arrays.asList(collect).remove("CARB");
                    ycount=0;
                }
            }
        }
    }

}
