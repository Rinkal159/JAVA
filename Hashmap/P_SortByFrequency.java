// Time complexity: O(n)

package Hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class P_SortByFrequency {

    public static String printRepeated(char c, int limit) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < limit; i++) {
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aabbccc";

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0, n = s.length(); i < n; i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }

        TreeMap<Integer, String> freq = new TreeMap<>(Collections.reverseOrder());
        for (char c : hm.keySet()) {
            freq.put(hm.get(c), freq.getOrDefault(hm.get(c), "") + printRepeated(c, hm.get(c)));
        }

        for (int i : freq.keySet()) {
            System.out.print(freq.get(i));
        }

        System.out.println();

    }
}
