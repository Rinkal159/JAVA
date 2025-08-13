package BasicStringFunctions;

public class H_CheckAnagram {

    public static void isAnagram(StringBuilder sb, StringBuilder tb) {

        if ((sb.length() != tb.length()) || sb == null || tb == null || sb.isEmpty() || tb.isEmpty()) {
            System.out.println("Invalid strings");
            return;
        }

        for (int i = 0; i < sb.length(); i++) {
            Boolean isFound = false;

            for (int j = 0; j < tb.length(); j++) {

                if (sb.charAt(i) == tb.charAt(j)) {
                    tb.deleteCharAt(j);
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                System.out.println("Not an anagram");
                return;
            }

        }

        System.out.println("An anagram");
    }

    public static void main(String[] args) {
        String s = "eat";
        String t = "tea";

        StringBuilder sb = new StringBuilder(s);
        StringBuilder tb = new StringBuilder(t);

        isAnagram(sb, tb);
    }

}
