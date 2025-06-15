package TwoDArray;

public class H_Transpose {
    public static void printTranspose(int[][] arr) {
        int[][] newArr = new int[arr[0].length][arr.length];

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                newArr[i][j] = arr[j][i];
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 11, 12, 13 },
                { 21, 22, 23 }
        };

        printTranspose(arr);
    }
}
