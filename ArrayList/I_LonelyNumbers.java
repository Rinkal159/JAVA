package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class I_LonelyNumbers {

    public static void isLonely(ArrayList<Integer> arr) {

        Collections.sort(arr);

        int count = 0;

        for (int i = 1; i < arr.size() - 1; i++) {

            if (arr.get(i) + 1 == arr.get(i + 1) ||
                    arr.get(i) - 1 == arr.get(i - 1) ||
                    arr.get(i) == arr.get(i + 1) ||
                    arr.get(i) == arr.get(i - 1)) {

                continue;

            } else {
                System.out.println(arr.get(i));
                count++;
            }
        }

        // first number
        if (arr.get(0) + 1 != arr.get(1) && arr.get(0) != arr.get(1)) {
            System.out.println(arr.get(0));
            count++;
        }

        // last number
        if (arr.get(arr.size() - 1) != arr.get(arr.size() - 2) + 1
                && arr.get(arr.size() - 1) != arr.get(arr.size() - 2)) {
            System.out.println(arr.get(arr.size() - 1));
            count++;
        }

        if (count == 0) {
            System.out.println("There is zero lonely number");
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(4);
        arr.add(6);

        System.out.println("Lonely numbers : ");

        if (arr.size() == 1) {
            System.out.println(arr.get(0));
        } else {
            isLonely(arr);
        }

    }
}
