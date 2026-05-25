// Time complexity: O(n + m)

package Hashmap;

import java.util.LinkedHashSet;

public class K_Intersection {
    public static void main(String[] args) {
        int[] arr1 = { 7, 3, 9, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        for (int i : arr1) {
            lhs.add(i);
        }

        for (int i : arr2) {
            if (lhs.contains(i)) {
                System.out.println(i);
                lhs.remove(i);
            }
        }
    }
}
