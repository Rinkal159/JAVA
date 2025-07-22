package LinkedList.SinglyLinkedList;

public class A_Creation {

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

    public static void main(String[] args) {
        A_Creation c1 = new A_Creation();
    }
}
