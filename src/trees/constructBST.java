package trees;

public class constructBST {
    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            this.data=d;
            this.left=null;
            this.right=null;
        }
    }

    static Node createMinimalBst(int[] arr, int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (start + end)/2;
        Node root = new Node(arr[mid]);
        root.left = createMinimalBst(arr, start, mid-1);
        root.right = createMinimalBst(arr, mid+1, end);
        return root;
    }

    static void printTree(Node n) {
       if (n!=null)  {
           printTree(n.left);
           System.out.print(n.data + " ");
           printTree(n.right);
       }
    }
    static Node constructBST(int[] arr) {
        return createMinimalBst(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        Node tree = constructBST(arr);
        printTree(tree);
    }
}
