package Recursion;
public class J_MoveX {
    public static int count = 0;
    public static void moveX(StringBuilder sb, int i) {
        if(sb.length() - i == count) {
            System.out.println(sb);
            return;
        }

        if(sb.charAt(i) == 'x') {
            count++;
            sb.append(sb.charAt(i));
            sb.deleteCharAt(i);

            moveX(sb, i);
        } else {
            moveX(sb, i+1);
        }
    }

    public static void main(String[] args) {
        String s = "axxbxddxxcxb";
        StringBuilder sb = new StringBuilder(s);

        moveX(sb, 0);
    }
}
