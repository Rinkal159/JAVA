package Recursion;

public class B_Sum {
    public static void printNum(int n, int sum) {
        if(n>5) {
            System.out.println("sum of first n numbers : " + sum);
            return;
        }
        sum += n;
        printNum(n+1, sum);
    }
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;

        printNum(n, sum);
    }
}
