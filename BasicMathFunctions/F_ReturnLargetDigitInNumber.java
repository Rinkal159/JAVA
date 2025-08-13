package BasicMathFunctions;

import java.util.Scanner;

public class F_ReturnLargetDigitInNumber {

    public static int printLargetDigit(int a) {
        int rem = 0;
        int max = 0;

        while (a > 0) {
            rem = a % 10;
            a /= 10;
            if (rem > max) {
                max = rem;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("The number : ");
        int a = x.nextInt();

        System.out.println("Larget digit : " + printLargetDigit(a));

        x.close();
    }
}
