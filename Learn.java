import java.util.*;

public class Learn {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("The number : ");
        int a = x.nextInt();
        int rem = 0;
        int count = 0; b   

        while (a > 0) {
            rem = a % 10;
            a /= 10;
            if (rem % 2 != 0) {
                count++;
            }
        }
        System.out.println("Number of odd digits : " + count);
    }
}