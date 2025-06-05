package BasicStringFunctions;

import java.util.Scanner;

public class E_LargestOddNumber {

    public static Boolean isNumberString(String s) {
        return s != null && s.matches("\\d+");
    }

    public static void checkLargetOddNumber(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = sb.length() - 1; i >= 0; i--) {
            int first = sb.length() - 1 - i;

            if (sb.charAt(first) == '0') {
                sb.deleteCharAt(first);

            } else if (sb.charAt(i) == '1' || sb.charAt(i) == '3' || sb.charAt(i) == '5' || sb.charAt(i) == '7'
                    || sb.charAt(i) == '9') {
                System.out.println("Larget odd number : " + sb);
                return;

            } else {
                sb.deleteCharAt(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("String : ");
        String s = x.next();

        if (isNumberString(s)) {
            checkLargetOddNumber(s);
        } else {
            System.out.println("Invalid input");
        }
    }
}
