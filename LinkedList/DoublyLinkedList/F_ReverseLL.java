public class F_ReverseLL {
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

    // reverse
    public boolean reverse() {
        Node prevNode = null;
        Node curr = head;
        Node next;

        if (head == null) {
            System.out.println("LL is empty");
            return false;
        }
        if (curr.next == null) {
            System.out.println("Cannot reverse one node");
            return false;
        }

        while (curr != null) {
            next = curr.next;
            curr.next = prevNode;
            curr.prev = next;
            prevNode = curr;
            curr = next;
        }
        head = prevNode;

        return true;
    }

    public static void main(String[] args) {
        F_ReverseLL f1 = new F_ReverseLL();
        f1.addLast(1);
        f1.addLast(20);
        f1.addLast(1);
        f1.addLast(20);
        f1.addLast(1);
        f1.addLast(20);

        System.out.println("Before reversing : ");
        f1.print();

        System.out.println();
        System.out.println("After reversing : ");
        boolean result = f1.reverse();

        if (result) {
            f1.print();
        }
    }
}
