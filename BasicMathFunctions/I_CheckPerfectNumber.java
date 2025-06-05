package BasicMathFunctions;
import java.util.*;

public class I_CheckPerfectNumber {

    public static ArrayList<Integer> printDivisors(int a) {
        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i=1; i<a; i++) {
            if(a%i==0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    public static Boolean isPerfect(ArrayList<Integer> divisors, int a) {
        int sumOfDivisors = 0;
        for(int div : divisors) {
            sumOfDivisors += div;
        }

        if(a == sumOfDivisors) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("The number : ");
        int a = x.nextInt();

        System.out.println("Perfect Number : " + isPerfect(printDivisors(a), a));
    }
}
