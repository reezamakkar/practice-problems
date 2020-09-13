package as;

import java.util.Arrays;

public class ZeroMatrix {
    static int[][] zeroMatrix1(int[][] arr) { return arr;}
    static int[][] zeroMatrix(int[][] arr) {
        Boolean[] row_contains_zero = new Boolean[arr.length];
        Boolean[] col_contains_zero = new Boolean[arr[0].length];

        Arrays.fill(row_contains_zero, false);
        Arrays.fill(col_contains_zero, false);

        for (int i=0; i <arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    row_contains_zero[i] = true;
                    col_contains_zero[j] = true;
                }
            }
        }

        for (int i=0; i <arr.length; i++) {
            if (row_contains_zero[i]) {
                nullifyRow(arr, i);
            }
        }
        for (int j=0; j <arr[0].length; j++) {
            if (col_contains_zero[j]) {
                nullifyColumn(arr, j);
            }
        }
        return arr;

    }
    static int[][] nullifyRow(int[][] arr, int i) {
        for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = 0;
        }
        return arr;
    }
    static int[][] nullifyColumn(int[][] arr, int j) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][j] = 0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [][] arr = {{1,2,3}, {4, 0, 6}, {7,8,9}, {4, 4, 0}};
        int [][] result = zeroMatrix(arr);
        for (int i=0; i <result.length; i++) {
            for (int j=0; j<result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
