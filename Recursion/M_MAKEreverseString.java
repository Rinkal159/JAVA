package Recursion;

public class M_MAKEreverseString {
    public static StringBuilder printNum(StringBuilder sb, int i) {
        if(i==sb.length()/2) {
            return sb;
        }
        int low = i;
        int high = sb.length() - 1-i;

        char temp = sb.charAt(low);
        sb.setCharAt(low, sb.charAt(high));
        sb.setCharAt(high, temp);

        return printNum(sb, i+1);
    }

    public static void main(String[] args) {
        String s = "hello";
        StringBuilder sb = new StringBuilder(s);

        System.out.println(printNum(sb, 0));
    }
}