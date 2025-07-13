package ArrayList;

public class F_PairSumWithourSorted {

    public static int findTargetedPairSum(int[] arr, int target, int low, int high) {
        while (low < high) {
            if ((arr[low] + arr[high]) == target) {
                System.out.println(arr[low] + "," + arr[high]);
                return 1;
            } else {
                if (arr[low] < arr[high]) {
                    low++;
                } else {
                    high--;
                }
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 6, 5, 3, 1 };
        int target = 8;
        int low = 0;
        int high = arr.length - 1;

        int result = findTargetedPairSum(arr, target, low, high);

        if (result < 0) {
            System.out.println("None pairs sums " + target);
        }
    }
}
