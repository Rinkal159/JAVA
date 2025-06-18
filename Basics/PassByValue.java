package Basics;
public class PassByValue {
    public static int printMulty(int a) {
        return a*=2;
    }
    public static void main(String[] args) {
        int a = 2;

        System.out.println(printMulty(a));
        System.out.println(a);
    }
}