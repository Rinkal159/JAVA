package LinkedList.SinglyLinkedList;

// time complexity : O(n);

public class O_RemoveCycle {
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

        // code to start next cycle from head 👇
        Node n1 = head;
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        n1.next.next.next.next = new Node(5);
        n1.next.next.next.next.next = head;

        // code to start next cycle from somewhere in middle 👇
        // Node n1 = head;
        // Node temp = new Node(2);
        // n1.next = temp;
        // n1.next.next = new Node(3);
        // n1.next.next.next = new Node(4);
        // n1.next.next.next.next = new Node(5);
        // n1.next.next.next.next.next = temp;
    }

    // detect and remove cycle cycle
    public void detectAndRemoveCycle() {
        Node slow = head;
        Node fast = head;
        Node prev = slow;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                // if next cycle starts from head
                if (slow == head) {
                    prev.next = null;
                    return;
                }

                // if origin point of cycle if other than head
                slow = head;

                while (slow != fast) {
                    prev = fast;
                    slow = slow.next;
                    fast = fast.next;
                }
                prev.next = null;

            }
        }
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

    public static void main(String[] args) {
        O_RemoveCycle o1 = new O_RemoveCycle();
        o1.addElements();
        o1.detectAndRemoveCycle();
        o1.print();

    }
}
