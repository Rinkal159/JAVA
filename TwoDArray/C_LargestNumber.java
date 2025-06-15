package TwoDArray;

public class C_LargestNumber {
    public static int printLarget(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                max = Math.max(max, arr[i][j]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 18 },
                { 4, 5, 6, 7, 8 }
        };

        System.out.println("Largest number : " + printLarget(arr));
    }
}
