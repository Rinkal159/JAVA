package BitManipulation;

public class D_Update {
    public static int updateBit(int a, int i) {

        //outdated approach

        // int bitMask = 1 << i;

        // if ((bitMask & a) == 0) { //Get
        // return bitMask | a; //Set
        // } else {
        // return (~(bitMask)) & a; //Clear

        // }

        return ((1 << i) ^ a);  //XOR approach
    }

    public static void main(String[] args) {
        int a = 5;
        int i = 0;

        System.out.println("Number after updating a bit : " + (updateBit(a, i)));

    }
}
