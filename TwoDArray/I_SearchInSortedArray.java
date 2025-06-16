package TwoDArray;

/* Time complexity : O(n+m) 
        because we travel from one corner to another, and in array if we travel from one end to other, we always measure one row and one column as a distance.
*/

public class I_SearchInSortedArray {
    public static void sorteArray(int[][] arr, int target) {

        int i = 0;
        int j = arr[0].length - 1;

        while (i < arr.length && j >= 0) {
            int key = arr[i][j];

            if (target == key) {
                System.out.println("Key found at index (" + i + "," + j + ")");
                return;
            } else if (target < key) {
                j--;
            } else if (target > key) {
                i++;
            }
        }

        System.out.println("Key not found!");

    }

    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        int target = 50;

        sorteArray(arr, target);
    }
}
