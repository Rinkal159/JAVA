import java.util.Stack;
// time complexity : O(n);

public class J_DuplicateParantheses {
    public static boolean duplicateParantheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int temp = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);

            // skip 
            if (currChar != '(' && currChar != ')') {
                continue;
            }

            // only push opening
            if (currChar == '(') {
                stack.push(i);

            } else if (currChar == ')') {
                if (s.charAt(i - 1) == ')' && s.charAt(stack.peek() + 1) == '(' && temp == stack.peek() + 1) {
                    return true;
                }
                if (i != s.length() - 1 && s.charAt(i + 1) == ')') {
                    temp = stack.peek();
                }
                stack.pop();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "(())";

        System.out.println("Duplicate parantheses : " + duplicateParantheses(s));
    }
}
