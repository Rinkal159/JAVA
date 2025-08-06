public class B_AddFirst {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add first
    public void addFirst(int data) {
        Node n1 = new Node(data);

        if (head == null) {
            head = tail = n1;
            size++;
            return;
        }

        n1.next = head;
        head.prev = n1;
        head = n1;
        size++;
    }

    // print
    public void print() {
        if (size == 0) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        B_AddFirst b1 = new B_AddFirst();
        b1.addFirst(2);
        b1.addFirst(1);
        b1.addFirst(3);

        b1.print();
    }
}
