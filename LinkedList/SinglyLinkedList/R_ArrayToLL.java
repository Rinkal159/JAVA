package LinkedList.SinglyLinkedList;

public class R_ArrayToLL {
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

    // add last
    public void addLast(int data) {
        Node n1 = new Node(data);

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

    public void tranformArray(int[] arr) {
        int i = 0;
        while (i != arr.length) {
            addLast(arr[i]);
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 10, 20 };

        R_ArrayToLL r1 = new R_ArrayToLL();
        r1.tranformArray(arr);
        r1.print();

    }
}
