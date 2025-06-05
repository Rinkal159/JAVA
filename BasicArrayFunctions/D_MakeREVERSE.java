package BasicArrayFunctions;

import java.util.Scanner;

public class D_MakeREVERSE {
    public static void printReverse(int[] arr) {
        System.out.println("Reversed array : ");

        int[] emptyArr = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            emptyArr[i] = arr[arr.length-1-i];
        }

        for(int i : emptyArr) {
            System.out.print(i + " ");
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
