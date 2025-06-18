package Basics;
public class GreatestOfThree {
    public static void main(String[] args) {
        int a = 16;
        int b = 16;
        int c = 12;

        if (a > b && a > c) {
            System.out.println("a");
        } else if (a == b && a > c) {
            System.out.println("a and b");
        } else if (a == c && a > b) {
            System.out.println("a and c");
        } else if (b > c) {
            System.out.println("b");
        } else if (b == c && b > a) {
            System.out.println("b and c");
        } else if (c > b) {
            System.out.println("c");
        } else {
            System.out.println("none");
        }
    }
}