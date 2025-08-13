package BasicArrayFunctions;

import java.util.Scanner;

public class C_PrintREVERSE {

    public static void printReverse(int[] arr) {
        System.out.println("Reversed array : ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Size of the array : ");
        int size = x.nextInt();

        int[] arr = new int[size];

        System.out.println("Elements : ");

        for (int i = 0; i < size; i++) {
            arr[i] = x.nextInt();
        }

        printReverse(arr);

        x.close();
    }
}
