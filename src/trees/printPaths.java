package trees;

public class printPaths {
    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            this.data=d;
            this.left=null;
            this.right=null;
        }
    }
    static void printPaths(Node root){

        int[] path = new int[1000];
        int[][] allPaths= new int[1000][1000];
        printEachPath(root, path, 0, allPaths, 0);
//        printArray(allPaths);


    }
    static void printArray(int ints[], int len)
    {
        int i;
        for (i = 0; i < len; i++)
        {
            System.out.print(ints[i] + " ");
        }
        System.out.println("");
    }
    static void addToArray(int ints[], int len)
    {
        int i;
        for (i = 0; i < len; i++)
        {
            System.out.print(ints[i] + " ");
        }
        System.out.println("");
    }
    static void printEachPath(Node root, int[] paths, int pathLen, int[][] allPaths, int count) {
        if (root==null){
            return;
        }

        paths[pathLen++] = root.data;
        if (root.left == null && root.right==null) {
            allPaths[count++] = paths;
        }
        else  {
            printEachPath(root.left, paths, pathLen, allPaths, count);
            printEachPath(root.right, paths, pathLen, allPaths, count);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        printPaths(root);
    }
}
