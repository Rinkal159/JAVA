package LinkedList.SinglyLinkedList;

public class W_Sort0s1s2s {
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

    public void sort() {
        Node temp = head;
        int zero = 0;
        int one = 0;
        int two = 0;

        while (temp != null) {
            if (temp.data == 0) {
                zero++;
            } else if (temp.data == 1) {
                one++;
            } else if (temp.data == 2) {
                two++;
            }

            temp = temp.next;
        }

        temp = head;

        while (temp != null) {
            if (zero != 0) {
                temp.data = 0;
                zero--;
            } else if (one != 0) {
                temp.data = 1;
                one--;
            } else if (two != 0) {
                temp.data = 2;
                two--;
            }

            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        W_Sort0s1s2s w1 = new W_Sort0s1s2s();
        w1.addLast(1);
        w1.addLast(0);
        w1.addLast(2);
        w1.addLast(2);
        w1.addLast(2);
        w1.addLast(0);

        w1.print();
        w1.sort();

        System.out.println("After sorting all 0s, 1s ans 2s : ");
        w1.print();
    }
}
