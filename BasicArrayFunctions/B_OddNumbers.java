package BasicArrayFunctions;

import java.util.Scanner;

public class B_OddNumbers {
    public static int printSum(int[] arr) {
        int count = 0;

        for (int i : arr) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
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

        System.out.println("Odd elements : " + printSum(arr));

        x.close();
    }
}
