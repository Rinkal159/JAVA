package BasicArrayFunctions;

public class M_CheckTwiceElements {
    public static Boolean checkTwice(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 14, 10, 2, 11, 4 };

        System.out.println(checkTwice(arr));

    }
}
