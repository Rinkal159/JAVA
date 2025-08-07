package BasicArrayFunctions;

import java.util.Scanner;

public class E_CheckSorted {
    public static Boolean isAscending = false;
    public static Boolean isDescending = false;

    public static Boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i + 1] > arr[i]) {
                if (isDescending) {
                    return false;
                }
                isAscending = true;

            } else if (arr[i + 1] < arr[i]) {
                if (isAscending) {
                    return false;
                }
                isDescending = true;
            } else {
                return false;
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
