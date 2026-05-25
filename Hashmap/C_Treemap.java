//^ keys are sorted */
//^ Time complexity changes: put, remove and get - O(logn ) */
//* Red Black Trees is used in internal implementation */ 
// Performance: TM < HM

package Hashmap;

import java.util.Collections;
import java.util.TreeMap;

public class C_Treemap {
    public static void main(String[] args) {
        // ascending sorted order
        TreeMap<String, Integer> atm = new TreeMap<>();

        // descending sorted order
        TreeMap<String, Integer> dtm = new TreeMap<>(Collections.reverseOrder());


    }
}
