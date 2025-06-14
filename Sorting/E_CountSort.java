package Sorting;

public class E_CountSort {
    public static void countSort(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }

        int[] emptyArr = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            emptyArr[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < emptyArr.length; i++) {
            while (emptyArr[i] > 0) {
                arr[j] = i;
                j++;
                emptyArr[i]--;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 1, 3, 2, 4, 3, 7 };

        countSort(arr);
    }

}
