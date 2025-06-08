package Recursion;

public class B_Sum {
    public static void printNum(int i, int n, int sum) {
        if (i > n) {
            System.out.println("sum of first n numbers : " + sum);
            return;
        }
        sum += i;
        printNum(i + 1, n, sum);
    }

    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        printNum(1, n, sum);
    }
}
