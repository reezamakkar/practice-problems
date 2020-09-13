package trees;

public class LCA {
    static class Node{
        int data;
        Node left, right;
        Node(int d) {
            this.data=d;
            this.left=null;
            this.right=null;
        }
    }
    static int findLCA(Node node, int n1, int n2) {
        if (node==null) {
            return -1;
        }
        if (node.data > n1 && node.data > n2) {
            System.out.println(node.left.data);
            return findLCA(node.left, n1, n2);
        }
        if (node.data < n1 && node.data < n2) {
            return findLCA(node.right, n1, n2);
        }
        return node.data;
    }


    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(12);
        root.right = new Node(22);
        root.left.left = new Node(10);
        root.left.right = new Node(14);
        root.right.left = new Node(21);

        int n = findLCA(root, 10, 14);
        System.out.print(n);

    }
}
