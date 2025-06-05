package BasicMathFunctions;
import java.util.*;

public class M_Factorial {
    public static int printFact(int a) {
        int fact = 1;
        for (int i = a; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        try {
            System.out.print("A : ");
            int a = x.nextInt();

            System.out.println("The factorial : " + printFact(a));

        } catch (InputMismatchException err) {
            System.out.println("User cannot enter decimal values : " + err);
        }

    }
}
