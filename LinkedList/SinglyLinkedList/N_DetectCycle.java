package LinkedList.SinglyLinkedList;

// time complexity : O(n);

public class N_DetectCycle {
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

    // add elements
    public void addElements() {
        head = new Node(1);

        Node n1 = head;
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        n1.next.next.next.next = new Node(5);
        n1.next.next.next.next.next = head;
    }

    // detect cycle
    public boolean detectCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        N_DetectCycle n1 = new N_DetectCycle();
        n1.addElements();

        System.out.println("Cycle? : " + n1.detectCycle());
    }
}
