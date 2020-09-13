package ll;

import org.jetbrains.annotations.NotNull;

import java.util.Hashtable;
import java.util.HashSet;

class LinkedList {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next=null;
        }
    }

    private void addNode(int d) {
        if (head==null) {
            head = new Node(d);
            return;
        }
        Node n = new Node(d);
        n.next = head;
        head = n;

    }

    void print() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n=n.next;
        }
        System.out.println();
    }

    void removeDuplicateWithoutBuffer() {
        Node current = head;
        while (current.next!=null) {
            Node runner = current;
            while(runner.next!=null) {
                if (current.data == runner.next.data) {
                    runner.next = runner.next.next;
                }
                else{
                    runner=runner.next;
                }
            }
            current=current.next;
        }
    }

    void removeDuplicate() {
        Node n = head;
        HashSet <Integer> ht = new HashSet<Integer>();
        int count = 0;
        Node prev = null;
        while (n!=null) {
            System.out.println(n.data + ":");
            if (ht.contains(n.data)) {
                prev.next = n.next;
            }
            else{
                ht.add(n.data);
                prev = n;
            }
            n=n.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(4);
        list.addNode(7);
        list.addNode( 5);
        list.addNode(4);
        list.addNode(1);
        list.addNode( 3);
        list.print();
        list.removeDuplicateWithoutBuffer();
        list.print();
    }
}
