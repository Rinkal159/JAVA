package Divide_and_Conqure;

// time complexity : O(log n)
// space complexity : O(1)

// worst case time complexity : O(n^2) when the pivot is always the smallest or always the larget among the rest elements.

public class B_QuickSort {

    public static int getPartition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low; // should always greater than pivot
        int j = high; // should always lesser than pivot

        while (i < j) {
            // increment i if it is less beacuse we want greater i
            while (arr[i] <= pivot && i < high) {
                i++;
            }

            // decrement j if it is greater beacuse we want lesser j
            while (arr[j] >= pivot && j > low) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = getPartition(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 2, 5, 7, 9, 1, 3 };
        int low = 0;
        int high = arr.length - 1;

        quickSort(arr, low, high);
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
