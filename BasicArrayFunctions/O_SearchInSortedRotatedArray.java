package BasicArrayFunctions;

public class O_SearchInSortedRotatedArray {
    public static int searchTarget(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;

            } else if (arr[low] <= arr[mid]) {

                // if low is less, then target must be greater than both OR lesser than both.

                if ((target > arr[mid] && target > arr[low]) || (target < arr[mid] && target < arr[low])) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            } else if (arr[low] >= arr[mid]) {

                // if low is graeter then target must be greater than mid but lesser than low.

                if (target > arr[mid] && target < arr[low]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 3, 1, 2 };
        int target = 3;

        System.out.println("Target is at index: " + searchTarget(arr, target));
    }
}
