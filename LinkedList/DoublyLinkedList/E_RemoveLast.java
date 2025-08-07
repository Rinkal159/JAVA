public class E_RemoveLast {
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

    // remove last
    public boolean removeLast() {
        if (head == null) {
            System.out.println("LL is empty, cannot remove data");
            return false;
        }
        if (head.next == null) {
            head = tail = null;
            size--;
            return true;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
        return true;
    }

    public static void main(String[] args) {
        E_RemoveLast e1 = new E_RemoveLast();
        e1.addLast(1);
        e1.addLast(2);
        e1.addLast(3);

        System.out.println("LL before removing last node : ");
        e1.print();

        System.out.println();
        System.out.println("LL after removing last node : ");
        boolean result = e1.removeLast();
        if (result) {
            e1.print();
        }
    }
}
