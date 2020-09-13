package ll;

import static ll.SumLists.print;

class SumLists {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            this.data=d;
            this.next=null;
        }
    }
    static Node sumLists(Node n1, Node n2) {
        Node res=null;
        Node prev=null;
        Node temp=null;
        int carry=0;
        while (n1!=null || n2!=null) {
            int val = n1.data + (n2!=null? n2.data : 0) + carry;
            carry = (val>=10) ? 1: 0;
            val = val%10;

            temp = new Node(val);
            if (res==null){
                res=temp;
            }
            else{
                prev.next=temp;
            }

            prev = temp;
            n1=n1.next;
            if (n2!=null) {
                n2=n2.next;
            }
        }
        if (carry>0) {
            temp.next = new Node(carry);
        }
        return res;
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
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(6);
        Node head2 = new Node(8);
        head2.next = new Node(4);
//        head2.next.next = new Node(2);
        print(head1);
        print(head2);
        Node result = sumLists(head1, head2);
        print(result);
    }

}
