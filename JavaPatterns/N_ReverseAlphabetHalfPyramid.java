package JavaPatterns;

public class N_ReverseAlphabetHalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }
    }
}
