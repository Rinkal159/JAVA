package BasicStringFunctions;

public class G_RotateString {
    public static void isRotated(StringBuilder sb, StringBuilder goalb) {

        if ((sb.length() != goalb.length()) || sb == null || goalb == null || sb.isEmpty() || goalb.isEmpty()) {
            System.out.println("Invalid strings");
            return;
        }

        for (int i = 0; i < sb.length(); i++) {
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);

            if (sb.toString().equals(goalb.toString())) {
                System.out.println("Goal is the rotated string of s");
                return;
            }
        }
        System.out.println("Goal is not the rotated string of s");
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "abcde";

        StringBuilder sb = new StringBuilder(s);
        StringBuilder goalb = new StringBuilder(goal);

        isRotated(sb, goalb);

    }
}
