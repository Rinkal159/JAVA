package BasicStringFunctions;

import java.util.*;

public class I_CheckDuplicates {

    public static void noDuplicates(String s) {
        if(s == null || s.isEmpty() || s.matches(".*\\d.*")) {
            System.out.println("Invalid string");
            return;
        }

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            Boolean isDuplicated = false;

            for (int j = 0; j < sb.length(); j++) {
                if (s.charAt(i) == sb.charAt(j)) {
                    isDuplicated = true;
                    break;
                }
            }

            if (!isDuplicated) {
                sb.append(s.charAt(i));
            }
        }

        System.out.println("String without duplicates : " + sb);
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("The string : ");
        String s = x.next();

        noDuplicates(s);
    }
}
