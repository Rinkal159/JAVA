package BasicMathFunctions;

import java.util.*;

public class I_CheckPerfectNumber {

    public static boolean printDivisors(int a) {
        ArrayList<Integer> divisors = new ArrayList<>();
        int sum = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                divisors.add(i);
                sum += i;
            }
        }
        return sum==a ? true : false;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("The number : ");
        int a = x.nextInt();

        System.out.println("Perfect Number : " + printDivisors(a));

        x.close();
    }
}
