package BasicArrayFunctions;

import java.util.Arrays;

public class K_TrapRainWater {

    public static int[] leftMax(int[] arr) {
        int[] left = new int[arr.length];
        left[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        return left;
    }

    public static int[] rightMax(int[] arr) {
        int[] right = new int[arr.length];
        right[arr.length - 1] = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }
        return right;
    }

    public static void calcTrapRainWater(int[] left, int[] right, int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = Math.min(left[i], right[i]);
            sum += (min - arr[i]);
        }

        System.out.println("trap rain water : " + sum);
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5 };

        if (arr.length == 1 || arr.length == 2) {
            System.out.println("Array length must be greater than 2");
        } else {
            calcTrapRainWater(leftMax(arr), rightMax(arr), arr);

        }

    }
}
