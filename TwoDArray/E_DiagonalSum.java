package TwoDArray;

public class E_DiagonalSum {
    public static void printSum(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length) {
                System.out.println("Row length must be equal to column length");
                return;
            }
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            
            // primary diagonal
            sum += arr[i][i];

            if (i != arr.length - 1 - i) {
                // secondary diagonal
                sum += arr[i][arr.length - 1 - i];

            }

        }
        System.out.println("Sum of both diagonals : " + sum);
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 0, 1, 2 },
                { 3, 4, 5 },
                { 6, 7, 8 }
        };

        printSum(arr);
    }
}
