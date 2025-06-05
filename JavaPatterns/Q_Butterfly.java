package JavaPatterns;

public class Q_Butterfly {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // *
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // space
            for (int j = (n - i) * 2; j > 0; j--) {
                System.out.print("  ");
            }
            // *
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        
        for (int i = n - 1; i >= 1; i--) {
            // *
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // space
            for (int j = (n - i) * 2; j > 0; j--) {
                System.out.print("  ");
            }
            // *
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
