package BasicArrayFunctions;

import java.util.Scanner;

public class A_Sum {

    public static int printSum(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        return sum;
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

        System.out.println("Sum of elements : " + printSum(arr));

        x.close();
    } 
}
