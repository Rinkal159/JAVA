package Recursion;

public class Q_SumOfAllDigitsInOneNumber {
    public static int printSum(int n) {
        if (n == 0) {
            return 0;
        }
        
        return (n % 10) + printSum(n / 10);
    }

    public static void printFinalSum(int n) {
        int sum = printSum(n);

        if (sum > 9) {
            printFinalSum(sum);
        } else {
            System.out.println("sum of all digits : " + sum);
        }
    }

    public static void main(String[] args) {
        int n = 1236;

        printFinalSum(n);
    }
}
