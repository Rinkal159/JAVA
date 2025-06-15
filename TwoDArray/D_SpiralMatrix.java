package TwoDArray;

public class D_SpiralMatrix {
    public static void printSpiral(int[][] arr) {
        int startRow = 0;
        int endRow = arr.length - 1;
        int startCol = 0;
        int endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // top line (col)
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }

            // right line (row)
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }

            // bottom line (col)
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(arr[endRow][j] + " ");
            }

            // left line (row)
            for (int i = endRow - 1; i > startRow; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[i][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;

        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };

        printSpiral(arr);
    }
}
