package BackTracking;
//time complexity : O(2^n * n) 
// space complexity : O(n);

public class B_SubSetsOfString {
    public static void printSubsets(String s, String ans, int i) {
        if (i == s.length()) {

            System.out.println();
            if (ans.length() == 0) {
                System.out.println("Null");
            } else {
                System.out.println(ans);
            }
            System.out.println();

            return;
        }

        printSubsets(s, ans + s.charAt(i), i + 1); // yes
        System.out.println("After return ans : " + ans);
        System.out.println("After return i : " + i);

        printSubsets(s, ans, i + 1); // no
        System.out.println("VERY After return ans : " + ans);
        System.out.println("VERY After return i : " + i);
    }

    public static void main(String[] args) {
        String s = "abc";

        printSubsets(s, "", 0);
    }
}
