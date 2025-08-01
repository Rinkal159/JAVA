package LinkedList.SinglyLinkedList;

public class S_LLToArray {
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

    public void llToArray(int[] arr) {
        Node temp = head;

        for (int i = 0; i < size; i++) {
            arr[i] = temp.data;
            System.out.print(arr[i] + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        S_LLToArray s1 = new S_LLToArray();
        s1.addFirst(3);
        s1.addFirst(2);
        s1.addFirst(1);
        s1.addLast(4);
        s1.addLast(5);
        s1.addLast(6);

        int[] arr = new int[size];

        s1.llToArray(arr);
    }
}
