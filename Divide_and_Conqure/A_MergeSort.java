package Divide_and_Conqure;

import java.util.ArrayList;

public class A_MergeSort {

    public static void merge(int[] arr, int low, int high, int mid) {
        ArrayList<Integer> temp = new ArrayList<>();
        
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

        System.out.println("temp: " + temp);

        for (int i = 0; i < temp.size(); i++) {
            arr[low + i] = temp.get(i);
        }

    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        System.out.println("low : " + low);
        System.out.println("high : " + high);
        System.out.println("mid : " + mid);
        mergeSort(arr, low, mid);

        System.out.println("after low : " + low);
        System.out.println("after high : " + high);
        System.out.println("after mid : " + mid);
        mergeSort(arr, mid + 1, high);

        System.out.println("after to after low : " + low);
        System.out.println("after to after high : " + high);
        System.out.println("after to after mid : " + mid);
        merge(arr, low, high, mid);
    }

    public static void main(String[] args) {
        int[] arr = { 6,3,9,5,2,8 };
        int low = 0;
        int high = arr.length - 1;

        mergeSort(arr, low, high);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
