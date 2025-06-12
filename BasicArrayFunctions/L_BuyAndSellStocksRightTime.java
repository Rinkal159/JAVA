package BasicArrayFunctions;

public class L_BuyAndSellStocksRightTime {
    public static int maxProfit(int[] arr) {
        int buying = arr[0];
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            buying = Math.min(arr[i - 1], buying); //to find minimum value in backward, not considering even current value
            max = Math.max((arr[i] - buying), max); //to find maximum profit
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 5, 4, 3, 2, 1 };

        int max = maxProfit(arr);

        if (max < 0) {
            System.out.println("Maximun profit can be " + 0);
        } else {
            System.out.println("Maximun profit can be " + max);
        }
    }
}
