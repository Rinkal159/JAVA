package LinkedList.SinglyLinkedList;

public class C_AddLast {
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

    // time complexity : O(1)
    public void addElementLast(int data) {
        // to add element last of the LL

        Node n1 = new Node(data); // create new node

        if (head == null) { // if LL is empty
            head = tail = n1;
            return;
        }
        tail.next = n1; // link the tail to n1
        tail = n1; // change the tail

    }

    public static void main(String[] args) {
        C_AddLast a1 = new C_AddLast();
        a1.addElementLast(1);
        a1.addElementLast(2);
    }
}
