package BasicMathFunctions;

import java.util.Scanner;

public class J_CheckPrime {

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

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("The number : ");
        int a = x.nextInt();

        if (isPrime(a)) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }

        x.close();
    }
}
