package LinkedList.SinglyLinkedList;

public class Y_DeleteMiddleNode {
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
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> "); // "temp.data"
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int deleteMiddle() {
        Node slow = head;
        Node fast = head;
        Node prev = slow;

        if (head.next == null) {
            int headData = head.data;
            head = tail = null;
            return headData;
        }

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        int val = slow.data;
        prev.next = slow.next;
        return val;
    }

    public static void main(String[] args) {
        Y_DeleteMiddleNode y1 = new Y_DeleteMiddleNode();
        y1.addLast(1);

        y1.print();
        System.out.println("Deleted data : " + y1.deleteMiddle());

        y1.print();

    }
}
