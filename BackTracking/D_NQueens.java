package BackTracking;

// time complexity: O(n!)

public class D_NQueens {
    public static Boolean isSafe(char[][] arr, int row, int col) {

        // vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (arr[i][col] == 'Q') {
                return false;
            }
        }

        // diagonally left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }

        // diagonally right
        for (int i = row - 1, j = col + 1; i >= 0 && j < arr.length; i--, j++) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static int count = 0;

    public static void nQueens(char[][] arr, int row) {

        if (row == arr.length) {

            printBoard(arr);
            System.out.println();

            count++;
            return;
        }

        // cols
        for (int j = 0; j < arr.length; j++) {

            if (isSafe(arr, row, j)) {
                arr[row][j] = 'Q';
                nQueens(arr, row + 1); //recursion //one queen per row, so when queen placed in row, the row will move forward.

                arr[row][j] = '-'; //backtracking

            }
        }

    }

    // print board
    public static void printBoard(char[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;

        char[][] arr = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = '-';
            }
        }

        System.out.println("BOARD : ");
        nQueens(arr, 0);
        System.out.println("count : " + count);
    }
}