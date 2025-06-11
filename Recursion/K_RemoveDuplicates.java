package Recursion;

public class K_RemoveDuplicates {
    public static StringBuilder sb = new StringBuilder("");

    public static void removeDup(int i, String s) {
        Boolean isDuplicate = false;

        if (i > s.length() - 1) {
            System.out.println("String without duplicates : " + sb);
            return;
        }

        for (int j = 0; j < sb.length(); j++) {
            if (s.charAt(i) == sb.charAt(j)) {
                isDuplicate = true;
                break;
            }
        }

        if (!isDuplicate) {
            sb.append(s.charAt(i));
        }

        removeDup(i + 1, s);

    }

    public static void main(String[] args) {
        String s = "abbccdda";

        removeDup(0, s);
    }
}
