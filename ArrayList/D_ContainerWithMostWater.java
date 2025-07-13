package ArrayList;

public class D_ContainerWithMostWater {

    public static int findMaxWater(int[] arr, int left, int right) {
        int maxArea = Integer.MIN_VALUE;
        while (left < right) {
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;

            maxArea = Math.max(maxArea, (height * width));

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }

        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 140, 500, 30, 20, 150, 90 };
        int left = 0;
        int right = arr.length - 1;

        System.out.println(findMaxWater(arr, left, right));
    }
}
