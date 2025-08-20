public class B_ImplementationUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node n1 = new Node(data);
            if(isEmpty()) {
                head = n1;
                return;
            }
            n1.next = head;
            head = n1;
        }

        public static int pop() {
            int val = head.data;
            head = head.next;
            return val;
        }

        public static int peak() {
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);

        while (!Stack.isEmpty()) {
            System.out.println(Stack.peak());
            Stack.pop();
        }
    }
}
