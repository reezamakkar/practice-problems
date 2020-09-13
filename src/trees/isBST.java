package trees;

public class isBST {
    static class Node{
        int data;
        Node left, right;
        Node(int d) {
            this.data=d;
            this.left=null;
            this.right=null;
        }
    }
    static boolean isBinarySearchTree(Node root) {

        if (root==null) {
            return true;
        }

        if (root != null || root.left != null || root.right != null) {

            if (root.left.data > root.data || root.right.data < root.data) {
                return false;
            }

            isBinarySearchTree(root.left);
            isBinarySearchTree(root.right);
        }
        return true;

    }


    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(4);
        root.left.right = new Node(9);
        root.right.left = new Node(11);
        isBinarySearchTree(root);
    }
}
