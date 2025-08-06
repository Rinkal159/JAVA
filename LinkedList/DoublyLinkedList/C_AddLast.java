public class C_AddLast {
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

    // add last
    public void addLast(int data) {
        Node n1 = new Node(data);

        if (head == null) {
            head = tail = n1;
            size++;
            return;
        }

        tail.next = n1;
        n1.prev = tail;
        tail = n1;
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
        C_AddLast c1 = new C_AddLast();
        c1.addLast(1);
        c1.addLast(2);
        c1.addLast(3);

        c1.print();
    }
}
