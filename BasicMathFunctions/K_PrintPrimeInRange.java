package BasicMathFunctions;

import java.util.*;

public class K_PrintPrimeInRange {

    public static Boolean isPrime(int a) {
        if (a % 2 == 0) {
            return false;
        }
        if (a <= 1) {
            return false;
        }
        if (a == 2) {
            return true;
        }
        for (int i = 3; i <= Math.sqrt(a); i += 2) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> printPrime(int a) {
        ArrayList<Integer> primes = new ArrayList<>(Arrays.asList(1, 2));

        for (int i = 3; i <= a; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("The number : ");
        int a = x.nextInt();

        System.out.println("Prime numbers : " + printPrime(a));
    }
}
