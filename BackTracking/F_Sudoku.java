package BackTracking;

public class F_Sudoku {
    public static boolean isSafe(int[][] arr, int row, int col, int num) {

        // horizontal
        for (int i = 0; i < arr.length; i++) {
            if (arr[row][i] == num) {
                return false;
            }
        }

        // vertical
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] == num) {
                return false;
            }
        }

        // box

        int startingRow = (row / 3) * 3;
        int startingCol = (col / 3) * 3;

        for (int i = startingRow; i < startingRow + 3; i++) {
            for (int j = startingCol; j < startingCol + 3; j++) {
                if (arr[i][j] == num) {
                    return false;
                }
            }
        }

        return true;

    }

    public static boolean sudoku(int[][] arr, int row, int col) {

        // base case
        if (row == arr.length) {
            return true;
        }

        int newRow = row, newCol = col + 1;
        if (col + 1 == arr.length) {
            newRow = row + 1;
            newCol = 0;
        }

        // skip if it is not zero
        if (arr[row][col] != 0) {
            return sudoku(arr, newRow, newCol);
        }

        // num
        for (int num = 1; num <= arr.length; num++) {

            if (isSafe(arr, row, col, num)) {
                arr[row][col] = num;
                if (sudoku(arr, newRow, newCol)) {
                    return true;
                }
                arr[row][col] = 0;
            }
        }

        return false;
    }

    // print sudoku
    public static void printSudoku(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };

        if (sudoku(arr, 0, 0)) {
            System.out.println("The solution : ");
            printSudoku(arr);
        } else {
            System.out.println("Solution does't exist");
        }
    }
}
