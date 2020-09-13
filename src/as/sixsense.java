package as;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter elements...");
//        int n = 0;
        List<String> grid = new ArrayList<String>();
        List<String> dict = new ArrayList<String>();
        String s = sc.nextLine();
        grid.add(s);
        int n = s.length();
        for (int i = 0; i < n - 1; i++) {
            s = sc.nextLine();
            grid.add(s);
        }

//        int j=0;
        while (sc.hasNextLine()) {
            dict.add(sc.nextLine());
//            j++;
        }

        System.out.println(grid);
        System.out.println(dict);
    }
}

