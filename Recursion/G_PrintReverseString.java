package Recursion;

public class G_PrintReverseString {
    public static void printReverese(String s, int n) {
        if(n<0) {
            return;
        }
        System.out.print(s.charAt(n));
        printReverese(s, n-1);
    }
    public static void main(String[] args) {
        String s = "abcd";
        int n = s.length()-1;

        printReverese(s, n);
    }
}
