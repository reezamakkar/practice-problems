package ll;

public class DeleteMiddleNode {
    static class Node {
        String data;
        Node next;

        Node(String d) {
            this.data= d;
            this.next=null;
        }
    }
    static void deleteMidNode(Node n){
      //copy next node to curr node
      //delete next node
        if (n.next ==null) {
            System.out.println("Node cant be deleted");
        }
        Node nextNode = n.next;
        n.data = nextNode.data;
        n.next = nextNode.next;
    }

    static void print(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n=n.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node("a");
        head.next= new Node("b");
        head.next.next = new Node("c");
        head.next.next.next = new Node("d");
        head.next.next.next.next = new Node("e");
        print(head);
        deleteMidNode(head.next.next);
        print(head);
    }
}
