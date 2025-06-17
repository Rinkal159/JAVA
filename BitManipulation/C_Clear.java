package BitManipulation;

public class C_Clear {
    public static void clearBit(int a, int i) {
        int bitMask = 1 << i;
        System.out.println("New number after set operation : " + ((~(bitMask)) & a));
    }

    public static void main(String[] args) {
        int a = 5;
        int i = 2;

        clearBit(a, i);

    }
}
