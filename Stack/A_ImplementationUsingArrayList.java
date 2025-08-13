import java.util.ArrayList;

public class A_ImplementationUsingArrayList {
    static class Stack {
        static private ArrayList<Integer> arr = new ArrayList<>();

        public static boolean isEmpty() {
            return arr.size() == 0;
        }

        public static void push(int data) { // O(1)
            arr.add(data);
        }

        public static int pop() { // O(1)
            return arr.removeLast();
        }

        public static int peek() { // O(1)
            return arr.get(arr.size() - 1);
        }

    }

    public static void main(String[] args) {
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);

        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}
