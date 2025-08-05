package Divide_and_Conqure;

public class E_Inversion {
    public static void invertion(int[] arr, int low, int high, int mid) {
        int i = low;
        int j = mid + 1;

        if (i <= mid || j < high) {
            System.out.println("i : " + i);
            System.out.println("j : " + j);
            if (i > mid) {
                j++;
                i = low;
            }
            if (arr[i] > arr[j]) {
                System.out.println(arr[i] + "," + arr[j]);
                i++;
            } else {
                i++;
            }
        }
    }

    public static void printInvertion(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        printInvertion(arr, low, mid);
        printInvertion(arr, mid + 1, high);

        invertion(arr, low, high, mid);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 5 };
        int low = 0;
        int high = arr.length - 1;

        printInvertion(arr, low, high);

    }
}
