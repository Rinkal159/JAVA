import java.util.Stack;

public class F_ReverseStackWithNoExtraMemory {
    public static void pushButtom(Stack<Integer> stack, int data) {
        if (stack.empty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushButtom(stack, data);
        stack.push(top);
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.empty()) {
            return;
        }
        int val = stack.pop();
        reverse(stack);
        pushButtom(stack, val);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        reverse(stack);

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
