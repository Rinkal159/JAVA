package BasicArrayFunctions;

import java.util.Scanner;

public class D_MakeREVERSE {
    public static void printReverse(int[] arr) {
        for (int i=0; i<arr.length/2; i++){
            int left = i; 
            int right = arr.length-1-i;

            int leftNum = arr[left];
            int rightNum = arr[right];

            arr[left] = rightNum;
            arr[right] = leftNum;
        }

        System.out.println("Reversed array : ");

        for (int num : arr) {
            System.out.print(num + " ");
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
    }
}
