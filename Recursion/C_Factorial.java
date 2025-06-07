package Recursion;

public class C_Factorial {
    public static void printFactorial(int n, int fact) {
        if (n <= 0) {
            System.out.println("Factorial : " + fact);
            return;
        }
        fact *= n;
        printFactorial(n - 1, fact);
    }

    public static void main(String[] args) {
        int n = 0;
        int fact = 1;

        printFactorial(n, fact);
    }
}
