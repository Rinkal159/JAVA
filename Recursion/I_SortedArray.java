package Recursion;

public class I_SortedArray {
    public static Boolean isAscending = false;
    public static Boolean isDescending = false;

    public static Boolean isSorted(int[] arr, int i) {

        if (i >= arr.length - 1) {
            return true;
        }

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
        } else {
            return false;
        }

        return isSorted(arr, i + 1);

    }

    public static void main(String[] args) {
        int[] arr = { 2, 14, 18, 190, 191 };

        System.out.println(isSorted(arr, 0));

    }
}
