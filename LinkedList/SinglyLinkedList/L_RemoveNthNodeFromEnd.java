package LinkedList.SinglyLinkedList;

// time complexity : O(n)

public class L_RemoveNthNodeFromEnd {
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

    // print
    public void print() {
        if (head == null) {
            System.out.print("Linked List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> "); // "temp.data"
            temp = temp.next;
        }
        System.out.println("null");
    }

    // remove first
    public void removeFirst() {
        head = head.next;
        size--;
    }

    // remove nth node from end
    public boolean remove(int n) {
        if (n == size) {
            removeFirst();
            return true;
        }
        if (n > size) {
            System.out.println(n + " is out of bounds");
            return false;
        }
        if (n == 0) {
            System.out.println("Nth node should start from 1");
            return false;
        }

        Node temp = head;
        Node prev = temp;
        int i = 1;

        while (i != (size - n + 1)) {
            prev = temp;
            temp = temp.next;
            i++;
        }

        prev.next = temp.next;
        return true;
    }

    public static void main(String[] args) {
        L_RemoveNthNodeFromEnd l1 = new L_RemoveNthNodeFromEnd();
        l1.addFirst(3);
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(4);
        l1.addLast(5);
        l1.addLast(6);

        int n = 1;

        System.out.println("Before removing nth node from end : ");
        l1.print();

        if (l1.remove(n)) {
            System.out.println("After removing nth node from end : ");
            l1.print();
        }

    }
}
