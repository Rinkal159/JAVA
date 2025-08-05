package LinkedList.SinglyLinkedList;

public class Z0A_SizeOfLoop {
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

    public void addElements() {
        head = new Node(1);

        Node n1 = head;
        Node temp = new Node(2);
        n1.next = temp;
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        n1.next.next.next.next = new Node(5);
        n1.next.next.next.next.next = new Node(6);
        n1.next.next.next.next.next.next = temp;

    }

    public int cycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                if (slow == head) {
                    return slow.data;
                }

                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                Node temp = slow.next;
                int size = 1; // count of slow

                while (temp != slow) {
                    size++;
                    temp = temp.next;
                }

                return size;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Z0A_SizeOfLoop za1 = new Z0A_SizeOfLoop();
        za1.addElements();
        System.out.println("Size of loop : " + za1.cycle());
    }
}
