package BasicMathFunctions;
import java.util.Scanner;

public class E_CheckPalindrome {

    public static Boolean isPalindrome(int a) {
        int rem = 0;
        int copyA = a;
        int middleware = 0;

        while (a > 0) {
            rem = a % 10;
            a /= 10;
            middleware = (middleware * 10) + rem;
        }
        
        if ( copyA == middleware) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("The number : ");
        int a = x.nextInt();

        System.out.println("Palindrome : " + isPalindrome(a));
    }
}
