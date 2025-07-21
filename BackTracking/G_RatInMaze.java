package BackTracking;

public class G_RatInMaze {

    public static boolean isSafe(int[][] arr, int i, int j) {
        return (i >= 0 && j >= 0 && j < arr.length && i < arr.length && arr[i][j] == 1 //most important
        );
    }

    // all recursion and backtracking part
    public static boolean safeForward(int[][] arr, int i, int j, int[][] newArr) {
        int n = arr.length;
        if (i == n - 1 && j == n - 1 && arr[i][j] == 1) {
            newArr[i][j] = 1;
            return true;
        }

        // if it is false then column will increase
        if(isSafe(arr, i, j)) {
            if(newArr[i][j] == 1) {
                return false;
            }
            newArr[i][j] = 1;

            if(safeForward(arr, i+1, j, newArr)) {
                return true;
            }

            // most important debugging steps to understand the logic
            System.out.println("i : " + i);
            System.out.println("j : " + j);

            if(safeForward(arr, i, j+1, newArr)) {
                return true;
            }
            
            newArr[i][j] = 0;
        }

        return false;
    }

    public static void maze(int[][] arr, int i, int j) {
        int n = arr.length;

        int[][] newArr = new int[n][n];

        if(!safeForward(arr, i, j, newArr)) {
            System.out.println("solution doen't exist");
        }
        printMaze(newArr);
    }

    public static void printMaze(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
                arr[i][j] = 0;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };

        maze(arr, 0, 0);
    }
}
