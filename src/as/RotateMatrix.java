package as;

public class RotateMatrix {

    static int[][] rotatedMatrix(int[][] arr) {
        //transpose
        for (int i=0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                if (i != j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        System.out.println("---------");
        printMatrix(arr);
        //horizontal flip
        for (int i=0; i < arr.length; i++) {
            int len = arr[0].length;
            for (int j = 0; j < len/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][len - 1 - j];
                arr[i][len - 1 - j] = temp;
            }
        }
        return arr;
    }

    static void printMatrix(int[][] result) {
        for (int i=0; i <result.length; i++) {
            for (int j=0; j<result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int [][] arr = {{1,2,3}, {4, 0, 6}, {7,8,9}};
        printMatrix(arr);
        int [][] result = rotatedMatrix(arr);
        System.out.println("---------");
        printMatrix(result);
    }
}
