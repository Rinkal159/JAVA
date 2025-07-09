package Divide_and_Conqure;

import java.util.ArrayList;

public class A_MergeSort {

    public static void merge(int[] arr, int low, int high, int mid) {
        ArrayList<Integer> temp = new ArrayList<>(5);
        
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;

            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;

        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;

        }

        for (int i = 0; i < temp.size(); i++) {
            arr[low + i] = temp.get(i);
        }

    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, high, mid);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 3,1,7, 10 };
        int low = 0;
        int high = arr.length - 1;

        mergeSort(arr, low, high);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
