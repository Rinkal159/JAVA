package BasicArrayFunctions;

public class J_KadanesAlgoForMaxSum {
    public static void primtMaxSum(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (sum < 0) {
                sum = 0;
            }
            sum += arr[i];
            max = Math.max(sum, max);

        }

        System.out.println("Max sum of subarrays : " + max);
    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

        primtMaxSum(arr);
    }
}
