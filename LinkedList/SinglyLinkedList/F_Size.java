package LinkedList.SinglyLinkedList;

// time complexity : O(1);

public class F_Size {
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

    // add first
    public void addFirst(int data) {
        Node n1 = new Node(data);
        size++;

        if (head == null) {
            head = tail = n1;
            return;
        }

        n1.next = head;
        head = n1;
    }

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

    public static void main(String[] args) {
        F_Size s1 = new F_Size();
        s1.addFirst(2);
        s1.addFirst(1);
        s1.addLast(3);
        s1.addLast(4);

        System.out.println("Size of the linked list : " + size);
    }
}
