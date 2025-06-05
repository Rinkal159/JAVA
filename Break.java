import java.util.*;

public class Break {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("DIGIT : ");

        while (true) {
            int i = x.nextInt();

            if (i == 10) {
                System.out.println("hurrey!! input matched the expected digit : 10");
                break;
            }
        }
    }
}