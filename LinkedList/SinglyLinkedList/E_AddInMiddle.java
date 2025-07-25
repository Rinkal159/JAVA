package LinkedList.SinglyLinkedList;

// time complexity : O(n);

public class E_AddInMiddle {
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

    // print
    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // add middle
    public boolean addDataInMiddle(int idx, int data) {
        Node n1 = new Node(data);

        if (idx == 0) {
            addFirst(data);
            return true;
        }

        int i = 0;
        Node temp = head;

        while (temp != null && i != idx - 1 && temp.next != null) {
            temp = temp.next;
            i++;
        }

        if (temp == null || temp.next == null) {
            System.out.println();
            System.out.print("index " + idx + " is out of bounds");
            return false;
        }

        n1.next = temp.next;
        temp.next = n1;

        return true;
    }

    public static void main(String[] args) {
        E_AddInMiddle e1 = new E_AddInMiddle();
        e1.addFirst(5);
        e1.addFirst(4);
        e1.addFirst(3);
        e1.addFirst(2);
        e1.addFirst(1);

        System.out.println("Before adding in middle : ");
        e1.printLL();

        if (e1.addDataInMiddle(4, 1)) {
            System.out.println();
            System.out.println("After adding in middle : ");
            e1.printLL();
        }

    }
}
