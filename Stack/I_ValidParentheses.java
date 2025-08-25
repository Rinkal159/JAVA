import java.util.Stack;
// time complexity : O(n);

public class I_ValidParentheses {
    public static boolean validString(String s) {
        int i = 0;
        while (i != s.length()) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == ')'
                    || s.charAt(i) == ']' || s.charAt(i) == '}') {
                i++;
            } else {
                return false;
            }
        }

        return true;
    }

    public static boolean validParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);

            if (!stack.empty()) {

                if (currChar == ')' || currChar == ']' || currChar == '}') {
                    if ((currChar == ')' && stack.peek() == '(')
                            || (currChar == ']' && stack.peek() == '[')
                            || (currChar == '}' && stack.peek() == '{')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    stack.push(currChar);
                }

            } else {
                stack.push(currChar);
            }
        }

        // scenario : ())
        if (!stack.empty()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "({})[]";

        if (!validString(s)) {
            System.out.println("String must contain only '(', '[', '{', ')', ']', '}' parantheses");
        } else {
            System.out.println("is Valid Parantheses : " + validParentheses(s));
        }

    }
}
