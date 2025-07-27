package LinkedList.SinglyLinkedList;

// time complexity : O(1)

public class G_RemoveFirst {
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

    public void addElementFirst(int data) {
        Node n1 = new Node(data);
        size++;

        if (head == null) {
            head = tail = n1;
            size = 1;
            return;
        }
        n1.next = head;
        head = n1;
    }

    public void print() {
        if (head == null) {
            System.out.print("Linked List is empty");
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> "); // "temp.data"
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {

        if (head == null) {
            size = 0;
            return Integer.MIN_VALUE;
        }
        if (head.next == null) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }

        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public static void main(String[] args) {
        G_RemoveFirst g1 = new G_RemoveFirst();

        g1.addElementFirst(1);
        g1.addElementFirst(0);

        System.out.print("LL before removal : ");
        g1.print();

        System.out.println("Removed element : " + g1.removeFirst());

        System.out.print("LL after removal : ");
        g1.print();

        System.out.println("size : " + size);
    }
}
