// Time complexity: O(n + m)

package Hashmap;

import java.util.LinkedHashSet;

public class J_Union {
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        for(int i : arr1) {
            lhs.add(i);
        }
        for(int i : arr2) {
            lhs.add(i);
        }

        System.out.println(lhs);
    }
}
