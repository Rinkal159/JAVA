package BasicMathFunctions;

import java.util.Scanner;

public class L_GCD {

    public static int printGCD(int a, int b) {
        int rem = 1;

        while (rem > 0) {
            rem = a % b;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("A : ");
        int a = x.nextInt();
        System.out.print("B : ");
        int b = x.nextInt();

        a = Math.max(a, b);
        b = Math.min(a, b);

        System.out.println(printGCD(a, b));

        x.close();
    }
}
