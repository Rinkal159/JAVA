package LinkedList.SinglyLinkedList;

public class M_CheckPalindrome {
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
        if (head == null) {
            System.out.print("Linked List is empty");
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // mid find
    public Node mid() {
        Node slow = head; // +1
        Node fast = head; // +2

        // even & odd
        while (fast != null && fast != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // reverse the right half, then check left and right side
    public boolean reverseRight() {
        if (head == null && head.next == null) {
            return true;
        }

        Node mid = mid();

        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head; // left side head
        Node right = prev; // right side head

        while (left.next != null && right.next != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;

    }

    public static void main(String[] args) {
        M_CheckPalindrome m1 = new M_CheckPalindrome();
        m1.addFirst(5);
        m1.addFirst(4);
        m1.addLast(5);
        m1.addLast(5);
        m1.addLast(5);

        m1.print();

        System.out.println("is Palindrome? : " + m1.reverseRight());
    }
}
