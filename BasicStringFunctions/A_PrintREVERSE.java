package BasicStringFunctions;

public class A_PrintREVERSE {
    public static void main(String[] args) {
        StringBuilder s  = new StringBuilder("hello");

        for (int i=s.length()-1; i>=0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
