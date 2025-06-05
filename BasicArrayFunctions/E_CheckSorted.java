package BasicArrayFunctions;

import java.util.Scanner;

public class E_CheckSorted {

    public static Boolean isSorted(int[] arr) {

        Boolean isAscending = false;
        Boolean isDescending = false;
        
        for (int i = 0; i < arr.length - 1; i++) {

            int diff = arr[i] - arr[i + 1];

            if (diff < 0) {
                if (isDescending) {
                    return false;
                }
                isAscending = true;

            } else if (diff > 0) {
                if (isAscending) {
                    return false;
                }
                isDescending = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Size of the array : ");
        int size = x.nextInt();

        int[] arr = new int[size];

        System.out.println("Elements : ");

        for (int i = 0; i < size; i++) {
            arr[i] = x.nextInt();
        }

        System.out.println("Sorted : " + isSorted(arr));
    }
}
