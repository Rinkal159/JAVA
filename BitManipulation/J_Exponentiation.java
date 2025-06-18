package BitManipulation;

public class J_Exponentiation {
    public static void printExpo(int n, int pow) {
        int ans = 1;
        while (pow != 0) {
            if ((pow & 1) == 1) {
                ans *= n;
            }
            n = n * n;
            pow = pow >> 1;

        }
        System.out.println("Fast Exponentiation : " + ans);
    }

    public static void main(String[] args) {
        int n = 9;
        int pow = 5;

        printExpo(n, pow);
    }
}
