package BasicArrayFunctions;

import java.util.Scanner;

public class I_SubArraysSum {
    public static void subArrays(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
            }
            max = Math.max(sum, max);
        }

        System.out.println("Maximum sum of subArray : " + max);
    }

    public static void main(String[] args) {
        // Scanner x = new Scanner(System.in);
        // System.out.print("Size of the array : ");
        // int size = x.nextInt();

        // int[] arr = new int[size];

        // System.out.println("Elements : ");

        // for (int i = 0; i < size; i++) {
        // arr[i] = x.nextInt();
        // }

        int[] arr = { 2, 4, 6, 8, 10 };

        subArrays(arr);
    }
}
