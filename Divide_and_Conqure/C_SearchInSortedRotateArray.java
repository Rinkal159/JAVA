package Divide_and_Conqure;

public class C_SearchInSortedRotateArray {
    public static int search(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[low] < arr[mid]) {
            if ((target < arr[mid] && target < arr[low]) || (target > arr[mid] && target > arr[low])) {
                return search(arr, target, mid + 1, high); //right
            } else {
                return search(arr, target, low, mid - 1); //left
            }
        }
        if (arr[low] > arr[mid]) {
            if ((target < arr[mid] && target <= arr[low]) || (target > arr[mid] && target >= arr[low])) {
                return search(arr, target, low, mid - 1); //left
            } else {
                return search(arr, target, mid + 1, high); //right
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 0, 1, 2, 3};
        int target = 2;
        int low = 0;
        int high = arr.length - 1;

        System.out.println("Target is at index : " + search(arr, target, low, high));

    }
}
