package BitManipulation;

public class B_Set {
    public static void setBit(int a, int i) {
        int bitMask = 1 << i;
        System.out.println("New number after set operation : " + (bitMask | a));
    }

    public static void main(String[] args) {
        int a = 5;
        int i = 1;

        setBit(a, i);

    }
}
