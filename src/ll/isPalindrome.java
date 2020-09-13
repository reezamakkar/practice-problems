package ll;

public class isPalindrome {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    static Node reverseList(Node n) {
        Node prev=null;
        Node curr = n;
        Node next =null;

        while (curr!=null) {
           next = curr.next;
           curr.next=prev;
           prev=curr;
           curr= next;
        }
        return prev;
    }

    static boolean checkIfSame(Node n1, Node n2) {
        while (n1!=null && n2!=null) {
            if (n1.data !=n2.data) {
                return false;
            }
            n1=n1.next;
            n2=n2.next;
        }
        return (n1==null && n2==null);
    }

    static void print(Node n) {
        while (n!=null) {
            System.out.print(n.data + " ");
            n=n.next;
        }
        System.out.println();
    }
    static Node reverseClone(Node n) {
        Node head=null;
        Node prev=null;
        while (n!=null) {
            head = new Node(n.data);
            head.next=prev;
            prev=head;
            n=n.next;
        }
        return head;
    }
    static boolean isPalindrome(Node head) {
        Node reversed = reverseClone(head);
        print(head);
        print(reversed);
        return checkIfSame(head, reversed);
    }

    public static void main(String[] args) {
        Node start = new Node(1);
        start.next = new Node(2);
        start.next.next = new Node(1);
        System.out.println(isPalindrome(start));
    }
}
