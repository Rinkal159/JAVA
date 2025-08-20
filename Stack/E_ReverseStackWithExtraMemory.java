import java.util.ArrayList;
import java.util.Stack;

public class E_ReverseStackWithExtraMemory {
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void reverse(Stack<Integer> stack) {

        if (stack.empty()) {
            for (int i = 0; i < arr.size(); i++) {
                stack.push(arr.get(i));
            }
            return;
        }
        int top = stack.pop();
        arr.add(top);

        reverse(stack);
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
