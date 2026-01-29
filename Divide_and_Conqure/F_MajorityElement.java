package Divide_and_Conqure;

public class F_MajorityElement {

    public static int majorityCount(int[] arr, int num, int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (arr[i] == num) {
                count++;
            }
        }

        return count;
    }

    public static int majoritySearch(int[] arr, int low, int high) {
        if (low >= high) {
            return arr[low];
        }

        int mid = (low + high) / 2;
        int left = majoritySearch(arr, low, mid);
        int right = majoritySearch(arr, mid + 1, high);

        if (left == right) {
            return left;
        }

        int leftCount = majorityCount(arr, left, low, high);
        int rightCount = majorityCount(arr, right, low, high);

        return leftCount > rightCount ? left : right;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 3 };

        System.out.println(majoritySearch(arr, 0, arr.length - 1));
    }
}
