package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class J_KeyFollowingTarget {
    public static int findFrequentTargetFollowingKEY(ArrayList<Integer> arr, int key) {

        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) == key) {
                if (map.containsKey(arr.get(i + 1))) {
                    map.put(arr.get(i + 1), map.get(arr.get(i + 1)) + 1);
                } else {
                    map.put(arr.get(i + 1), 1);
                }
            }
        }

        int maxKey = -1;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(200);
        arr.add(100);
        arr.add(300);
        arr.add(100);
        arr.add(300);
        arr.add(100);
        arr.add(400);
        arr.add(100);

        int key = 100;

        int result = findFrequentTargetFollowingKEY(arr, key);
        System.out.println(result);
    }
}
