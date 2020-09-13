package ll;

public class SwapNodes {
    static class Node {
        int data;
        Node next = null;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
//    1->2->3->4->5
//    2->1>4>3>5
    static Node swapNodes(Node head) {
        Node n = head;

        while (n!=null && n.next!=null) {
            int temp = n.data;
            n.data = n.next.data;
            n.next.data = temp;
            n=n.next.next;

        }
        return head;
    }

    static void printList(Node temp)
    {
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
//        head.next.next.next.next.next = new Node(6);
        printList(head);
        Node res = swapNodes(head);
        printList(res);
    }
}
