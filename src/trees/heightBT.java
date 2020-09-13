package trees;

public class heightBT {
    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            this.data=d;
            this.left=null;
            this.right=null;
        }
    }

    static int heightBinaryTree(Node root) {
        if (root==null) {
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        int rt = heightBinaryTree(root.right);
        int lt = heightBinaryTree(root.left);
        if (lt>rt) {
            return lt+1;
        }
        else{
            return rt+1;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.print(heightBinaryTree(root));
    }

}
