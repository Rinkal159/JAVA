package LinkedList.SinglyLinkedList;

public class Creation {

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
        Creation c1 = new Creation();
    }
}
