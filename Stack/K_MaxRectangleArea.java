import java.util.Stack;

public class K_MaxRectangleArea {

    public static int[] nextSmallerInLeft(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] leftSmall = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!stack.empty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.empty()) {
                leftSmall[i] = -1;
            } else {
                // stack.peek() means smaller element but we want where the greater ends, so +1
                leftSmall[i] = stack.peek() + 1;
            }

            stack.push(i);
        }

        return leftSmall;
    }

    public static int[] nextSmallerInRight(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] rightSmall = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.empty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.empty()) {
                rightSmall[i] = -1;
            } else {
                // stack.peek() means smaller element but we want where the greater ends, so -1
                rightSmall[i] = stack.peek() - 1;
            }

            stack.push(i);
        }

        return rightSmall;

    }

    /*
     * we want greater values, if smaller then can't make rectangle, rectangle will
     * break, so find next smaller to stop
     */

    public static int maxArea(int[] arr) {
        int[] leftSmall = nextSmallerInLeft(arr);
        int[] rightSmall = nextSmallerInRight(arr);
        int maxArea = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            // number of greater values in left
            int left = leftSmall[i] == -1 ? i : Math.abs(i - leftSmall[i]);

            // number of greater values in right
            int right = rightSmall[i] == -1 ? arr.length - 1 - i : Math.abs(i - rightSmall[i]);

            maxArea = Math.max(maxArea, (left + right + 1) * arr[i]); // +1 for own value
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 2, 4, 1, 5, 6 };

        System.out.println(maxArea(arr));
    }
}
