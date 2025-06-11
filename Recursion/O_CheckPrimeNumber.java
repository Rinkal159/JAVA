package Recursion;

public class O_CheckPrimeNumber {
    public static Boolean isPrime(int n, int i) {
        if (i >= n / 2) {
            return true;
        }

        if (n % i == 0) {
            return false;
        } else {
            return isPrime(n, i + 1);
        }

    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println("is Prime : " + isPrime(n, 2));
    }
}
