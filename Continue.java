import java.util.*;

public class Continue {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("digit : ");

        while(true) {
            int i = x.nextInt();

            if(i%10==0) {
                System.out.println("Multiples of 10 are not allowed");
                continue;
            }
        }
    }
}