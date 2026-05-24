// Time complexity: O(log10(n))

import java.util.Scanner;

public class A_CountDigitsInNumber {
    public static int myFunc(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int num = sc.nextInt();

        System.out.println(myFunc(num));

        // log 10 solution
        System.out.println((int)Math.log10(num) + 1);

        sc.close();
    } 
}
