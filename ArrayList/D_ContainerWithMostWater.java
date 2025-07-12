package ArrayList;

public class D_ContainerWithMostWater {
    public static int findMax(int[] arr) {
        int max = arr[0];
        int maxIdx = -1;
        for (int i = 1; i < arr.length; i++) {
            // max = Math.max(arr[i], max);
            if (arr[i] > max) {
                max= arr[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    public static int findMaxWater(int[] arr) {
        int maxIdx = findMax(arr);
        int maxArea = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            maxArea = Math.max(maxArea, (arr[i] * Math.abs(maxIdx - i)));
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 140, 500, 30, 20, 150, 90 };
        System.out.println(findMaxWater(arr));
    }
}
