import java.util.Stack;
// time complexity: O(n);

public class C_PushAtBottom {
    public static void pushBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int removedVal = stack.pop();
        pushBottom(stack, data);
        stack.push(removedVal);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        pushBottom(stack, 4);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
