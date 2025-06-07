package Recursion;

public class C_Factorial {
    public static void printFactorial(int i, int n, int fact) {
        if (i > n) {
            System.out.println("Factorial : " + fact);
            return;
        }
        fact *= i;
        printFactorial(i + 1, n, fact);
    }

    public static void main(String[] args) {
        int n = 10;
        int fact = 1;

        printFactorial(1, n, fact);
    }
}
