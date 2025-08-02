package LinkedList.SinglyLinkedList;

public class T_AddInMiddleBeforeValue {
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

    // add first
    public void addFirst(int data) {
        Node n1 = new Node(data);

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

        if (head == null) {
            head = tail = n1;
            return;
        }
        tail.next = n1;
        tail = n1;

    }

    // print
    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // add middle
    public boolean addDataInMiddle(int value, int data) {
        Node n1 = new Node(data);

        if (head.data == value) {
            addFirst(data);
            return true;
        }

        Node temp = head;
        Node prev = temp;

        while (temp.data != value && temp != null && temp.next != null) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println(value + " does not exist in LL.");
            return false;
        }

        n1.next = prev.next;
        prev.next = n1;

        return true;
    }

    public static void main(String[] args) {
        T_AddInMiddleBeforeValue t1 = new T_AddInMiddleBeforeValue();
        t1.addFirst(5);
        t1.addFirst(4);
        t1.addFirst(3);
        t1.addFirst(2);
        t1.addFirst(1);

        System.out.println("Before adding in middle : ");
        t1.printLL();

        if (t1.addDataInMiddle(6, 10)) {
            System.out.println("After adding in middle : ");
            t1.printLL();
        }

    }
}
