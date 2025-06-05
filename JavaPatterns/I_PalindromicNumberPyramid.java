package JavaPatterns;
public class I_PalindromicNumberPyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= 4; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
