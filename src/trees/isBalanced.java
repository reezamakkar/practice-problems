package trees;

public class isBalanced {

    static boolean isBalancedBST(leafNodes.Node root) {
        if (root == null){
            return true;
        }
        int lt = leafNodes.height(root.left);
        int rt = leafNodes.height(root.right);

        if (Math.abs(lt-rt) > 1) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        leafNodes.Node root = new leafNodes.Node(1);
        root.left= new leafNodes.Node(2);
        root.right= new leafNodes.Node(3);
        root.left.left = new leafNodes.Node(4);
        root.left.right = new leafNodes.Node(5);
        root.left.left.left = new leafNodes.Node(7);

        System.out.print(isBalancedBST(root));
    }
}
