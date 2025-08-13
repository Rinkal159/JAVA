package BasicMathFunctions;

import java.util.Scanner;

public class H_CheckArmstrong {
    
    public static int calcCount(int a) {
        int count = 0;

        while (a != 0) {
            a /= 10;
            count++;
        }

        return count;

    }

    public static Boolean isArmstrong(int count, int a) {
        int rem = 0;
        int sum = 0;
        int temp = a;

        while (temp != 0) {
            rem = temp % 10;
            temp /= 10;
            sum += (Math.pow(rem, count));
        }

        return a == sum;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("The number : ");
        int a = x.nextInt();

        System.out.println("ArmStrong : " + isArmstrong(calcCount(a), a));

        x.close();
    }
}
