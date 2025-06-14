package Sorting;

public class A_BubbleSort {
    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int count = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else {
                    count++;
                }

            }
            if (count == arr.length - 1) {
                System.out.println("array is sorted already!");
                return;
            }

        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 11, 14, 44, 45 };

        bubbleSort(arr);
    }
}
