package BasicArrayFunctions;

public class O_SearchInSortedRotatedArray {
    public static int searchTarget(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;

            } else if (arr[low] < arr[mid]) {

                // if low is less, first condition will go to right

                if ((target > arr[mid] && target > arr[low]) || (target < arr[mid] && target < arr[low])) {
                    low = mid + 1; // to right
                } else {
                    high = mid - 1; // to left
                }

            } else if (arr[low] > arr[mid]) {

                // if low is graeter then first condition will go to left.

                if ((target > arr[mid] && target >= arr[low]) || (target < arr[mid] && target <= arr[low])) {
                    high = mid - 1; // to left
                } else {
                    low = mid + 1; // to right
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        System.out.println("Target is at index: " + searchTarget(arr, target));
    }
}
