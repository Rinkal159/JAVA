package Recursion;

public class F_TowerOfHanoi {
    public static void printTowr(int n, char s, char h, char d) {
        if (n == 1) {
            System.out.println("Disk tranferrred " + n + " from " + s + " to " + d);
            return;
        }
        printTowr(n - 1, s, d, h);
        System.out.println("Disk tranferrred " + n + " from " + s + " to " + d);
        printTowr(n - 1, h, s, d);

    }

    public static void main(String[] args) {
        int n = 3;

        printTowr(n, 's', 'h', 'd');
    }
}
