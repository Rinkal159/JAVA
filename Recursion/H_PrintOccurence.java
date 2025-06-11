package Recursion;

public class H_PrintOccurence {
    public static int first = -1;
    public static int last = -1;

    public static void printOccur(String s, char a, int i) {
        if (i >= s.length()) {
            System.out.println("first occurence at index " + first);
            System.out.println("last occurence at index " + last);
            return;
        }

        if (s.charAt(i) == 'a') {
            if (first == -1) {
                first = i;
            } else {
                last = i;
            }
        }
        printOccur(s, a, i + 1);

    }

    public static void main(String[] args) {
        String s = "babbbbbbba";
        char a = 'a';

        int i = 0;

        printOccur(s, a, i);
    }
}
