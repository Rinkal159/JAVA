// Time complexity: O(n)

package Hashmap;

import java.util.HashSet;

public class I_CountDistinctNumbers {
    public static int printDistinct(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0, n = arr.length; i < n; i++) {
            hs.add(arr[i]);
        }

        return hs.size();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 2, 1 };

        System.out.println(printDistinct(arr));

    }
}
