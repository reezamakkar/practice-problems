package ll;

public class kthToLast {

    static class LinkedList {
        static Node head;
        static class Node {
            int data;
            Node next;

            Node(int d) {
                this.data= d;
                this.next=null;
            }
        }

        static int getKthFromLast(int k) {
            Node p1 = head;
            Node p2=head;
            int i=1;
            while (i<k) {
                p2=p2.next;
                i++;
            }
            System.out.println(p1.data);
            System.out.println(p2.data);
            while (p2.next != null) {
                p2 = p2.next;
                p1 = p1.next;
            }
            return p1.data;
        }

        static  void print() {
            Node n=head;
            while (n!=null) {
                System.out.print(n.data + " ");
                n=n.next;
            }
        }


    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new LinkedList.Node(1);
        ll.head.next = new LinkedList.Node(2);
        ll.head.next.next = new LinkedList.Node(3);
        ll.head.next.next.next = new LinkedList.Node(4);
        ll.head.next.next.next.next = new LinkedList.Node(5);
        ll.head.next.next.next.next.next = new LinkedList.Node(6);
        ll.head.next.next.next.next.next.next = new LinkedList.Node(7);
        ll.head.next.next.next.next.next.next.next = new LinkedList.Node(8);
        ll.print();

        System.out.println(LinkedList.getKthFromLast(4));

    }
}
