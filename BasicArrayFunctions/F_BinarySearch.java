package BasicArrayFunctions;
import java.util.*;

public class F_BinarySearch {
    public static int binarySearch(int[] arr, int a) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a == arr[mid]) {
                return mid;
            } else if (a < arr[mid]) {
                high = mid - 1;
            } else if (a > arr[mid]) {
                low = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 100, 20, 30, 4, 5, 23, 25 };
        int a = 100;

        Arrays.sort(arr);

        int result = binarySearch(arr, a);

        if (result == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number is at index " + result);

        }
    }
}