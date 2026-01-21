package Recursion;
import java.util.Scanner;

public class R_MinimumCoins {
    public static int count = 0;

    public static int minCoin(int total, int[] coins, int i) {
        if (total == 0) {
            return count;
        }

        if (total - coins[i] >= 0) {
            count++;
            total -= coins[i];
            return minCoin(total, coins, i);
        } else {
            return minCoin(total, coins, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("How much is the total? : ");
        int total = x.nextInt();

        while (total <= 0) {
            System.out.print("How much is the total that is greater than 0? : ");
            total = x.nextInt();
        }

        int[] coins = { 25, 10, 5, 1 };

        System.out.println("Minimum coins needed: " + minCoin(total, coins, 0));

        x.close();
    }
}
