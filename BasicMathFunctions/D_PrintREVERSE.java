package BasicMathFunctions;
public class D_PrintREVERSE {
    public static void main(String[] args) {
        int n = 789347;
        int div = 1;

        while (n > 0) {
            div = n % 10;
            n /= 10;
            System.out.print(div);
        }
    }
}
