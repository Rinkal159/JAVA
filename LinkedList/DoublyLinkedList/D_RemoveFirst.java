public class D_RemoveFirst {
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
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // remove first
    public boolean removeFirst() {
        if (head == null) {
            System.out.println("LL is empty, cannot remove data");
            return false;
        }
        if (head.next == null) {
            head = tail = null;
            size--;
            return true;
        }
        head = head.next;
        head.prev = null;
        size--;
        return true;
    }

    public static void main(String[] args) {
        D_RemoveFirst d1 = new D_RemoveFirst();
        d1.addLast(1);
        d1.addLast(2);
        d1.addLast(3);
        d1.addLast(4);
        d1.addLast(5);

        System.out.println("LL before removing first node : ");
        d1.print();

        System.out.println();
        System.out.println("LL after removing first node : ");
        boolean result = d1.removeFirst();
        if (result) {
            d1.print();
        }
    }
}
