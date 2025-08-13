package BasicMathFunctions;

import java.util.*;

public class A_NumberOfDigitsInNumber {

    public static int countDigits(int a) {
        int count = 0;
        if (a == 0) {
            return ++count;
        }

        while (a > 0) {
            a /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("The number : ");
        int a = x.nextInt();

        System.out.println("Number of digits : " + countDigits(a));

        x.close();
    }
}