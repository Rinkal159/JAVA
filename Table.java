import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Number : ");
        int n = x.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}