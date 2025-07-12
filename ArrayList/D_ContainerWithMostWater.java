package ArrayList;

public class D_ContainerWithMostWater {
    public static int leftMax(int[] arr, int mid) {
        int max = arr[0];
        for (int i = 1; i < mid; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static int rightMax(int[] arr, int mid) {
        int max = arr[mid + 1];

        for (int i = mid + 2; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static int calcLeftRight(int[] arr, int mid) {
        int left = leftMax(arr, mid);
        int right = rightMax(arr, mid);

        if (arr[mid] > Math.max(left, right)) {
            if (left < right) {
                left = arr[mid];
            } else {
                right = arr[mid];
            }
        } else if (arr[mid] > left && arr[mid] < right) {
            left = arr[mid];
        } else if (arr[mid] > right && arr[mid] < left) {
            right = arr[mid];
        }

        // new left and right
        int newLeft = left;
        int newRight = right;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > newLeft && arr[i] != newRight) {
                newLeft = arr[i];
            }
            if (arr[i] > newRight && arr[i] != newLeft) {
                newRight = arr[i];
            }
        }

        // find
        int first = -1;
        int second = -1;
        int newFirst = -1;
        int newSecond = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == left) {
                first = i;
            }
            if(arr[i] == right) {
                second = i;
            }
            if(arr[i] == newLeft) {
                newFirst = i;
            }
            if(arr[i] == newRight) {
                newSecond = i;
            }
        }

        int width = Math.abs((first-second));
        int height = Math.min(left, right);

        int newWidth = Math.abs((newFirst-newSecond));
        int newHeight = Math.min(newLeft, newRight);

        return Math.max((width*height), (newWidth*newHeight));
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 10, 6, 11};
        int mid = (0 + arr.length) / 2;

        System.out.println(calcLeftRight(arr, mid));

    }
}
