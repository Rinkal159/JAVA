import java.util.*;

public class SumOddAndEven {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Length of array : ");
        int length = x.nextInt();

        int[] arr = new int[length];

        System.out.println("The numbers : ");

        for (int i = 0; i < length; i++) {
            arr[i] = x.nextInt();
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        System.out.println("Sum of even numbers of array : " + evenSum);
        System.out.println("Sum of odd numbers of array : " + oddSum);

    }
}