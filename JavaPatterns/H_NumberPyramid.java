package JavaPatterns;

public class H_NumberPyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i=1; i<=n;i++) {
            for (int j=n-1; j>=i;j--) {
                System.out.print(" ");
            }
            for (int j=1; j<=i;j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
