package BasicArrayFunctions;

import java.util.Scanner;

public class H_SubArrays {
    public static void subArrays(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int k = i; k < arr.length; k++) {

                for (int j = i; j <= k; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();

            }
            System.out.println();
        }

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
