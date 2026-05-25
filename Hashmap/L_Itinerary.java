// Time complexity: O(n)

package Hashmap;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class L_Itinerary {

    public static String getFrom(LinkedHashMap<String, String> fromTo, LinkedHashMap<String, String> toFrom) {
        for (String k : fromTo.keySet()) {
            if (!toFrom.containsKey(k)) {
                return k; // starting point
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[][] arr = {
                { "Chennai", "Bengaluru" },
                { "Mumbai", "Delhi" },
                { "Goa", "Chennai" },
                { "Delhi", "Goa" }
        };

        LinkedHashMap<String, String> fromTo = new LinkedHashMap<>();
        for (int i = 0, n = arr.length; i < n; i++) {
            fromTo.put(arr[i][0], arr[i][1]);
        }

        LinkedHashMap<String, String> toFrom = new LinkedHashMap<>();
        for (int i = 0, n = arr.length; i < n; i++) {
            toFrom.put(arr[i][1], arr[i][0]);
        }

        ArrayList<String> al = new ArrayList<>();
        String from = getFrom(fromTo, toFrom);

        al.add(from);

        String stop = from;
        for (String k : fromTo.keySet()) {
            String value = fromTo.get(stop);
            al.add(value);
            stop = value;
        }

        System.out.println(al);

    }
}
