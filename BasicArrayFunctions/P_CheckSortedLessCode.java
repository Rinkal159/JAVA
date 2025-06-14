package BasicArrayFunctions;

public class P_CheckSortedLessCode {
    public static Boolean checkASorted(int[] arr) {
        int count = 0;
        for (int i=0; i<arr.length-1; i++) {
            if(arr[i] < arr[i+1]) {
                count++;
            }
        }

        if(count == arr.length-1) {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr = {3, 30, 67, 100, 100};

        System.out.println(checkASorted(arr));
    }
}
