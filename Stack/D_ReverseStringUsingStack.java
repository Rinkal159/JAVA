import java.util.Stack;
// time complexity : O(n)

public class D_ReverseStringUsingStack {
    public static void reverse(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder("");
        while (!stack.empty()) {
            char val = stack.pop();
            sb.append(val);
        }
        System.out.println(sb); //laknir
        s = sb.toString();
    }

    public static void main(String[] args) {
        String s = "rinkal";

        reverse(s);
        System.out.println(s); // rinkal, no change due to pass by value
    }
}
