package BasicMathFunctions;

public class N_BinomialCoefficient {
    public static int calcFactorial(int x) {
        int fact = 1;
        for (int i = x; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        int factN = calcFactorial(n);
        int factR = calcFactorial(r);
        int factNMinusR = calcFactorial(n - r);

        System.out.println("Binomial coefficient : " + factN / (factR * factNMinusR));
    }
}
