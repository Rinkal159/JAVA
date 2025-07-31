package LinkedList.SinglyLinkedList;

// time complexity : O(n);

public class Q_ZicZac {
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
            System.out.println("Linked List is empty");
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> "); // "temp.data"
            temp = temp.next;
        }
        System.out.println("null");
    }

    // find mid
    public Node mid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // reverse right side
    public Node reverse(Node rightHead) {
        Node prev = null;
        Node curr = rightHead;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // ziczac
    public void zicZac() {
        Node mid = mid(head);
        Node right = mid.next;
        mid.next = null;

        Node leftHead = head;
        Node rightHead = reverse(right);

        while (leftHead != null && rightHead != null) {
            Node nextLeft = leftHead.next;
            Node nextRight = rightHead.next;

            leftHead.next = rightHead;
            rightHead.next = nextLeft;

            leftHead = nextLeft;
            rightHead = nextRight;
        }
    }

    public static void main(String[] args) {
        Q_ZicZac q1 = new Q_ZicZac();
        q1.addFirst(3);
        q1.addFirst(2);
        q1.addFirst(1);
        q1.addLast(4);
        q1.addLast(5);
        q1.addLast(6);
        q1.addLast(7);
        q1.addLast(8);
        q1.addLast(9);

        q1.zicZac();
        q1.print();
    }
}
