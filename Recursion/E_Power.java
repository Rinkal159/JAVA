package Recursion;

public class E_Power {
    public static int printPower(int a, int n) {
        if (n <= 0) {
            return 1;
        }
        int helper = printPower(a, n-1);
        System.out.println("helper : " + helper);
        int pow = a * helper;
        return pow;

    }
    public static void main(String[] args) {
        int n = 5;
        int a = 2;

        System.out.println(printPower(a, n));
    }
}
