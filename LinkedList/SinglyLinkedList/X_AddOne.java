package LinkedList.SinglyLinkedList;

public class X_AddOne {
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
            System.out.println("Linked List is empty");
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> "); // "temp.data"
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int convertToInteger() {
        Node temp = head;
        int i = (int) Math.pow(10, size - 1);
        int num = 0;

        while (temp != null) {
            num += (temp.data * i);
            i /= 10;
            temp = temp.next;
        }

        return ++num;
    }

    public void tranformLL() {
        int num = convertToInteger();

        head = null;
        tail = null;
        size = 0;

        int divider = num;

        while (divider != 0) {
            int reminder = divider % 10;
            divider = divider / 10;
            addFirst(reminder);
        }

    }

    public static void main(String[] args) {
        X_AddOne x1 = new X_AddOne();
        x1.addFirst(9);
        // x1.addFirst(9);

        x1.print();
        x1.tranformLL();
        x1.print();
    }
}
