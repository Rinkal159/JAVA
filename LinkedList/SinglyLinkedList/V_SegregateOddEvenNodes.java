package LinkedList.SinglyLinkedList;

public class V_SegregateOddEvenNodes {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

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

    public void odd() {
        Node temp = head;

        while (temp != null) {

            if (temp.next == null || temp.next.next == null) {
                temp.next = null;
                break;
            }
            temp.next = temp.next.next;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        V_SegregateOddEvenNodes v1 = new V_SegregateOddEvenNodes();
        v1.addLast(1);
        v1.addLast(2);
        v1.addLast(3);
        v1.addLast(4);
        v1.addLast(5);
        v1.addLast(6);

        v1.print();
        v1.odd();
        v1.print();
    }
}
