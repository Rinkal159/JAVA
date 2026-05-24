// Time complexity: O(n)

package Hashmap;

import java.util.HashMap;

public class E_ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0, n = s.length(); i < n; i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (int i = 0, n = t.length(); i < n; i++) {
            char c = t.charAt(i);

            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) - 1);
                if (hm.get(c) == 0) {
                    hm.remove(c);
                }
            } else {
                return false;
            }
        }

        return hm.isEmpty();
    }

    public static void main(String[] args) {
        String s = "code";
        String t = "doce";

        System.out.println(isAnagram(s, t));

    }
}
