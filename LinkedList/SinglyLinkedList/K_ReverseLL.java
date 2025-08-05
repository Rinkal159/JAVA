package LinkedList.SinglyLinkedList;

// time complexity : O(n)

public class K_ReverseLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add last
    public void addLast(int data) {
        Node n1 = new Node(data);
        size++;

        if (head == null) {
            head = tail = n1;
            return;
        }
        tail.next = n1;
        tail = n1;

    }

    // print
    public void print() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> "); // "temp.data"
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        K_ReverseLL k1 = new K_ReverseLL();
        k1.addLast(1);
        k1.addLast(2);
        k1.addLast(3);
        k1.addLast(4);
        k1.addLast(5);

        System.out.println("Before reverse : ");
        k1.print();

        k1.reverse();

        System.out.println();
        System.out.println("After reverse : ");
        k1.print();
    }
}
