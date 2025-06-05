package BasicMathFunctions;

import java.util.Scanner;

public class J_CheckPrime {

    public static Boolean isPrime(int a) {

        if (a == 2) {
            return true;
        }
        for (int i = 2; i <= a/2; i++) {
            if (a % i == 0) {
                return false;
            }
            System.out.println("i " + i);
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
            System.out.println("Its is not a prime number");
        }
    }
}
