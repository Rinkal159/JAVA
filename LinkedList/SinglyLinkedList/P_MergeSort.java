package LinkedList.SinglyLinkedList;

import java.util.LinkedList;

public class P_MergeSort {
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

    // print
    public void print() {
        if(head == null) {
            System.out.println("Linked List is empty");
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> "); // "temp.data"
            temp = temp.next;
        }
        System.out.println("null");
    }

    // final merge
    public Node merge(Node left, Node right) {
        Node ll = new Node(-1);
        Node temp = ll;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }
        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        return ll.next;

    }

    // mid
    public Node mid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // mergesort logic
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = mid(head);
        Node right = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head); // recursion
        Node newRight = mergeSort(right); // backtracking

        return merge(newLeft, newRight); // backtracking
    }

    public static void main(String[] args) {
        P_MergeSort p1 = new P_MergeSort();
        p1.addFirst(6);
        p1.addFirst(10);
        p1.addLast(2);
        p1.addLast(4);
        p1.addLast(100);

        p1.print();
        p1.head = p1.mergeSort(p1.head);
        p1.print();
    }
}
