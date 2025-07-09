package Divide_and_Conqure;

import java.util.ArrayList;

public class D_MergeSortOnStrings {
    public static void merge(String[] arr, int low, int high, int mid) {
        int left = low;
        int right = mid + 1;

        ArrayList<String> temp = new ArrayList<>(arr.length);

        while (left <= mid && right <= high) {
            if (arr[left].compareTo(arr[right]) <= 0) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        for (int i = 0; i < temp.size(); i++) {
            arr[low + i] = temp.get(i);
        }
    }

    public static void mergeSort(String[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, high, mid);
    }

    public static void main(String[] args) {
        String[] arr = { "margi", "mamata", "mohan", "mahendra" };
        int low = 0;
        int high = arr.length - 1;

        mergeSort(arr, low, high);

        for(String i : arr) {
            System.out.print(i + " ");
        }
    }
}
