package BasicStringFunctions;

import java.util.Scanner;

// String method
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

        x.close();
    }
}


// Number method

// public class Learn {
//     public static boolean isValidNumber(String s) {
//         return s.matches("\\d+");
//     }

//     public static String largetOddNumber(String s) {
//         if (!isValidNumber(s)) {
//             return "Invalid String. You can only enter number string.";
//         }

//         int num = Integer.parseInt(s);

//         if ((num % 10) % 2 != 0) {
//             return s;
//         }

//         int r;
//         while (num != 0) {
//             r = num % 10;
//             num /= 10;

//             if (r % 2 != 0) {
//                 return String.valueOf(num) + String.valueOf(r);
//             }
//         }

//         return "No odd numbers identified";

//     }

//     public static void main(String[] args) {
//         Scanner x = new Scanner(System.in);
//         System.out.print("Number in the form of String : ");
//         String s = x.next();

//         System.out.println(largetOddNumber(s));

//         x.close();
//     }
// }
