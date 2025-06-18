package Basics;
public class PassByReference {
    public static int printMulty(int[] arr) {
        return arr[0]*=2;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(printMulty(arr));
        System.out.println(arr[0]);
    }
}