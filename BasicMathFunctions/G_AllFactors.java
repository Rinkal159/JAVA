// Time complexity: O(root n + k log k)

import java.util.ArrayList;
import java.util.Collections;

public class G_AllFactors {
    public static ArrayList<Integer> printFactors(int n, int initialize, int increment) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = initialize; i <= Math.sqrt(n); i += increment) {
            if (n % i == 0) {
                al.add(i);
                if (n / i != i) {
                    al.add(n / i);
                }
            }
        }

        return al;
    }

    public static void main(String[] args) {
        int n = 17;

        // even
        int initialize = 2;
        int increment = 1;

        // odd
        if (n % 2 != 0) {
            initialize = 3;
            increment = 2;
        }

        ArrayList<Integer> al = printFactors(n, initialize, increment);

        Collections.sort(al);

        System.out.println(1);
        for (int i : al) {
            System.out.println(i);
        }
        System.out.println(n);

    }
}
