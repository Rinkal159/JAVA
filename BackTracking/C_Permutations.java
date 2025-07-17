package BackTracking;
// time complexity : O(n! * n);
// space complexity : O(n);

public class C_Permutations {
    public static void findPermitations(String s, String ans) {
        if (s.length() == 0) {
            System.out.println();
            System.out.println(ans);
            System.out.println();

            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String newS = s.substring(0, i) + s.substring(i + 1);
            System.out.println("Before return str : " + s);
            System.out.println("Before return ans : " + ans);
            
            findPermitations(newS, ans + s.charAt(i));
        }

        System.out.println("After return str : " + s);
        System.out.println("After return ans : " + ans);
    }

    public static void main(String[] args) {
        String s = "abc";

        findPermitations(s, "");
    }
}
