// Time complexity: O(n)

package Hashmap;

import java.util.HashMap;

public class O_TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 5, 11 };
        int target = 9;

        HashMap<Integer, Integer> hm = new HashMap<>(); // target - arr[i], index

        for (int i = 0, n = arr.length; i < n; i++) {
            int difference = target - arr[i];

            if (hm.containsKey(difference)) {
                System.out.println("[" + hm.get(difference) + ", " + i + "]");
                break;
            }
            hm.put(arr[i], i);
        }
    }
}
