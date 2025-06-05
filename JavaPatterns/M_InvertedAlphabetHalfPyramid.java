package JavaPatterns;

public class M_InvertedAlphabetHalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }
}
