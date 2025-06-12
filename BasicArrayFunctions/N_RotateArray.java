package BasicArrayFunctions;

import java.util.*;

public class N_RotateArray {
    public static void printRorate(ArrayList<Integer> arr, int target) {
        if (target == 0) {
            System.out.println(arr);
            return;
        }
        arr.add(arr.get(0));
        arr.remove(arr.get(0));
        printRorate(arr, target - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int target = 3;

        printRorate(arr, target);
    }
}
