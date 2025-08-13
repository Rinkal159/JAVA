package BasicArrayFunctions;

import java.util.Scanner;

public class G_Pairs {
    public static void printPairs(int[] arr) {
        int n = 0;

        System.out.println("Possible pairs : ");

        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                System.out.print("[" + arr[i] + "," + arr[j]+ "]" +" ");
                n++;
            }
            System.err.println();
        }

        System.out.println("Total number of pairs : " + n);
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

        printPairs(arr);

        x.close();
    }
}
