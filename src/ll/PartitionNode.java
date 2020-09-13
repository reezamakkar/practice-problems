package ll;

class PartitionNode {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            this.data=d;
            this.next=null;
        }
    }
    static void print(Node head) {
        Node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
            n=n.next;
        }
        System.out.println();
    }

    static Node partitionList(Node head, Node partition) {
        if (head==null || partition==null) { return null;}
        Node n = head;
        Node first = n;
        Node last = n;
        while (n!=null) {
            Node next = n.next;
            if (n.data <= partition.data) {
                n.next = first;
                first = n;
            }
            else {
                last.next=n;
                last = n;
            }
            n=next;
        }
        last.next = null;
        return first;
    }

    public static void main(String[] args) {
        Node head1 = new Node(3);
        head1.next = new Node(5);
        head1.next.next = new Node(8);
        head1.next.next.next = new Node(5);
        head1.next.next.next.next = new Node(10);
        head1.next.next.next.next.next = new Node(2);
        head1.next.next.next.next.next.next = new Node(1);
        print(head1);
        print(partitionList(head1, head1.next.next.next));
    }
}
