package JavaPatterns;

public class R_HalfNumberButterfly {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // space
            for (int j = (n - i) * 2; j > 0; j--) {
                System.out.print("  ");
            }
            // numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
