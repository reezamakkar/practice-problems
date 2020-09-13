package ll;

import java.util.HashSet;

public class DetectLoop {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data= d;
            this.next=null;
        }
        Node(int d, Node N) {
            this.data= d;
            this.next=N;
        }
    }

    static boolean detectLoop(Node n ) {
        HashSet<Node> ht = new HashSet<Node>();
        while (n!=null){
            if (ht.contains(n)){
                System.out.println("Loop detected");
                return true;
            }
            ht.add(n);
            n=n.next;
        }
        return false;
    }

    static Node detectLoopTwoPointers(Node n) {
        Node current = n;
        Node runner = n;

        while(current!=null && runner!=null && runner.next!=null) {
            current = current.next;
            runner = runner.next.next;
            if (current== runner) {
                System.out.println("Loop detected");
                return current;
            }
        }
        return null;
    }
    static void print(Node n) {
        while (n != null) {
            System.out.print(n.data + "-> ");
            n=n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next.next = new Node(8);
        head.next.next.next.next = head.next.next;
        System.out.print(detectLoopTwoPointers(head).data);
    }
}
