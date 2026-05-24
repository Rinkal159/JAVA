// unique elements, no duplicates
// unordered, no indexing
// NULL is allowed
//^ HashSet is implemented by HashMap

package Hashmap;

import java.util.HashSet;
import java.util.Iterator;

public class F_Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(1); // simply ignore

        // System.out.println(hs);

        // // size
        // System.out.println(hs.size());

        // // contains - returns true or false
        // System.out.println(hs.contains(1));

        // // remove - returns boolean value - if succeefully removes then true, otherwise false
        // System.out.println(hs.remove(2));
        // System.out.println(hs);

        // // isEmpty - returns boolean value
        // System.out.println(hs.isEmpty());

        // // clear - clears all elements
        // hs.clear();


        //* Iteration */ 
        // using iterator - iterator initiliazes from null
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // using enhanced for loop
        for (int i : hs) {
            System.out.println(i);
        }
     
    }
}
