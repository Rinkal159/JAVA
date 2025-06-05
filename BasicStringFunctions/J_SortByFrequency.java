package BasicStringFunctions;

import java.util.*;

public class J_SortByFrequency {

    public static void noDuplicates(StringBuilder sb) {

        for (int i = 0; i < sb.length()-1; ) {

            if(sb.charAt(i) == sb.charAt(i+1)) {
                sb.deleteCharAt(i);
            } else {
                i++;
            }
        }

        System.out.println("Sorted characters by frequency : " + sb);
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("The string : ");
        String s = x.next();

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        String str = new String(arr);
        StringBuilder sb = new StringBuilder(str);

        noDuplicates(sb);
    }
}