package BasicMathFunctions;

import java.util.Scanner;

public class H_CheckArmstrong {

    public static int calcCount(int a) {
        int rem = 0;
        int copyA = a;
        int count = 0;

        while (copyA > 0) {
            rem = copyA % 10;
            copyA /= 10;
            count++;
        }
        return count;

    }

    public static Boolean isArmstrong(int count, int a) {
        int rem = 0;
        int lastDigit = 0;
        int copyA = a;

        while (copyA > 0) {
            rem = copyA % 10;
            copyA /= 10;
            lastDigit += (Math.pow(rem, count));
        }

        if (a == lastDigit) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("The number : ");
        int a = x.nextInt();

        System.out.println("ArmStrong : " + isArmstrong(calcCount(a), a));

        x.close();
    }
}
