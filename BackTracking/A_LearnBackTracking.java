package BackTracking;

public class A_LearnBackTracking {
    public static int printNum(int[] arr, int i) {
        if (i == arr.length) {
            return 0;
        }

        arr[i] = i + 1;
        printNum(arr, i + 1);

        return arr[i] -= 2;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        printNum(arr, 0);

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
