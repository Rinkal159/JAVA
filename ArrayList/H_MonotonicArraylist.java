package ArrayList;

import java.util.ArrayList;

public class H_MonotonicArraylist {
    public static Boolean isMonotonic(ArrayList<Integer> arr) {

        Boolean decresing = false;
        Boolean increasing = false;

        for (int i = 0; i < arr.size() - 1; i++) {

            if (arr.get(i) < arr.get(i + 1)) {
                if (decresing) {
                    return false;
                }
                increasing = true;
                
            } else if (arr.get(i) > arr.get(i + 1)) {
                if (increasing) {
                    return false;
                }
                decresing = true;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(6);
        arr.add(7);
        arr.add(10);

        System.out.println("is monotonic : " + isMonotonic(arr));
    }
}
