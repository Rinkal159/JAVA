package Recursion;

public class P_ReverseArray {
    public static void printReverse(int[] arr, int i) {
        if (i == arr.length / 2) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            return;
        }

        int low = i;
        int high = arr.length - 1 - i;

        int num = arr[low];
        arr[low] = arr[high];
        arr[high] = num;

        printReverse(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        printReverse(arr, 0);

    }
}
