// Time complexity: O(n)

package Hashmap;

import java.util.HashMap;

public class D_MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 1, 3, 1, 5};
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i : arr) {
            if (hm.containsKey(i)) { // exists
                hm.put(i, hm.get(i) + 1);
            } else { // doesn't exist
                hm.put(i, 1);
            }


            //^ alternate
            // hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        double limit = (double) arr.length / 3;

        for (int s : hm.keySet()) {
            if (hm.get(s) > limit) {
                System.out.println(s);
            }
        }

    }
}
