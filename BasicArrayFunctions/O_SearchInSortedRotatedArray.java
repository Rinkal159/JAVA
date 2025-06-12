package BasicArrayFunctions;

public class O_SearchInSortedRotatedArray {
    public static int searchTarget(int[] arr,int target) {
        int low = 0;
        int high = arr.length-1;

        while(low < high) {
            int mid = (low + high)/2;

            if(arr[mid] == target) {
                return mid;

            } else if(arr[low] <= arr[mid]) {   //if arr[low] is less than mid than the target must be greater than both the mid and the low, then after only we will forward to right part else we will shift to left part.

                //if low is less than target must be greater than both.

                if(target > arr[mid] && target > arr[low]) {
                    low = mid + 1;
                } else {
                    high = mid-1;
                }

            } else if(arr[low]>= arr[mid]) {   //if arr[low] is greater than mid than the target must be greater than mid but lesser than low, then after only we will forward to right part else we will shift to left part.

                //if low is graeter then target must be greater than mid but lesser than low.

                if(target > arr[mid] && target < arr[low]) {
                    low = mid + 1;
                } else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 5};
        int target = 1;

        System.out.println(searchTarget(arr, target));
    }
}
