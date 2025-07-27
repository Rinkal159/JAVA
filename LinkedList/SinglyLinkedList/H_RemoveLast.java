package LinkedList.SinglyLinkedList;

// time complexity : O(n);

public class H_RemoveLast {
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

    public int removeLast() {
        Node temp = head;

        if(temp == null) {
            size = 0;
            return Integer.MIN_VALUE;
        }
        if(temp.next == null) {
            head = tail = null;
            size = 0;
            return temp.data;
        }

        while (temp.next != tail) {
            temp = temp.next;
        }
        int value = tail.data;
        temp.next = null;
        tail = temp;
        size--;

        return value;

    }

    public static void main(String[] args) {
        H_RemoveLast h1 = new H_RemoveLast();

        h1.addElementFirst(200);
        h1.addElementFirst(10000);
        h1.addElementFirst(400);
        h1.addElementFirst(800);

        System.out.print("LL before removal : ");
        h1.print();

        System.out.println("Removed element : " + h1.removeLast());

        System.out.print("LL after removal : ");
        h1.print();

        System.out.println("size : " + size);


    }
}
