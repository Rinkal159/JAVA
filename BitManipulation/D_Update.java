package BitManipulation;

public class D_Update {
    public static int updateBit(int a, int i) {
        int bitMask = 1 << i;

        if ((bitMask & a) == 0) {  //Get
            return bitMask | a;  //Set
        } else {
            return (~(bitMask)) & a;  //Clear

        }
    }

    public static void main(String[] args) {
        int a = 5;
        int i = 1;

        System.out.println("Number after updating a bit : " + (updateBit(a, i)));

    }
}
