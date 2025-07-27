package LinkedList.SinglyLinkedList;

// time complexity : O(n)

public class J_RecursiveSearch {
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
    public static int size;

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

    // search
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int i = helper(head.next, key); //recursion

        // backtracking
        if (i < 0) {
            return -1;
        }
        return i + 1;

    }

    public int search(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        J_RecursiveSearch j1 = new J_RecursiveSearch();
        j1.addFirst(2);
        j1.addFirst(1);
        j1.addLast(3);
        j1.addLast(4);
        j1.addFirst(2);

        System.out.println("The key is at index : " + j1.search(4));
    }
}
