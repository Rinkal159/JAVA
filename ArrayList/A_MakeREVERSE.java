package ArrayList;

import java.util.ArrayList;

public class A_MakeREVERSE {
    public static void makeReverseArrayList(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() / 2; i++) {
            int low = i;
            int high = arr.size() - 1 - i;

            int lowEle = arr.get(low);
            int highEle = arr.get(high);

            arr.set(low, highEle);
            arr.set(high, lowEle);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        makeReverseArrayList(arr);

        arr.forEach(i -> System.out.print(i + " "));

    }
}
