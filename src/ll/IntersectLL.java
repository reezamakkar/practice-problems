package ll;

public class IntersectLL     {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            this.data=d;
            this.next=null;
        }
    }


    static Node intersect(Node head1, Node head2) {
        Node n1 = head1;
        Node n2 = head2;
        int len1=1;
        int len2=1;

        while(n1.next!=null){
            len1++;
            n1=n1.next;
        }
        while(n2.next!=null){
            len2++;
            n2=n2.next;
        }
        if (n1 != n2) {
            return null;
        }
        Node shorter =  (len1 < len2) ? head1 : head2;
        Node bigger = (len1 < len2) ? head2 : head1;

        int k=Math.abs(len2-len1);
        int i=0;
        while (i<k){
            bigger=bigger.next;
            i++;
        }

        while (bigger != shorter){
            bigger=bigger.next;
            shorter=shorter.next;
        }

        return bigger;

    }

    static void print(Node head) {
        Node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
            n=n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head1 = new Node(7);
        head1.next = new Node(5);
        head1.next.next = new Node(8);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(6);
        head1.next.next.next.next.next = new Node(10);
        Node head2 = new Node(11);
        head2.next = head1.next.next.next;
        print(head1);
        print(head2);
        Node res = intersect(head1, head2);
        System.out.println(res.data);
    }

}
