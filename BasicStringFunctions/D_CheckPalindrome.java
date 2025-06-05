package BasicStringFunctions;
import java.util.*;

public class D_CheckPalindrome {
    
    public static Boolean isPalindrome(String s) {
        StringBuilder sCopy = new StringBuilder("");

        for (int i=s.length()-1; i>=0; i--) {
            sCopy.append(s.charAt(i));
        }

        String sbCopy = sCopy.toString();

        if(s.equals(sbCopy)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("String : ");
        String s = x.next();

        System.out.println("Palindrome : " + isPalindrome(s));

    }
}
