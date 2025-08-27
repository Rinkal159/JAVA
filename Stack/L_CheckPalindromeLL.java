import java.util.Stack;

public class L_CheckPalindromeLL {
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
    public static int count;

    public void addFirst(int data) {
        Node n1 = new Node(data);

        if (head == null) {
            head = tail = n1;
            return;
        }

        n1.next = head;
        head = n1;
    }

    public void printLL() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;

        System.out.print("Linked list : ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Stack<Integer> addIntoStack() {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;

        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        return stack;
    }

    public boolean checkPalindrome() {
        Stack<Integer> stack = addIntoStack();

        Node temp = head;

        while (temp != null) {
            if (stack.peek() != temp.data) {
                return false;
            }
            temp = temp.next;
            stack.pop();
        }
        return true;

    }

    public static void main(String[] args) {
        L_CheckPalindromeLL l1 = new L_CheckPalindromeLL();
        l1.addFirst(5);
        l1.addFirst(4);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addFirst(5);

        l1.printLL();

        l1.addIntoStack();
        System.out.println("is Palindrome : " + l1.checkPalindrome());
    }
}
