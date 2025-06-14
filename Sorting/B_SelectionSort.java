package Sorting;

public class B_SelectionSort {
    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[min] < arr[j]) {
                    min = j;
                } else {
                    count++;
                }

            }

            if(count == arr.length-1) {
                System.out.println("Array is already sorted!");
                return;
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

         
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 6, 3, 2, 10 };

        selectionSort(arr);
    }
}
