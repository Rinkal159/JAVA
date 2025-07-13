package ArrayList;

import java.util.ArrayList;

public class B_FindMax {
    public static int findMax(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(7);
        arr.add(3);
        arr.add(2);
        arr.add(8);

        System.out.println("Maximum value : " + findMax(arr));
    }
}
