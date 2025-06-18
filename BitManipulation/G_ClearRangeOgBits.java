package BitManipulation;

public class G_ClearRangeOgBits {
    public static void ClearRange(int n, int i, int j) {
        int orOne = -1 << i+1;
        int orTwo = ~(-1 << j);

        int bitMask = orOne | orTwo;

        System.out.println(bitMask & n);
    }
    public static void main(String[] args) {
        int n = 234;
        int i=6;
        int j= 4;

        ClearRange(n, i, j);
    }
}
