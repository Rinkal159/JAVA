package BasicArrayFunctions;

public class Q_StockBuyAndSellSecondApproach {
    public static int maxProfit(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }

        int shouldBuy = arr[0];
        int i = 0;
        while (arr[i] != max && i < arr.length - 1) {
            shouldBuy = Math.min(arr[i], shouldBuy);
            i++;
        }

        if ((max - shouldBuy) <= 0) {
            return -1;
        }
        return max - shouldBuy;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 15, 20 };
        System.out.println(maxProfit(arr));
    }
}
