package BasicStringFunctions;

public class C_MakeREVERSEinArray {
    public static void makeReverse(String[] s) {
        for (int i=0; i<=s.length/2;i++) {
            int left = i;
            int right = s.length - i -1;

            String leftChar = s[left];
            String rightChar = s[right];

            s[left] = rightChar;
            s[right] = leftChar;
        }

        for (String chars : s) {
            System.out.print(chars);
        }

    } 
    public static void main(String[] args) {
        String[] s = {"h", "e", "l", "l", "o"};

        makeReverse(s);
    }
}
