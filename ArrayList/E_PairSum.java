package ArrayList;

public class E_PairSum {
    public static void main(String[] args) {
        int[] arr = { 7, 3, 1, 4, 5 };
        int target = 5;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target) {
                    System.out.println(arr[i] + "," + arr[j]);
                    return;
                }
            }
        }
    }
}
