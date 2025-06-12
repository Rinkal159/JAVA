package Sorting;

public class A_BubbleSort {
    public static void bubbleSort(int[] arr) {

        // ASCENDING ORDER 

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

        // DESCENDING ORDER 

        // for (int i = arr.length-1; i >= 0; i--) {
        //     for (int j = arr.length-1; j > arr.length-1-i; j--) {

        //         if (arr[j] > arr[j - 1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j - 1];
        //             arr[j - 1] = temp;
        //         }

        //     }
        // }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 5, 1, 3, 2 };

        bubbleSort(arr);
    }
}
