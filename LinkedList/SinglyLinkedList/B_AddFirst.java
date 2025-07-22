package LinkedList.SinglyLinkedList;

public class B_AddFirst {
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
    public void addElementFirst(int data) {
        // to add element top of the LL

        Node n1 = new Node(data); // create new node

        if (head == null) { // if LL is empty
            head = tail = n1;
            return;
        }
        n1.next = head; // link to head
        head = n1; // change the head
    }

    public static void main(String[] args) {
        B_AddFirst a1 = new B_AddFirst();
        a1.addElementFirst(2);
        a1.addElementFirst(1);
    }

    
}
