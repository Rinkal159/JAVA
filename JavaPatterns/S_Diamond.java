package JavaPatterns;

public class S_Diamond {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            // *
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = n - 1; i >= 1; i--) {
            // space
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            // *
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
