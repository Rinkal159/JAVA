import java.util.*;
public class Calculator {

    public static void printResult(int a, int b, int c) {
        switch (c) {
            case 1:
                System.out.println("Addition result is " + (a+b));
                break;
            case 2:
                System.out.println("Substraction result is " + (a-b));
                break;
            case 3:
                System.out.println("Multiplication result is " + (a*b));
                break;
            case 4:
                System.out.println("Division result is " + (a/b));
                break;
            case 5:
                System.out.println("Reminder result is " + (a%b));
                break;
            case 6:
                System.out.println("Addition result is " + (a+b));
                System.out.println("Substraction result is " + (a-b));
                System.out.println("Multiplication result is " + (a*b));
                System.out.println("Division result is " + (a/b));
                System.out.println("Reminder result is " + (a%b));
                break;
        
            default:
            System.out.println("invalid command");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = x.nextInt();
        System.out.print("Enter b : ");
        int b = x.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Reminder");
        System.out.println("6. All");

        System.out.print("Enter a valid series number to perform that respected operation : ");
        int command = x.nextInt();

        printResult(a, b, command);

    }
}
