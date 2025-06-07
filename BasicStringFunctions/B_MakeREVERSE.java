package BasicStringFunctions;

public class B_MakeREVERSE {
    public static void main(String[] args) {
        StringBuilder s  = new StringBuilder("hello");

        for(int i=0; i<=s.length()/2;i++) {
            int left = i;
            int right = s.length() - i-1;

            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            s.setCharAt(left, rightChar);
            s.setCharAt(right, leftChar);
        } 
        System.out.println(s);
    }
}
