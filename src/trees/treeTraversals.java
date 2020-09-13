package trees;

public class treeTraversals {
    static class Node {
        int key;
        Node left, right;

        Node (int data) {
            this.key = data;
            this.left = null;
            this.right = null;
        }
    }

    static void inOrderTraversal(Node root) {
        if (root!=null) {
            inOrderTraversal(root.left);
            System.out.print(root.key + " ");
            inOrderTraversal(root.right);
        }
    }
    static void preOrderTraversal(Node root) {
        if (root!=null) {
            System.out.print(root.key + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
    static void postOrderTraversal(Node root) {
        if (root!=null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.key + " ");
        }
    }

    static int heightBinaryTree(Node root) {
        if (root == null){
            return 0;
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
    static void bfs(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.key + " ");
        }
        else if (level>1){
            bfs(root.left, level-1);
            bfs(root.right, level-1);
        }
    }
    static void levelOrderTraversal(Node root) {
        int n = heightBinaryTree(root);
        for(int i=1; i<=n; i++) {
            bfs(root, i);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
//        preOrderTraversal(root);
//        System.out.println();
//        inOrderTraversal(root);
//        System.out.println();
//        postOrderTraversal(root);
         levelOrderTraversal(root);



    }
}
