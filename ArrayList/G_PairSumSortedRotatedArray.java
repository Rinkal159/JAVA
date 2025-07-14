package ArrayList;

public class G_PairSumSortedRotatedArray {
    public static int pairSum(int[] arr, int target) {
        int left = -1;
        int right = -1;

        // breaking point
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                right = i;
                left = i + 1;
                break;
            }
        }

        while (left != right) {
            if (arr[left] + arr[right] == target) {
                System.out.println(arr[left] + "," + arr[right]);
                return 1;
            }

            if (arr[left] + arr[right] < target) {
                left = (left + 1) % arr.length; // left++
            } else {
                right = (arr.length + right - 1) % arr.length; // right--
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };
        int target = 5;

        int result = pairSum(arr, target);
        if (result < 0) {
            System.out.println("Not found!");
        }
    }
}
