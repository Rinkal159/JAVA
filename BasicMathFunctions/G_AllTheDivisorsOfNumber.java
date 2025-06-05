package BasicMathFunctions;
import java.util.*;

public class G_AllTheDivisorsOfNumber {

    public static ArrayList<Integer> printAllDivisors(int a) {
        ArrayList<Integer> divisors = new ArrayList<>();

        for(int i=1; i<a; i++) {
            if(a%i==0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("The number : ");
        int a = x.nextInt();

        System.out.println("Divisors : " + printAllDivisors(a));
    }
}
