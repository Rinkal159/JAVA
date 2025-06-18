package BitManipulation;

public class I_CountSetBits {
    public static int countSet(int n) {
        int count = 0;
        while (n != 0) {
            if ((1 & n) == 1) {
                count++;
            }
            n = n >> 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 4567;

        System.out.println("Count of set bits : " + countSet(n));
    }
}
