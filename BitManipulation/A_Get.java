package BitManipulation;

public class A_Get {
    public static int getBit(int a, int i) {
        if (((1 << i) & a) != 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int i = 1;

        System.out.println("Numbers at position i is " + getBit(a, i));

    }
}
