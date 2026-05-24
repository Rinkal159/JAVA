// (key, value)
//^ HashMap is Unordered, no indexing
// Worst case time complexity: O(n) when hashFunction returns same bucket index continuously so new node is inserted in one bucket only

package Hashmap;

import java.util.HashMap;

public class A_Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();


        //* Operations */

        // put - O(1)
        hm.put("Rinkal", 19);
        hm.put("Krina", 23);
        hm.put("Mahi", 20);

        // // size
        // System.out.println(hm.size());

        // // get - O(1) (if key is not in the hashmap, then it returns null)
        // System.out.println(hm.get("Devang"));

        // // contains - O(1) - returns true or false 
        // System.out.println(hm.containsKey("Krina"));

        // // remove - O(1) - returns the removed key's value, it defined key is not in the map, then returns null
        // System.out.println(hm.remove("Mahi"));

        // // isEmpty
        // System.out.println(hm.isEmpty());

        // // clear - deletes all the data
        // hm.clear();

        System.out.println(hm.keySet()); // gets keys
        System.out.println(hm.values()); // gets values
        System.out.println(hm.entrySet()); // gets pair of keys and values

        //* Iterate over hashmap */ 

        // Set<String> keys = hm.keySet(); // get all the keys from hashmap, and stores inside a set
        // for (String s : keys) {
        //     System.out.println("key: " + s + ", value: " + hm.get(s));
        // }


        //* Internal implementation of hashmap */
        // it stores data in the form of 'Arrays of linked list' (Buckets)


    }
}
