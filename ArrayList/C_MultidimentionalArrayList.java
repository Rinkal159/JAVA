package ArrayList;

import java.util.ArrayList;

public class C_MultidimentionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();

        for (int i = 1; i <= 15; i++) {
            if (i <= 5) {
                arr1.add(i);
            }
            if (i > 5 && i <= 10) {
                arr2.add(i);
            }
            if (i > 10 && i <= 15) {
                arr3.add(i);
            }
        }
        
        list.add(arr1);
        list.add(arr2);
        list.add(arr3);

        // Advance for loop
        System.out.println("Advance for loop : ");

        for (ArrayList<Integer> i : list) {
            System.out.println(i);
        }

        // for each
        System.out.println("For each : ");

        list.forEach(i -> System.out.println(i));
    }
}
