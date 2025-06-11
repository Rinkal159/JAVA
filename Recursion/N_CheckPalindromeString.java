package Recursion;

public class N_CheckPalindromeString {
    public static String emptystr = "";

    public static Boolean printNum(String s, int i) {
        if (i == s.length()/2) {
            return true;
        }

        if(s.charAt(i) == s.charAt(s.length()-1-i)) {
            return printNum(s, i-1);
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String s = "aabbaa";

        Boolean result = printNum(s, s.length() - 1);
        System.out.println(result);
    }
}