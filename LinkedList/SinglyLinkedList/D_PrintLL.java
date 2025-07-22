package LinkedList.SinglyLinkedList;

public class D_PrintLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addElementFirst(int data) {
        Node n1 = new Node(data);

        if (head == null) {
            head = tail = n1;
            return;
        }
        n1.next = head;
        head = n1;
    }

    public void addElementLast(int data) {
        Node n1 = new Node(data);

        if (head == null) {
            head = tail = n1;
            return;
        }
        tail.next = n1;
        tail = n1;

    }

    // time complexity : O(n)
    public void print() {
        if(head == null) {
            System.out.println("Linked List is empty");
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " "); // "temp.data"
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        D_PrintLL p1 = new D_PrintLL();

        p1.addElementFirst(2);
        p1.addElementFirst(1);

        p1.addElementLast(3);
        p1.addElementLast(4);

        p1.print();
    }
}
