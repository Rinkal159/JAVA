package TwoDArray;

import java.util.Scanner;

public class B_InputAndSearch {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Count of row : ");
        int row = x.nextInt();
        System.out.print("Count of column : ");
        int cols = x.nextInt();

        int[][] arr = new int[row][cols];

        System.out.println("Elements : ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = x.nextInt();
            }
        }

        System.out.print("Target : ");
        int a = x.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (a == arr[i][j]) {
                    System.out.println(a + " found at index (" + i + "," + j + ")");
                }
            }
        }

        x.close();
    }
}
