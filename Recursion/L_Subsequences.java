package Recursion;

public class L_Subsequences {
    public static void printSubSEQ(int i, String s, String newString) {
        if(i>s.length()-1) {
            System.out.println(newString);
            return;
        }
        char currChar = s.charAt(i);

        // printSubSEQ(i+1, s, newString+currChar);

        // printSubSEQ(i+1, s, newString);
    }
    public static void main(String[] args) {
        String s = "abc";

        printSubSEQ(0, s, "");
    }
}
