import java.util.Stack;
// time complexity : O(n)
/*
    Four forms of this question : 
        1. next greater element in right
        2. next greater element in left
        3. next smaller element in right
        4. next smaller element in left
*/

public class H_NextGreaterElement {
    public static void nextGreaterFind(int[] arr, int[] nextGreater) {
        Stack<Integer> stack = new Stack<>();

        // backward compare
        for (int i = arr.length - 1; i >= 0; i--) {

            // pop all the smaller elements 
            while (!stack.empty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.empty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = stack.peek();
            }

            stack.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 10, 1, 13, 0 };
        int[] nextGreater = new int[arr.length];

        nextGreaterFind(arr, nextGreater);

        for (int i : nextGreater) {
            System.out.print(i + " ");
        }
    }
}
