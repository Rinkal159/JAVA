import java.util.Stack;

public class G_StockSpan {
    public static void stockSpan(int[] stocks, int[] span) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while (!stack.empty() && stocks[stack.peek()] <= currPrice) {
                stack.pop();
            }

            if (stack.empty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }
            stack.push(i);
        }

    }

    public static void main(String[] args) {
        int[] stocks = { 6, 5, 7, 4, 2, 5 };
        int[] span = new int[stocks.length];

        stockSpan(stocks, span);

        for (int i : span) {
            System.out.print(i + " ");
        }
    }
}
