package ArrayList;

public class E_PairSum {
    public static int findTargetedPairSum(int[] arr, int target, int low, int high) {
        while (low < high) {
            if ((arr[low] + arr[high]) == target) {
                System.out.println(arr[low] + "," + arr[high]);
                return 1;
            }
            if ((arr[low] + arr[high]) < target) {
                low++;
            } else {
                high--;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int target = 7;
        int low = 0;
        int high = arr.length - 1;

        int result = findTargetedPairSum(arr, target, low, high);

        if(result < 0) {
            System.out.println("None pairs sums " + target);
        }
    }
}
