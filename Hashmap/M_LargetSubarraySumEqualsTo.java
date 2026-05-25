// Time complexity: O(n)

package Hashmap;

import java.util.HashMap;

public class M_LargetSubarraySumEqualsTo {
    public static void main(String[] args) {
        int[] arr = { 15, -2, 2, -8, 1, 7, 10 };

        HashMap<Integer, Integer> hm = new HashMap<>();

        int sum = 0;
        int len = 0;

        for (int i = 0, n = arr.length; i < n; i++) {
            sum += arr[i];
            if (hm.containsKey(sum)) {
                len = Math.max(len, i - hm.get(sum));
            } else {
                hm.put(sum, i);
            }
        }

        System.out.println(len);
    }
}
