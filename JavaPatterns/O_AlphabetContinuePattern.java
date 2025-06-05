package JavaPatterns;

public class O_AlphabetContinuePattern {
    public static void main(String[] args) {
        int n = 4;
        char a = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(((char)(a++)));
            }
            System.out.println();
        }
    }
}
