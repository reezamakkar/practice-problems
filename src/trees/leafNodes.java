package trees;

public class leafNodes {
    static class Node{
        int data;
        Node left, right;
        Node(int d) {
            data=d;
            left=null;
            right=null;
        }
    }

    static int printLeafNodes(Node root) {
        if (root==null){
            return 0;
        }
        if (root.left ==null && root.right==null){
           return 1;
        }
        return printLeafNodes(root.left) + printLeafNodes(root.right);
    }

    static int height(Node root) {
        if (root==null){
            return 0;
        }
        if (root.left ==null && root.right==null) {
            return 1;
        }
        int lt = height(root.left);
        int rt = height(root.right);
        return Math.max(lt, rt) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(7);

        System.out.print(height(root));
    }
}
