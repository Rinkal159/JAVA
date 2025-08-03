package LinkedList.SinglyLinkedList;

public class U_AddNumbersFromTwoLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

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

    //reverse values
    public int reverseValues() {
        Node temp = head;
        int i = 1;
        int sum = 0;

        while (temp != null) {
            sum += (temp.data * i);
            temp = temp.next;
            i *= 10;
        }
        return sum;
    }

    // reverse the sum
    public void printSumReverse(int sum) {

        int divider = sum;

        while (divider != 0) {
            int reminder = divider % 10;
            divider = divider / 10;
            addLast(reminder);
        }

    }

    public static void main(String[] args) {
        U_AddNumbersFromTwoLL u1 = new U_AddNumbersFromTwoLL();
        U_AddNumbersFromTwoLL u2 = new U_AddNumbersFromTwoLL();
        U_AddNumbersFromTwoLL u3 = new U_AddNumbersFromTwoLL();

        u1.addLast(1);

        u2.addLast(8);
        u2.addLast(7);

        int sum = u1.reverseValues() + u2.reverseValues();
        u3.printSumReverse(sum);
        u3.print();

    }
}
