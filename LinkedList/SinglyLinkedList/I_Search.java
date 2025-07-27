package LinkedList.SinglyLinkedList;

// time complexity : O(n)

public class I_Search {
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
    public static int size;

    public void addElementFirst(int data) {
        Node n1 = new Node(data);
        size++;

        if (head == null) {
            head = tail = n1;
            return;
        }
        n1.next = head;
        head = n1;
    }

    public void addElementLast(int data) {
        Node n1 = new Node(data);
        size++;

        if (head == null) {
            head = tail = n1;
            return;
        }
        tail.next = n1;
        tail = n1;

    }

    public int search(int key) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == key) {
                return i;
            } else {
                temp = temp.next;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        I_Search i1 = new I_Search();
        i1.addElementFirst(2);
        i1.addElementFirst(1);
        i1.addElementLast(3);
        i1.addElementLast(4);
        i1.addElementFirst(5);

        System.out.println("Key is at index : " + i1.search(2));
    }
}
