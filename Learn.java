public class Learn {
    public static String emptystr = "";

    public static void homework(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] < arr[j]) {
                    min = j;
                    count++;
                }

            }
            if (count == arr.length - 1) {
                System.out.println("already sorted!");
                return;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        homework(arr);
    }
}